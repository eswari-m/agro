package com.jsp.Argo_boot_4.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jsp.Argo_boot_4.util.ResponseStructure;

@RestControllerAdvice
public class ExceptionHandlerForUser {
	
	
//		======================================================================================
		@ExceptionHandler(EmailAlreadyRegistered.class)
		public ResponseEntity<ResponseStructure<String>> handleExistEmail(EmailAlreadyRegistered e){
			ResponseStructure<String> rs=new ResponseStructure<String>();
			rs.setData(e.getMessage());
			rs.setStatus(HttpStatus.CONFLICT.value());
			rs.setMessage("Please try to login or enter another email!!");
			return new ResponseEntity<ResponseStructure<String>>(rs,HttpStatus.CONFLICT);
		}
		
	//===========================================================================================
		
//		======================================================================================
		@ExceptionHandler(EmailNotFound.class)
		public ResponseEntity<ResponseStructure<String>> handleIncorrectEmail(EmailNotFound e){
			ResponseStructure<String> rs=new ResponseStructure<String>();
			rs.setData(e.getMessage());
			rs.setStatus(HttpStatus.NOT_FOUND.value());
			rs.setMessage("Incorrect email or please try to register before login!!");
			return new ResponseEntity<ResponseStructure<String>>(rs,HttpStatus.NOT_FOUND);
		}
//		======================================================================================
		
//		=====================================================================================
		@ExceptionHandler(PasswordDoesNotMatch.class)
		public ResponseEntity<ResponseStructure<String>> handleIncorrectPassword(PasswordDoesNotMatch e){
			ResponseStructure<String> rs=new ResponseStructure<String>();
			rs.setData(e.getMessage());
			rs.setStatus(HttpStatus.NOT_FOUND.value());
			rs.setMessage("Incorrect password please try again!!");
			return new ResponseEntity<ResponseStructure<String>>(rs,HttpStatus.NOT_FOUND);

		}
//		======================================================================================

	}




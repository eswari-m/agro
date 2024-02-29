package com.jsp.agro_4.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.jsp.agro_4.util.ResponseStructure;

public class ExceptionHandlerForUser {
	@ExceptionHandler(UserNotFound.class)
	public ResponseEntity<ResponseStructure<String>> userNotFound(UserNotFound e){
		ResponseStructure<String> rs = new ResponseStructure<String>();
		rs.setData("User Not Found");
		rs.setMessage(e.getMessage());
		rs.setStatus(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<ResponseStructure<String>>(rs,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(EmailNotFound.class)
	public ResponseEntity<ResponseStructure<String>> emailNotFound(EmailNotFound e){
		ResponseStructure<String> rs = new ResponseStructure<String>();
		rs.setData("Email Not Found");
		rs.setMessage(e.getMessage());
		rs.setStatus(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<ResponseStructure<String>>(rs,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(passwordDoesNotMatch.class)
	public ResponseEntity<ResponseStructure<String>> passwordNotFound(passwordDoesNotMatch e){
		ResponseStructure<String> rs = new ResponseStructure<String>();
		rs.setData("Password is incorrect");
		rs.setMessage(e.getMessage());
		rs.setStatus(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<ResponseStructure<String>>(rs,HttpStatus.NOT_FOUND);
	}
}

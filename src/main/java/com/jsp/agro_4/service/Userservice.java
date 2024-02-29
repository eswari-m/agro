package com.jsp.agro_4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.jsp.agro_4.dao.Userdao;
import com.jsp.agro_4.entity.User;
import com.jsp.agro_4.exception.UserNotFound;
import com.jsp.agro_4.util.ResponseStructure;


@Service
public class Userservice {
   @Autowired
   private Userdao dao;
   @Autowired
   JavaMailSender mailSender;
   public ResponseEntity<ResponseStructure<User>>saveUser(User user){
	   
	   User data=dao.fetchUserById(user.getId());
	   if(data==null) {
		   User db=dao.saveUser(user);
		   SimpleMailMessage smp=new SimpleMailMessage();
		   smp.setFrom("eshuchowdary2206@gmail.com");
		   smp.setTo(db.getEmail());
		   smp.setSubject("Registration for agro");
		   smp.setText("Thank you"+user.getFirst_Name()+" "+user.getLast_Name()+"for registering");
	   }
	   
	  ResponseStructure<User> m=new ResponseStructure<User>();
	   m.setData(dao.saveUser(user));
	   m.setMessage("User details successfully saved");
	   m.setStatus(HttpStatus.CREATED.value());
	   return new ResponseEntity<ResponseStructure<User>>(m,HttpStatus.CREATED);
   }
   
   
   public ResponseEntity<ResponseStructure<User>>fetchById(int id){
		User db=dao.fetchUserById(id);
		if(db!=null) {
		ResponseStructure<User>m= new ResponseStructure<User>();
		m.setData(db);
		m.setMessage("User details found successfully....!");
		m.setStatus(HttpStatus.FOUND.value());
		return new ResponseEntity<ResponseStructure<User>>(m,HttpStatus.FOUND);
		}
		return null;
	}
	
   public ResponseEntity<ResponseStructure<User>>deleteById(int id){
		User db=dao.deleteUserById(id);
		if(db!=null) {
			ResponseStructure<User> m=new ResponseStructure<User>();
			m.setData(db);
			m.setMessage("User id is deleted");
			m.setStatus(HttpStatus.FOUND.value());
			return new ResponseEntity<ResponseStructure<User>>(m,HttpStatus.FOUND);
		}
		else {
			return null;
		}
	}
	
   public ResponseEntity<ResponseStructure<User>> updateUser(User user) {
		User db = dao.updateUser(user);
		if (db != null) {
			ResponseStructure<User> m = new ResponseStructure<User>();
			m.setData(db);
			m.setMessage("user updated successfully");
			m.setStatus(HttpStatus.FOUND.value());
			return new ResponseEntity<ResponseStructure<User>>(m, HttpStatus.FOUND);
		}
		throw new UserNotFound();
}
   public ResponseEntity<ResponseStructure<List<User>>> fetchAll() {
		List<User> db = dao.fetchAll();
		if (db.size() != 0) {
			ResponseStructure<List<User>> m = new ResponseStructure<List<User>>();
			m.setData(db);
			m.setMessage("user fetched successfully");
			m.setStatus(HttpStatus.FOUND.value());
			return new ResponseEntity<ResponseStructure<List<User>>>(m, HttpStatus.FOUND);
		}
		return null;
	}
}

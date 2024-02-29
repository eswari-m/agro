package com.jsp.agro_4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.agro_4.entity.User;
import com.jsp.agro_4.service.Userservice;
import com.jsp.agro_4.util.ResponseStructure;





@RestController
public class UserController {
     @Autowired
         private Userservice userservice;
     @PostMapping("/register")
     public ResponseEntity<ResponseStructure<User>>saveUser(@RequestBody User user){
    	 return userservice.saveUser(user);
     }
     @GetMapping("/fetch")
     public ResponseEntity<ResponseStructure<User>>fetchById(@RequestParam int id){
    	 return userservice.fetchById(id);
     }
     @DeleteMapping("/delete")
     public ResponseEntity<ResponseStructure<User>>deleteById(@RequestParam int id){
    	 return userservice.deleteById(id);
     }
     
     @PutMapping("/update")
     public ResponseEntity<ResponseStructure<User>>updateMovie(@RequestBody User user){
    	 return userservice.updateUser(user);
     }
     @GetMapping("/fetchAll")
     
 	public ResponseEntity<ResponseStructure<List<User>>> fetchAll() {
 		return userservice.fetchAll();
 	}
}

package com.jsp.agro_4.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.agro_4.entity.User;
import com.jsp.agro_4.repo.UserRepo;







@Repository
public class Userdao {
   @Autowired
    private UserRepo repo;
   
   public User saveUser(User user) {
	   return repo.save(user);
   }
   public User fetchUserById(int id) {
	   Optional<User> db=repo.findById(id);
	   if(db.isPresent())
		   return db.get();
	   else
		    return null;
   }
   
   public User deleteUserById(int id) {
	   Optional<User> db=repo.findById(id);
	   if(db.isPresent()) {
		   repo.deleteById(id);
		   return db.get();
	   }
		   
	   else
		    return null;
   }
   
   public User updateUser(User m) {
		Optional<User> db = repo.findById(m.getId());
		if(db.isPresent()) {
			User mdb = db.get();
			if(m.getFirst_Name()==null) {
				m.setFirst_Name(mdb.getFirst_Name());
			}
			if(m.getLast_Name()==null) {
				m.setLast_Name(mdb.getLast_Name());
			}
			if(m.getEmail()==null) {
				m.setEmail(mdb.getEmail());
			}
			if(m.getPhno()==0) {
				m.setPhno(mdb.getPhno());
			}
			if(m.getPwd()==null) {
				m.setPwd(mdb.getPwd());
			}
			if(m.getAge()==0) {
				m.setAge(mdb.getAge());
			}
			if(m.getAddress()==null) {
				m.setAddress(mdb.getAddress());
			}
			if(m.getType()==null) {
				m.setType(mdb.getType());
			}
			
			return repo.save(m);
			
			
		}
		else {
			return null;
		}
		
		 
}
   public List<User> fetchAll() {
		return repo.findAll();
	}
}

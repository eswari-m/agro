package com.jsp.Argo_boot_4.dao;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.Argo_boot_4.entity.User;
import com.jsp.Argo_boot_4.repo.UserRepo;


@Repository
public class UserDao {
	@Autowired
	UserRepo repo;
	
//	-----------------------------------------------------------------------------------
	public User registerUser(User user) {
		System.out.println("register");
		System.out.println(user.getEmail());
		return repo.save(user);
	}
//	---------------------------------------------------------------------------------
	public User updateUser(User user) {
		return repo.save(user);
	}
//	------------------------------------------------------------------------------------
	public User findUserById(int id) {
		Optional<User> s = repo.findById(id);
		if(s.isPresent()) {
			return s.get();
		}
		else {
			return null;
		}
	}
//	------------------------------------------------------------------------------------
	public User deleteUser(int id) {
		Optional<User> data = repo.findById(id);
		repo.deleteById(id);
		
		return data.get();
	}
//	-------------------------------------------------------------------------------
	public User FetchEmail(String email) {
		User data = repo.fetchByEmail(email);
		if(data==null) {
			System.out.println("fetch by email");
			return null;
		}
		else {
			return data;
		}
	}
//	----------------------------------------------------------------------------------
	public List<User> FetchAll(){
		return repo.findAll();
	}
}


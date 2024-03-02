package com.jsp.Argo_boot_4.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jsp.Argo_boot_4.entity.User;



public interface UserRepo extends JpaRepository<User, Integer>{
	
	@Query("select e from User e where email=?1")
	public User fetchByEmail(String email);

}


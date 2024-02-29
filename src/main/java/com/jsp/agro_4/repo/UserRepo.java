package com.jsp.agro_4.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.agro_4.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{
   
}

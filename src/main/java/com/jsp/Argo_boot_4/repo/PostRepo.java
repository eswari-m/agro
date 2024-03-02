package com.jsp.Argo_boot_4.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.Argo_boot_4.entity.Post;

public interface PostRepo extends JpaRepository<Post, Integer> {

}

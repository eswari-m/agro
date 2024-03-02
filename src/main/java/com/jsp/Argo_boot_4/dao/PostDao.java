package com.jsp.Argo_boot_4.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.Argo_boot_4.entity.Post;
import com.jsp.Argo_boot_4.repo.PostRepo;


@Repository
public class PostDao {
   @Autowired
   PostRepo repo;
   public Post save(Post post) {
	   return repo.save(post);
}
}

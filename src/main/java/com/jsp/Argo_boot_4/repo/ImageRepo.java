package com.jsp.Argo_boot_4.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.Argo_boot_4.entity.Image;


public interface ImageRepo extends JpaRepository<Image,Long>{

}

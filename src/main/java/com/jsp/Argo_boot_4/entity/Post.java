package com.jsp.Argo_boot_4.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
@Data
@Entity
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
     @OneToOne(cascade=CascadeType.ALL)
     private Image image;
     private int likes;
     @OneToMany(cascade=CascadeType.ALL)
     private  List<Comments> comment;
     private String caption;
     private String location;
     
}

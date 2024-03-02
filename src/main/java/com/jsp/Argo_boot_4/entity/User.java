package com.jsp.Argo_boot_4.entity;
import java.util.List;

import com.jsp.Argo_boot_4.enums.Usertype;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
@Data
@Entity

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	@Column(unique = true)
	private String email;
	private long phone;
	private String password;
	private String age;
	@Enumerated(EnumType.STRING)
	private Usertype type;
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Post> post;
	@OneToOne(cascade = CascadeType.ALL)
	private Image image;
	
	
}


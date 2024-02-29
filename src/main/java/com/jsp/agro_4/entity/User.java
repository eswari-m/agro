package com.jsp.agro_4.entity;

import com.jsp.agro_4.enums.Usertype;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;
@Data
@Entity
public class User {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)

  private int id;
  private String First_Name;
  private String Last_Name;
  @Column(unique = true)
  private String email;
  private long phno;
  private String pwd;
  private String Gender;
  private int Age;
  private Usertype type;
  @OneToOne(cascade = CascadeType.ALL)
  private Address address;
  
}

package com.jsp.agro_4.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class Address {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   int id;
   String HouseNum;
   String Street;
   String Landmark;
   String Mandal;
   String District;
   String State;
   String Pincode;
   
}

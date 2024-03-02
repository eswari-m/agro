package com.jsp.Argo_boot_4.exception;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@AllArgsConstructor
@NoArgsConstructor
public class EmailNotFound  extends RuntimeException{
	private String message="";
}

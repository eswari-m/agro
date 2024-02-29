package com.jsp.agro_4.util;


import com.jsp.agro_4.entity.User;

import lombok.Data;

@Data
public class ResponseStructure<T> {
	private String message;
	   
	   private int status;
	    private T data;
}

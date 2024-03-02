package com.jsp.Argo_boot_4.util;



import lombok.Data;
@Data
public class ResponseStructure<T> {
	
 
		private String message;
		   
		   private int status;
		    private T data;
	
}

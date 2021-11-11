package com.webMvc.springwemvc.model;

import org.springframework.validation.annotation.Validated;

public class Jedi {
    
	
	private String name;
	private String lastName;

	public Jedi(final String name, final String lastName) {
	  
		this.name = name;
		this.lastName = lastName;
	}
   
	
	
	public Jedi() {
		// TODO Auto-generated constructor stub
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
   
	
	 
}

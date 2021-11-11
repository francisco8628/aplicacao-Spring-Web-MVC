package com.webMvc.springwemvc.model;

public class Jedi {

	private String name;
	private String lastName;

	public Jedi(final String name, final String lastName) {
	  
		this.name = name;
		this.lastName = lastName;
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

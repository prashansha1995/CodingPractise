package com.prashansha.generic;

public class UserTemplate {
	
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public UserTemplate(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

}

package com.prashansha.generic;

public class UserDetails {

	String city;
	String state;
	int age;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public UserDetails(String city, String state, int age) {
		super();
		this.city = city;
		this.state = state;
		this.age = age;
	}
	
}

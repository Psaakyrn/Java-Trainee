package com.dynamic.spring.mvc;

public class User {
	private String username;
	private String password;
	
	public String getUsername() {return username;}
	public String getPassword() {return password;}

	public void setUsername(String _username) {username=_username;}
	public void setPassword(String _password) {password=_password;}
	
	public User() {
		username="";
		password="";
	}
}

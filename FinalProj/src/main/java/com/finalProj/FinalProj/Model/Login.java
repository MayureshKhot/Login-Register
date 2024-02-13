package com.finalProj.FinalProj.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Login { //login //create, both page in same page, we can make different pages if we want.

	@Id
	public String username;// login - get // create - set
	public String password;
	
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Login [username=" + username + ", password=" + password + "]";
	}
	
	
}

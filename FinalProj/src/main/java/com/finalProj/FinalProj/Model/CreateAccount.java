package com.finalProj.FinalProj.Model;

//THIS CLASS IS NOT IN USE
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CreateAccount {

	@Id
	private String username;
	private String password;
	

	public CreateAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CreateAccount [username=" + username + ", password=" + password + ", mobile=" + "]";
	}

	public CreateAccount(String username, String password) {
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

}

package com.codeinteracts.controller;

public class LoginDTO {
	
	private Integer id;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	private String username;
	
	private String password;

	@Override
	public String toString() {
		return "LoginDTO [id=" + id + ", username=" + username + ", password=" + password + "]";
	}
	
	
}

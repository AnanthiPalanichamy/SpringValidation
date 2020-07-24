package com.spring.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class LoginInfo {

	@NotBlank(message=" * must be filled this Box")
	private String username;
	@NotBlank(message=" * must be filled this Box")
	@Email(message="* please enter valid mail id")
	private String mailid;
	@NotBlank(message=" * must be filled this Box")
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginInfo [username=" + username + ", mailid=" + mailid + ", password=" + password + "]";
	}

}

package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserInfo 
{
	@Id
	@GeneratedValue
	private int userID;
	private String username;
	private String password;
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
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
	public UserInfo(int userID, String username, String password) {
		super();
		this.userID = userID;
		this.username = username;
		this.password = password;
	}
	public UserInfo() {
		super();
	}
	@Override
	public String toString() {
		return "UserInfo [userID=" + userID + ", username=" + username + ", password=" + password + "]";
	}
	
	
}

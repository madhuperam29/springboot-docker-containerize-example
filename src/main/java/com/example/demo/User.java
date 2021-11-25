package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(notes = "The database generated user ID")
	private int id;
	
	public User() {
		super();
	}
	@ApiModelProperty(notes = "The name of the user")
	private String userName;
	@ApiModelProperty(notes = "The email ID  of the user")
	private String emailId;
	@ApiModelProperty(notes = "The balance of the user")
	private double totalBalance;
	public int getId() {
		return id;
	}
	public User(int id, String userName, String emailId, double totalBalance) {
		//super();
		this.id = id;
		this.userName = userName;
		this.emailId = emailId;
		this.totalBalance = totalBalance;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public double getTotalBalance() {
		return totalBalance;
	}
	public void setTotalBalance(double totalBalance) {
		this.totalBalance = totalBalance;
	}
	
	

}

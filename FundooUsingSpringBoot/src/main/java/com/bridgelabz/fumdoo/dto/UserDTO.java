package com.bridgelabz.fumdoo.dto;

import java.io.Serializable;


public class UserDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String firstName;
	
	private String lastName;
	
	
	private String emailId;
	
//@Pattern(regexp = "[7-9] {1}[0-9]{9}", message = "Enter 10-digit mobile number") // ^[7-9][0-9]{9}$
	private String mobileNum;
	
	
	private String password;


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getMobileNum() {
		return mobileNum;
	}


	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "UserDTO [firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId + ", mobileNum="
				+ mobileNum + ", password=" + password + "]";
	}
	
	
}

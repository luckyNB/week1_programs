package com.bridgelabz.fumdoo.entity;


import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class User{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userId;
	private String firstName;
	private String lastName;
	private String emailId;
	private String password;
	private String mobileNum;
	private boolean isVerify;
	private LocalDateTime registerDate = LocalDateTime.now();
	
	
	
}

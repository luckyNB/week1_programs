package com.bridgelabz.fundoo.user.dto;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import lombok.Data;
@Data
public class LoginDTO {

	@Column(name = "email", nullable = false)
	@Email(regexp =  "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.(?:[A-Z]{2,}|com|org))+$")
	@NotEmpty(message="Please provide valid email")
	private String emailId;

	@NotEmpty(message="Please provide password")
	@Column(name="password")
	private String password;

}

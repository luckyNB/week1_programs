package com.bridgelabz.fumdoo.service;

import java.io.UnsupportedEncodingException;
import java.util.Optional;

import com.bridgelabz.fumdoo.dto.LoginDTO;
import com.bridgelabz.fumdoo.dto.UserDTO;
import com.bridgelabz.fumdoo.entity.User;
import com.bridgelabz.fumdoo.exception.UserException;
import com.bridgelabz.fumdoo.response.Response;
import com.bridgelabz.fumdoo.response.ResponseToken;


public interface UserService {
	Response onRegister(UserDTO userDto) throws UserException, UnsupportedEncodingException;

	ResponseToken onLogin(LoginDTO loginDto) throws UserException, UnsupportedEncodingException;

	/**
	 * to verify valid emailId
	 */
	Response validateEmailId(String token) throws UserException;

	/**
	 * to send forget password link
	 */
	Response forgetPassword(String emailId) throws UserException, UnsupportedEncodingException;

	/**
	 * use to reset already register user password
	 * 
	 */
	public Response resetPaswords(String token, String password) throws UserException;

	ResponseToken authentication(Optional<User> user, String password)
			throws UnsupportedEncodingException, UserException;

}

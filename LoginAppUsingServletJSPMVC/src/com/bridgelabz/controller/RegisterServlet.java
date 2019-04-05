package com.bridgelabz.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.dao.DBConnection;
import com.bridgelabz.dao.UserDaoImpl;
import com.bridgelabz.model.User;



public class RegisterServlet extends HttpServlet{
	PrintWriter writer=null;
	//Connection connection=null;
	Connection connection=null;
	PreparedStatement statement =null;
	String sql="insert into User values(?,?,?,?,?,?)";
	UserDaoImpl daoImpl=new UserDaoImpl();
	@Override
	public void init() throws ServletException {
		  connection=DBConnection.getDBConnection(); 
			System.out.println("RegisterServlet.init()");
		
		//connection=DBConnection.getDBConnection();
	}
	@Override
	public  void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
System.out.println("RegisterServlet.doPost()");
	 writer=resp.getWriter();
	resp.setContentType("text/html");
	
	String firstName=req.getParameter("firstName");
	String lastName=req.getParameter("lastName");
	String userName=req.getParameter("username");
	String password=req.getParameter("password");
	String mobileNo=req.getParameter("mobileno");
	String emailId=req.getParameter("email");
	
	 try {
		statement=connection.prepareStatement(sql);
		statement.setString(1, firstName);
		statement.setString(2, req.getParameter("lastName"));
		statement.setString(3, userName);
		statement.setString(4, password);
		statement.setString(5, mobileNo);
		statement.setString(6, emailId);
		
		User user=new User();
		user.setFirstName(req.getParameter("firstName"));
		user.setLastName(req.getParameter("lastName"));
		user.setUserName(req.getParameter("username"));
		user.setPassword(req.getParameter("password"));
		user.setMobileNo(req.getParameter("mobileno"));
		user.setEmail(req.getParameter("email"));
		
		int val=daoImpl.registerUser(user);
		if(val>0) {
			RequestDispatcher dispatcher=req.getRequestDispatcher("LoginPage.jsp");
			writer.println("Registration Successful");
			
			dispatcher.include(req, resp);
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	
	
	
	
	
	}

}

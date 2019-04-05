package com.bridgelabz.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.dao.DBConnection;
import com.bridgelabz.dao.UserDaoImpl;

public class ForgetPasswordServlet extends HttpServlet{
	PrintWriter out=null;
	Connection connection=null;
	
	@Override
		public void init() throws ServletException {
	connection=DBConnection.getDBConnection();	
	
	
	}
	
	
@Override
public  void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	out=resp.getWriter();
	resp.setContentType("text/html");
	UserDaoImpl daoImpl=new UserDaoImpl();
	String userName=req.getParameter("username");
	String emailId=req.getParameter("email");
	String newPassword=req.getParameter("newpassword");
	String confirmPassword=req.getParameter("confirmpassword");

					
					int transaction=daoImpl.resetPassword(userName, emailId, newPassword, confirmPassword);
					if(transaction>0) {
						out.println("<h1 style='color:red; text-align=center'>"); 
						out.println("Password updated SuccessFully</h1>");
						out.print("<a href='LoginPage.jsp'>Login Page</a>");
						
					}else {
						out.println("<h1 style='color:red; text-align=center'>"); 
						out.println("Password not updated .......</h1>");
						out.println("Check UserName or Password Once .......</h1>");
						
						out.print("<a href='LoginPage.jsp'>Login Page</a>");
						
					}
					
					
				}
				
			
		
	}
	
	
	
	
	



package com.bridgelabz.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.dao.DBConnection;

public class LogoutServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String emailID = "";
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		HttpSession session=request.getSession(false);
		String n=(String)session.getAttribute("uname");
		Cookie ck[]=request.getCookies();
		if(ck!=null){
		 String name=ck[0].getValue();
		 
		 Connection connection = DBConnection.getDBConnection();
			String sql = "select EMAILID from User where USERNAME=?";
			try {
				PreparedStatement statement = connection.prepareStatement(sql);
				statement.setString(1, name);
				ResultSet resultSet = statement.executeQuery();
				while (resultSet.next()) {
					emailID = resultSet.getString(1);
				}
				
				
				out.print("Hello  Mr/Mrs : " + name);
				out.print("<br><br>");
				
				out.print("Your  EmailID : " + emailID);
				out.print("<br><br>");
				
				out.print("you are successfully logged out!");
				out.print("<br><br>");
			}
			
			catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		 
		 
		 
	
		}
}
		
		
		
		
		
	

	}


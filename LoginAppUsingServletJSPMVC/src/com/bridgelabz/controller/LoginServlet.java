package com.bridgelabz.controller;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.dao.DBConnection;
import com.bridgelabz.dao.UserDaoImpl;
import com.bridgelabz.model.User;

public class LoginServlet extends HttpServlet {

	PrintWriter out;
	String userName = null;
	String password = null;

	UserDaoImpl userdaoImpl = new UserDaoImpl();

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("LoginServlet.doPost()");
		out = resp.getWriter();
		resp.setContentType("text/html");
		userName = req.getParameter("username");
		password = req.getParameter("password");
		HttpSession session = req.getSession();

		try {
			User user = new User();
			user = userdaoImpl.login(userName, password);

			if (user != null) {

				if (user.getUserName().equals(userName) && user.getPassword().equals(password)) {

					session.setAttribute("uname", userName);
					Cookie ck = new Cookie("userName", userName);
					resp.addCookie(ck);
					RequestDispatcher dispatcher = req.getRequestDispatcher("Success.jsp");
					dispatcher.forward(req, resp);
				} 
				else {
					resp.sendRedirect("LoginPage.jsp");
					System.out.println("LoginServlet.doPost()::first else");
					out.println("<h1 style='color:red; text-align=center'>");
					out.println("Invalid UserName or Password </h1>");
					out.print("<a href='LoginPage.jsp'>Login Page</a>");

				}
			} 
			else {
				resp.sendRedirect("LoginPage.jsp");
				System.out.println("LoginServlet.doPost()::second else");

				out.println("<h1 style='color:red; text-align=center'>");
				out.println("Something went Wrong.......... </h1>");
				out.print("<a href='LoginPage.jsp'>Login Page</a>");

			}

		}

		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

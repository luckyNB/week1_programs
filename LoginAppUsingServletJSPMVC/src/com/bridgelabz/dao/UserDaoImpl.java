package com.bridgelabz.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bridgelabz.model.User;

public class UserDaoImpl implements UserDao {
	public static Connection connection = null;

	public User login(String userName, String passWord) {
		User user = new User();
		String sql = "select * from User where USERNAME=? and PASSWORD=?";

		try {
			connection = DBConnection.getDBConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, userName);
			statement.setString(2, passWord);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				user.setFirstName(resultSet.getString(1));
				user.setLastName(resultSet.getString(2));
				user.setUserName(resultSet.getString(3));
				user.setPassword(resultSet.getString(4));
				user.setMobileNo(resultSet.getString(5));
				user.setEmail(resultSet.getString(6));
			}

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}

		return user;
	}

	public int registerUser(User user) {
		int status = 0;// TODO Auto-generated method stub
		String sql = "insert into User values(?,?,?,?,?,?)";

		try {
			connection = DBConnection.getDBConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, user.getFirstName());
			statement.setString(2, user.getLastName());
			statement.setString(3, user.getUserName());
			statement.setString(4, user.getPassword());
			statement.setString(5, user.getMobileNo());
			statement.setString(6, user.getEmail());

			status = statement.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}

	@Override
	public int resetPassword(String userName, String emailId, String newpassword, String confirmPassword) {
		String sql = "update User set PASSWORD=? where USERNAME=? and EMAILID=?";
		connection = DBConnection.getDBConnection();
		int status = 0;
		try {
			if (newpassword.equals(confirmPassword)) {
				if (!userName.equals("") && !emailId.equals("")) {
					PreparedStatement statement = connection.prepareStatement(sql);
					statement.setString(1, newpassword);
					statement.setString(2, userName);
					statement.setString(3, emailId);
					status = statement.executeUpdate();

				}
			}
		} catch (Exception e) {

			e.printStackTrace();
			// TODO: handle exception
		}

		return status;
	}

}

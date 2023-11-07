package com.jsp.jcart_web_app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.jcart_web_app.connection.UserConnection;
import com.jsp.jcart_web_app.dto.User;

/**
 * 
 * @author Ansari
 *
 */

public class UserDao {

	Connection connection=UserConnection.getUserConnection();
	
	/*
	 * hjsvdjavjhdsabkjcabkbkbjasvj
	 */
	public User saveUserDao(User user) {
		
		String insertQuery = "insert into user(userName,userEmail,userPassword,userPhone,useraddress) "
				+ "values(?,?,?,?,?)";
		
		
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
			preparedStatement.setString(1, user.getUserName());
			preparedStatement.setString(2, user.getUserEmail());
			preparedStatement.setString(3, user.getUserPassword());
			preparedStatement.setLong(4, user.getUserPhone());
			preparedStatement.setString(5, user.getUserAddress());
			
			preparedStatement.execute();
			return user;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	/**
	 * 
	 *
	 * User Login
	 */
	
	public User loginWithUser(String userEmail) {
		String emailQuery="select * from user where userEmail=?";
		
	
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(emailQuery);
			preparedStatement.setString(1,userEmail);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				return  new User (resultSet.getString("userEmail"),resultSet.getString("userPassword"));
				
			}

		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	public User getUserByEmailDao(String userEmail) {
		String emailQuery = "SELECT * FROM user where userEmail=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(emailQuery);

			preparedStatement.setString(1, userEmail);

			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				return new User(resultSet.getLong("userPhone"), resultSet.getString("userAddress"),resultSet.getInt("userId"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}

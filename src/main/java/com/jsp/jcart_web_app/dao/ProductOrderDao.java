package com.jsp.jcart_web_app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jsp.jcart_web_app.connection.UserConnection;
import com.jsp.jcart_web_app.dto.OrderPoduct;

public class ProductOrderDao {
Connection connection = UserConnection.getUserConnection();
	
	public OrderPoduct saveOrderProductDao(OrderPoduct orderPoduct) {
		
			
			String insertQuery = "insert into order(orderId,orderAddress,orderPhoneNumber,orderQuantity,color,size,finalPrice,productId,userId) "
					+ "values(?,?,?,?,?,?,?,?,?)";
			
			
			
			try {
				PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
				preparedStatement.setInt(1, orderPoduct.getOrderId());
				preparedStatement.setString(2,orderPoduct.getUserAddress());
				preparedStatement.setString(3, orderPoduct.getUserPhone());
				preparedStatement.setInt(4,orderPoduct.getProductQuantity());
				preparedStatement.setString(5, orderPoduct.getProductColor());
				preparedStatement.setInt(6, orderPoduct.getProductSize());
				preparedStatement.setDouble(7, orderPoduct.getFinalPrice());
				preparedStatement.setDouble(8, orderPoduct.getProductId());
				preparedStatement.setDouble(9, orderPoduct.getUserId());

				
				preparedStatement.execute();
				return orderPoduct;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return null;
		}
		
		
	
}

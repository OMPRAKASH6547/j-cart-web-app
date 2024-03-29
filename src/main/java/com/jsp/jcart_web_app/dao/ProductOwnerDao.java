package com.jsp.jcart_web_app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jsp.jcart_web_app.connection.UserConnection;
import com.jsp.jcart_web_app.dto.ProductOwner;

public class ProductOwnerDao {

	Connection connection = UserConnection.getUserConnection();

	public ProductOwner saveProductOwnerDao(ProductOwner owner) {

		String insertProduct = "insert into owner(ownerName,ownerEmail,ownerPassword,ownerPhone,verify)" + "values(?,?,?,?,?)";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(insertProduct);
			preparedStatement.setString(1, owner.getName());
			preparedStatement.setString(2, owner.getEmail());
			preparedStatement.setString(3, owner.getPassword());
			preparedStatement.setLong(4, owner.getPhone());
			preparedStatement.setString(5, "no");
			preparedStatement.execute();
			return owner;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public ProductOwner loginWithEmailPasswordDao(String email) {

		String selectEmailQuery = "SELECT * FROM owner WHERE ownerEmail = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(selectEmailQuery);
			preparedStatement.setString(1, email);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {

				return new ProductOwner(resultSet.getString("ownerEmail"), resultSet.getString("ownerPassword"),
						resultSet.getString("verify"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<ProductOwner> displayAllProductOwnerDao() {
		try {
			ResultSet resultSet = connection.prepareStatement("SELECT * From owner").executeQuery();

			List<ProductOwner> owners = new ArrayList<ProductOwner>();

			while (resultSet.next()) {

				owners.add(new ProductOwner(resultSet.getInt("ownerId"), resultSet.getString("ownerName"),
						resultSet.getString("ownerEmail"), resultSet.getString("ownerPassword"), resultSet.getLong("ownerPhone"),
						resultSet.getString("verify")));
			}
			return owners;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/*
	 * verify product owner from no to yes
	 */
	public int verifyProductOwnerByIdDao(int productOwnerId) {
		
		try {
			
			return connection.createStatement()
					.executeUpdate("update owner set verify='yes' where ownerId="+productOwnerId);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return 0;
	}
}

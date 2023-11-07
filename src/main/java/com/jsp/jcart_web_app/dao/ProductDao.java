package com.jsp.jcart_web_app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jsp.jcart_web_app.connection.UserConnection;
import com.jsp.jcart_web_app.dto.Product;
import com.jsp.jcart_web_app.dto.ProductOwner;
import com.jsp.jcart_web_app.dto.User;

public class ProductDao {
Connection connection=UserConnection.getUserConnection();
	
	/*
	 * hjsvdjavjhdsabkjcabkbkbjasvj
	 */
	public Product saveProductDao(Product product) {
		
		String insertQuery = "insert into product(productId,productName,productType,productWearType,productPrice,image,verification)"
				+ "values(?,?,?,?,?,?,?)";
		
		
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
			preparedStatement.setInt(1,product.getProductId() );
			preparedStatement.setString(2,product.getProductName() );
			preparedStatement.setString(3,product.getProductType() );
			preparedStatement.setString(4,product.getProductWearType() );
			preparedStatement.setLong(5, product.getProductPrice());	
			preparedStatement.setBlob(6,product.getInputStream());
			preparedStatement.setString(7,"no");
			preparedStatement.execute();
			return product;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public List<Product> displayAllProductDao() {
		try {
			ResultSet resultSet = connection.prepareStatement("SELECT * From product").executeQuery();

			List<Product> products = new ArrayList<Product>();

			while (resultSet.next()) {

				products.add(new Product(resultSet.getInt("productId"), resultSet.getString("productName"),
						resultSet.getString("productType"), resultSet.getString("productWearType"), resultSet.getLong("productPrice"),resultSet.getBinaryStream("image"),resultSet.getString("verification")));
			}
			return products;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
  public int verifyProductByIdDao(int productId) {
		
		try {
			
			return connection.createStatement()
					.executeUpdate("update product set verification='yes' where productId="+productId);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return 0;
	}
  
  public List<Product> getAllMenProductDao(){
	  List<Product>products=displayAllProductDao();
	  
	  List<Product> mens=new ArrayList<Product>();
	  for (Product product : products) {
		  if(product.getProductType().equalsIgnoreCase("men")) {
			  
			  mens.add(product);
		  }
		  
		
	}
	  
	  return mens;
	  
  }
  
  public List<Product> getAllWomenProductDao(){
	  List<Product>products=displayAllProductDao();
	  
	  List<Product> womens=new ArrayList<Product>();
	  for (Product product : products) {
		  if(product.getProductType().equalsIgnoreCase("Women")) {
			  
			  womens.add(product);
		  }
		  
		
	}
	  
	  return womens
			  ;
	  
  }
  
  public Product getProductByIdDao(int productId) {
		
		String selectQuery = "SELECT * From product where productId=?";
		
		try {
			
			PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
			
			preparedStatement.setInt(1, productId);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			Product product=null;
			if (resultSet.next()) {
				product=new Product(resultSet.getInt("productId"), resultSet.getString("productName"),
						resultSet.getString("productType"), resultSet.getString("productWearType"), resultSet.getLong("productPrice"),resultSet.getBinaryStream("image"),resultSet.getString("verification"));
			}

			return product;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
  
  
  
    
	
}

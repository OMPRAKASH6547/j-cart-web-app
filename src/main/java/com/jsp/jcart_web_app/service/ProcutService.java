package com.jsp.jcart_web_app.service;

import java.util.List;

import com.jsp.jcart_web_app.dao.ProductDao;
import com.jsp.jcart_web_app.dao.ProductOwnerDao;
import com.jsp.jcart_web_app.dto.Product;

public class ProcutService {
	/*
	 * hjsvdjavjhdsabkjcabkbkbjasvj
	 */
	ProductDao dao=new ProductDao();
	public Product saveProductService(Product product) {
		
		return dao.saveProductDao(product);
		
	}
	
	public List<Product> displayAllProductService() {
		return dao.displayAllProductDao();
	}
	
	 public int verifyProductByIdService(int productId) {
		 return dao.verifyProductByIdDao(productId);
	 }
}

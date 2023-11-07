package com.jsp.jcart_web_app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.jsp.jcart_web_app.dto.Product;
import com.jsp.jcart_web_app.service.ProcutService;

@WebServlet(value = "/addProduct")
@MultipartConfig(maxFileSize = 16177215)
public class ProductAddController extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int  productId=Integer.parseInt(req.getParameter("productId"));
		String productName=req.getParameter("productName");
		String productType=req.getParameter("productType");

		String productWearType=req.getParameter("productWearType");

		long productPrice=Long.parseLong(req.getParameter("productPrice"));
        String verify=null;
		Part image=req.getPart("photo");
		
		ProcutService procutService= new ProcutService();
		Product product=procutService.saveProductService(new Product(productId,productName,productType,productWearType, productPrice,image.getInputStream(),verify));

        if(product!=null) {
	    req.setAttribute("productAdded", "pruduct added sucessfuly ");

			req.getRequestDispatcher("add-product.jsp").forward(req, resp);
		}else {
			
			req.setAttribute("notadded", "product not added .... ");
			
			req.getRequestDispatcher("add-product.jsp").include(req, resp);
		}     
		
		
	}

}

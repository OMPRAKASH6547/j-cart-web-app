package com.jsp.jcart_web_app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.jcart_web_app.dto.OrderPoduct;
import com.jsp.jcart_web_app.service.OrderProductService;

@WebServlet("/OrderNow")
public class ProductOrderController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int  productId=Integer.parseInt(req.getParameter("productid"));
		int userid=Integer.parseInt(req.getParameter("userid"));
		String productName=req.getParameter("productName");

		String productWearType=req.getParameter("productWearType");

		String productcolor=req.getParameter("color");
		int size=Integer.parseInt(req.getParameter("size"));
		int quantity=Integer.parseInt(req.getParameter("quantity"));
		String userAddress=req.getParameter("userAddress");
		String userPhone=req.getParameter("userPhone");
		Double price=Double.parseDouble(req.getParameter("productPrice"));
		OrderProductService orderProductService=new OrderProductService(); 
		int  orderId=0;
		OrderPoduct product=orderProductService.saveOrderProductService(new OrderPoduct( orderId ,userAddress, userPhone,productcolor, size,
				quantity, price,productId,userid));
        if(product!=null) {
	    req.setAttribute("orderAdded", "pruduct added sucessfuly ");

			req.getRequestDispatcher("user-home.jsp").forward(req, resp);
		}else {
			
			req.setAttribute("notadded", "product not added .... ");
			
			req.getRequestDispatcher("order-form.jsp").include(req, resp);
		}     
		
		
	}

	}



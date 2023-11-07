package com.jsp.jcart_web_app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.jcart_web_app.service.ProcutService;
import com.jsp.jcart_web_app.service.ProductOwnerService;

@WebServlet(value = "/verifyproduct")
public class AdminVerifyProductController extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		new ProcutService().verifyProductByIdService(Integer.parseInt(req.getParameter("productId")));
		
		req.getRequestDispatcher("verify-product.jsp").forward(req, resp);
    }
}

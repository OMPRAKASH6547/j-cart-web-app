package com.jsp.jcart_web_app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.jcart_web_app.dto.User;
import com.jsp.jcart_web_app.service.UserService;
@WebServlet(value="/LoginUser")
public class UserLoginController extends HttpServlet {
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession httpSession=req.getSession();
		String userEmail=req.getParameter("userEmail");
		String userPassword=req.getParameter("userPassword");
		
		UserService service=new UserService();
		User user=service.loginWithService(userEmail);
		
		System.out.println(userEmail);
		System.out.println(userPassword);
		
		if(user!=null) 
		{
			if(user.getUserPassword().equals(userPassword)) {
				httpSession.setAttribute("myEmail", userEmail);
//				httpSession.setMaxInactiveInterval(30);
				
				req.getRequestDispatcher("user-home.jsp").forward(req, resp);
//				httpSession.invalidate();
				
			
			}
			else {
				req.setAttribute("incurrectPassword", "password is missMatch");
				req.getRequestDispatcher("user-login.jsp").forward(req, resp);
			}
		}
		else
		{
			req.setAttribute("incurrectEmail", "Email is missMatch");
			req.getRequestDispatcher("user-login.jsp").forward(req, resp);
		}
		
		
		
		
	}
	
	

}

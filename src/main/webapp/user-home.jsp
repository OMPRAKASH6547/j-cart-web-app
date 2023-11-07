<%@page import="com.jsp.jcart_web_app.dto.Product"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.jcart_web_app.dao.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="user-home.css">
</head>
<body>
	<header class="main-header">
	<nav>
	  <div class="logo">
	  
	  </div>
	 <ul>
	 <li>Home</li>
	 <li>Home</li>
	 <li>Home</li>
	 <li>Home</li>	 
	 </ul>
	
	</nav>
	</header>
	<%
	  ProductDao productDao=new ProductDao();
	  List<Product> products=productDao.displayAllProductDao();
	%>
	<section style="display: flex;flex-wrap: wrap;gap:2vh; 
	 
	justify-content: space-between;">
	<% for(Product product:products) { %>
	<%if(product.getVerify().equals("yes")){%>
	<div style="height: 20vw;width: 20vw;
	 border-radius:10%;
	 box-shadow:2px 2px 5px black;
	 justify-content: space-between;
	 background-color:red; color: white;">
	 <div style="display: flex;flex-direction:column;font-size: 2vh ;justify-content:center; maralign-items: center ">
	   <img alt="" src="" style="height: 20vh;width: 30vh;background-color:white;" >
	   <div style="display: flex;flex direction: row;justify-content: space-between;gap:4vh">
	   <h3 style="font-size: 2vh">price=<del><%=product.getProductPrice() %></del></h3>
	   <h3 style="font-size: 2vh">35% OFF</h3>	   
	   <h3 style="font-size: 2vh">Final Price=<%=product.getProductPrice()*0.65%></h3>
	   </div>
	   <div style="background-color: white; display: flex; 
	   justify-content: space-between;gap:5vh">
	   <a href="order-form.jsp?productId=<%=product.getProductId()%>" style="font-size: 2vh">OrderNow</a>
	   <a href="#" style="font-size: 2vh">Add to cart</a>
	   </div>
	   
	   </div>
	</div>
	<%} }%>
	
	
	</section>
</body>
</html>
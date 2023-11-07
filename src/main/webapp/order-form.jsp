<%@page import="com.jsp.jcart_web_app.dao.ProductDao"%>
<%@page import="com.jsp.jcart_web_app.dao.UserDao"%>
<%@page import="com.jsp.jcart_web_app.dto.User"%>
<%@page import="com.jsp.jcart_web_app.dto.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>		

		<%
			    
		int productid=Integer.parseInt(request.getParameter("productId"));
		
				Product product= new ProductDao().getProductByIdDao(productid);
				
				HttpSession httpSession = request.getSession();
				
				String email=(String)httpSession.getAttribute("myEmail");
				
				User user=new UserDao().getUserByEmailDao(email);
		%>	
		<jsp:include page="home-button.jsp"></jsp:include>
		<form action="OrderNow">				
					<input type="text"  name="productid" value="<%=product.getProductId()%>" hidden="true"><br>
					<input type="text" name="userid" value="<%=user.getUserId()%>" hidden="true" ><br>
					<label>ProductName:</label><br>
					<input type="text" name="productName" value="<%=product.getProductName()%>" readonly="true"><br>
					<label>ProductColor:</label><br>
					<input type="text" name="color"><br>
					<label>ProductSize:</label><br>
					<input type="number"  name="size"><br>
					<label>ProductQuantity:</label><br>
					<input type="number" name="quantity"><br>
					<label>Address:</label><br>
					<input type="text" name="userAddress" value="<%=user.getUserAddress()%>" ><br>
					
					<label>Phone:</label><br>
					<input type="tel"  name="userPhone" value="<%=user.getUserPhone()%>"><br>
					
					<label>Price:</label><br>
					<input type="number"  name="productPrice" value="<%=product.getProductPrice()%>" readonly="true"><br>
				
					<input type="submit" value="BookNow">
				</form>
	
		

		
		
</body>
</html>
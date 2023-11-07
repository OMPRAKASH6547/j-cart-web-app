<%@page import="com.jsp.jcart_web_app.dao.ProductDao"%>
<%@page import="java.util.List"%>
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
  <h3>All Product</h3>
	
<%
			ProductDao dao=new ProductDao();
			List<Product>products = dao.displayAllProductDao();
	%>
	<table border="2px">
		<tr>
			<th>productId</th>
			<th>productName</th>
			<th>productType</th>
			<th>productWearType</th>
			<th>productPrice</th>
			<th>Edit</th>
		</tr>
		
		<%for(Product product:products){ %>
		
		<tr>
			<td><%=product.getProductId()%></td>
			<td><%=product.getProductName()%></td>
			<td><%=product.getProductType()%></td>
			<td><%=product.getProductWearType()%></td>
			<td><%=product.getProductPrice()%></td>
			
		</tr>
	<%}%>
	</table>
</body>
</html>
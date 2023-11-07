<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welocme to product owner register Area</h1>

<div>
    <%
			String msgPass =(String)request.getAttribute("passwordMessage");
		%>
		
		<%if(msgPass!=null){ %>
		
			<h4 style="color: red"><%=msgPass%></h4>
		
		<%} %>


				<form action="regsterOwner" method="post">
					<label>OwnerName:</label><br>
					<input type="text" placeholder="OwnerName" name="ownerName"><br>
					<label>OwnerEmail:</label><br>
					<input type="email" placeholder="OwnerEmail" name="ownerEmail"><br>
					<label>OwnerPassword:</label><br>
					<input type="password" placeholder="OwnerPassword" name="ownerPassword"><br>
					<label>OwnerPhone:</label><br>
					<input type="tel" placeholder="OwnerPhone" name="ownerPhone"><br>
					
					<input type="submit" value="Signup">
				</form>
			</div>
</body>
</html>
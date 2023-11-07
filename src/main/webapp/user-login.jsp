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
String emailMassage=(String)request.getAttribute("incurrectPassword");
String passwordmassage=(String)request.getAttribute("incurrectEmail");
%>
<%if(emailMassage!=null){ %>
   <h1><%=emailMassage%></h1>
<%} %>
<%if(passwordmassage!=null){ %>
   <h1><%=passwordmassage%></h1>
<%} %>
<div class="inner-blok">
		<form action="LoginUser" method="post">	
				
				<p>
					<input type="email" placeholder="username" name="userEmail">
				</p>
				
				<p>
					<input type="password" placeholder=" password at least 8 char...." name="userPassword">
				</p>
				<p>
				
					<select name="dropdown" id="">
						<option value=""></option>
						<option value=""></option>
					</select>
	
				</p>
				<p>
				   <input type="submit" value="Login">
				  <button> <a href="user-register.jsp">SignuUp</a></button>
				</p>
			
		</form>
	</div>
</body>
</html>
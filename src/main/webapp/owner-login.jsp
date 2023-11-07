<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h1>ownerLogin</h1>
    
    <div class="inner-blok">
		<form action="LoginOwner" method="post">	
				
				<p>
					<input type="email" placeholder="OwnerName" name="ownerEmail">
				</p>
				
				<p>
					<input type="password" placeholder=" OwnerPassword at least 8 char...." name="ownerPassword">
				</p>
				<p>
				
					<select name="dropdown" id="">
						<option value=""></option>
						<option value=""></option>
					</select>
	
				</p>
				<p>
				   
				  <input type="submit" value="Login">
    <button><a href="owner-register.jsp">OwnerSignup</a></button>
				</p>
			
		</form>
	</div>
    
    
    
    
</body>
</html>
<%@page import="com.dao.Dao"%>
<%@page import="com.model.CartModel"%>
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
		String id = request.getParameter("id");
		int id2 = Integer.parseInt(id);
		
		int status =Dao.deletefromcart(id2);
		
		if(status>0)
		{
			response.sendRedirect("cart.jsp");
		}
		else
		{
			out.print("fail");
		}
		
	%>

</body>
</html>
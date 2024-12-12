<%@page import="com.dao.Dao"%>
<%@page import="com.model.CartModel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

	<style>
        .product-grid {
            display: grid;
            grid-template-columns: repeat(auto-fill, minmax(200px, 1fr));
            grid-gap: 20px;
            padding: 20px;
        }
        .product {
            border: 1px solid #ccc;
            padding: 10px;
            text-align: center;
        }
        .product img {
            max-width: 100px;
            max-height: 100px;
        }
        .swd-button 
			{
				background: #f2db18;
				border: 1px solid white;
				border-radius: 5px;
				color: white;
				display: inline-block;
				font: bold 12px Arial, Helvetica, sans-serif;
				padding: 10px 15px;
				text-decoration: none;
				text-transform: uppercase;
				margin-top: 15px;
			}
        
    </style>


</head>
<body>

<%
    
	    response.setHeader("cache-control", "no-cache");
	    response.setHeader("cache-control", "no-store");
	    response.setHeader("pragma", "no-cache");
	    response.setDateHeader("Expires", 0);
    
    %>
	


	<%
		if(session.getAttribute("project")!=null)
		{
			
		
	%>


	<jsp:include page="header.jsp"/>
	
		<div class="product-grid">
		
		<%
			List<CartModel>list = Dao.cartviewproducts(session.getAttribute("email").toString());
		
			for(CartModel m : list)
			{
		%>
		
		 	<div class="product">
		 	
		 		<img src="data:image/jpeg;base64,<%=m.getP_image()%>" width="150px" height="200px" />
		 		<br>
		 		<br>
		 		<b>Product Name: </b><p><%=m.getP_name() %></p>
				<b>Product Price: </b><p><%=m.getP_price() %></p>
				<b>Product Description: </b><p><%=m.getP_des() %></p>
				
				
				<form action="payment.jsp">
				
					<p>
						<input type="hidden" name="id" value="<%=m.getId() %>">
					</p>
					
					<p>
					<input type="submit" class="swd-button" value="Proceed to Payment">
					
					</p>
					
				
				
				</form>
				
				<form action="cartdelete.jsp">
				
					<p>
						<input type="hidden" name="id" value="<%=m.getId() %>">
					</p>
					
					<p>
					<input type="submit" class="swd-button" value="Remove from Cart">
					
					</p>
					
				
				
				</form>
				
                
				
			</div>
		
		<%
			}
		%>
		
		
		
		<%
		}
		else
		{
			
			response.sendRedirect("index.jsp");
		}	
		%>
		
	</div>
	
	
	<jsp:include page="footer.jsp"/>

</body>
</html>
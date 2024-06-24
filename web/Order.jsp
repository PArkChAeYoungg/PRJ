<%-- 
    Document   : Order
    Created on : Jun 23, 2024, 8:05:05 PM
    Author     : OS
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="sample.product.Cart"%>
<%@page import="java.util.ArrayList"%>
<%@page import="sample.product.ProductDTO"%>
<%@page import="sample.product.OrderDTO"%>
<%@page import="java.util.List"%>
<%@page import="sample.product.OrderDAO"%>
<%@page import="sample.user.UserDTO"%>
<%@page import="java.text.DecimalFormat"%>
<%
	DecimalFormat dcf = new DecimalFormat("#.##");
	request.setAttribute("dcf", dcf);
	UserDTO auth = (UserDTO) session.getAttribute("LOGIN_USER");
	List<OrderDTO> orders = null;
	if (auth != null) {
	    request.setAttribute("person", auth);
	    OrderDAO orderDao  = new OrderDAO();
		orders = orderDao.userOrders(auth.getUserID());
	}else{
		response.sendRedirect("Login.jsp");
	}
	ArrayList<Cart> cart_list = (ArrayList<Cart>) session.getAttribute("cart-list");
	if (cart_list != null) {
		request.setAttribute("cart_list", cart_list);
	}
	
	%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta name="viewport" content="width=device-width,initial-scale=1">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" />
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    </head>
    <body>
      
         <jsp:include page="Menu.jsp"></jsp:include>
        <div class="container">
		<div class="card-header my-3">All Orders</div>
		<table class="table table-light">
			<thead>
                            <tr>    <th scope="col">ID</th>
					<th scope="col">Date</th>
					<th scope="col">Name</th>
					
					<th scope="col">Quantity</th>
					<th scope="col">Price</th>
					<th scope="col">Cancel</th>
				</tr>
			</thead>
			<tbody>
			
			<%
			if(orders != null){
				for(OrderDTO o:orders){%>
                                <tr>    <td><%=o.getOrderID()%></td>
						<td><%=o.getDate() %></td>
						<td><%=o.getName() %></td>
					
						<td><%=o.getQuantity() %></td>
						<td><%=dcf.format(o.getPrice()) %></td>
						<td><a class="btn btn-sm btn-danger" href="CancelOrder?id=<%=o.getOrderID()%>">Cancel Order</a></td>
					</tr>
				<%}
			}
			%>
			
			</tbody>
		</table>
	</div>
        
        
    </body>
</html>

  <%@page import="sample.user.UserDTO"%>
<%
            UserDTO user = (UserDTO) session.getAttribute("LOGIN_USER");
           
        %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <!--begin of menu-->
        <nav class="navbar navbar-expand-md navbar-dark bg-dark">
            <div class="container">
                <a class="navbar-brand" href="home">Shoes</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse justify-content-end" id="navbarsExampleDefault">
                    <ul class="navbar-nav m-auto">
                        <%  if(user==null)
                        { %>
                         <li class="nav-item">
                            <a class="nav-link" href="LoginController">Login</a>
                        </li>
                        <%  }
else {      if(user.getRoleID().equals("AD"))
                        {              %>
                        <li class="nav-item">
                            <a class="nav-link" href="manager">Manager Product</a>
                        </li>
                         <li class="nav-item">
                            <a class="nav-link" href="manager">Manager Account</a>
                        </li>
                        <% 
                          } else {  
                        %>
                        
                        <li class="nav-item">
                            <a class="nav-link" href="Order.jsp">Order</a>
                        </li>
                       
                        <li class="nav-item">
                            <a class="nav-link" href="viewCart.jsp">View Cart</a>
                        </li>
                        <% }%>
                        
                        <li class="nav-item">
                            <a class="nav-link" href="LogoutController">Logout</a>
                        </li>
                        <% }%>
                        <li class="nav-item">
                            <a class="nav-link" href="About.jsp">About us</a>
                        </li>
                    </ul>

                    <form action="MainController" method="post" class="form-inline my-2 my-lg-0">
                        <div class="input-group input-group-sm">
                            <input name="txt" type="text" class="form-control" aria-label="Small" aria-describedby="inputGroup-sizing-sm" placeholder="Search...">
                            <div class="input-group-append">
                                <input type="submit" name="action" value="Search" class="btn btn-secondary btn-number"/>
                                   
                                
                            </div>
                        </div>
                        <a class="btn btn-success btn-sm ml-3" href="show">
                            <i class="fa fa-shopping-cart"></i> Cart
                            <span class="badge badge-light">3</span>
                        </a>
                    </form>
                </div>
            </div>
        </nav>
        <section class="jumbotron text-center">
            <div class="container">
               
            </div>
        </section>

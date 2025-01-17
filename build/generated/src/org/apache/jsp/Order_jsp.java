package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import sample.product.ProductDTO;
import sample.product.OrderDTO;
import java.util.List;
import sample.product.OrderDAO;
import sample.user.UserDTO;
import java.text.DecimalFormat;

public final class Order_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

	DecimalFormat dcf = new DecimalFormat("#.##");
	request.setAttribute("dcf", dcf);
	UserDTO auth = (UserDTO) request.getSession().getAttribute("auth");
	List<OrderDTO> orders = null;
	if (auth != null) {
	    request.setAttribute("person", auth);
	    OrderDAO orderDao  = new OrderDAO();
		orders = orderDao.userOrders(auth.getUserID());
	}else{
		response.sendRedirect("login.jsp");
	}
	ArrayList<ProductDTO> cart_list = (ArrayList<ProductDTO>) session.getAttribute("cart-list");
	if (cart_list != null) {
		request.setAttribute("cart_list", cart_list);
	}
	
	
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\" />\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      \n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("\t\t<div class=\"card-header my-3\">All Orders</div>\n");
      out.write("\t\t<table class=\"table table-light\">\n");
      out.write("\t\t\t<thead>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<th scope=\"col\">Date</th>\n");
      out.write("\t\t\t\t\t<th scope=\"col\">Name</th>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<th scope=\"col\">Quantity</th>\n");
      out.write("\t\t\t\t\t<th scope=\"col\">Price</th>\n");
      out.write("\t\t\t\t\t<th scope=\"col\">Cancel</th>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</thead>\n");
      out.write("\t\t\t<tbody>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t");

			if(orders != null){
				for(OrderDTO o:orders){
      out.write("\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(o.getDate() );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(o.getName() );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(o.getQuantity() );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(dcf.format(o.getPrice()) );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t<td><a class=\"btn btn-sm btn-danger\" href=\"cancel-order?id=");
      out.print(o.getOrderID());
      out.write("\">Cancel Order</a></td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t");
}
			}
			
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t</tbody>\n");
      out.write("\t\t</table>\n");
      out.write("\t</div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

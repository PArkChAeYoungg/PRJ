package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import sample.product.CartDTO;
import sample.product.Cart;

public final class viewCart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("              ;\n");
      out.write("    font-family: Arial, sans-serif;\n");
      out.write("    background-color: #f4f4f4;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1 {\n");
      out.write("    text-align: center;\n");
      out.write("    color: #333;\n");
      out.write("}\n");
      out.write("\n");
      out.write("table {\n");
      out.write("    width: 80%;\n");
      out.write("    margin: 20px auto;\n");
      out.write("    border-collapse: collapse;\n");
      out.write("    background-color: #fff;\n");
      out.write("}\n");
      out.write("\n");
      out.write("table, th, td {\n");
      out.write("    border: 1px solid #ddd;\n");
      out.write("}\n");
      out.write("\n");
      out.write("th, td {\n");
      out.write("    padding: 12px;\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("th {\n");
      out.write("    background-color: #f2f2f2;\n");
      out.write("    color: #333;\n");
      out.write("}\n");
      out.write("\n");
      out.write("tr:nth-child(even) {\n");
      out.write("    background-color: #f9f9f9;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=\"text\"], input[type=\"number\"] {\n");
      out.write("    width: 80%;\n");
      out.write("    padding: 5px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=\"submit\"] {\n");
      out.write("    padding: 5px 10px;\n");
      out.write("    background-color: #5cb85c;\n");
      out.write("    color: white;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("    border-radius: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=\"submit\"]:hover {\n");
      out.write("    background-color: #4cae4c;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a {\n");
      out.write("    display: block;\n");
      out.write("    width: 200px;\n");
      out.write("    margin: 20px auto;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 10px 0;\n");
      out.write("    background-color: #007bff;\n");
      out.write("    color: white;\n");
      out.write("    text-decoration: none;\n");
      out.write("    border-radius: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a:hover {\n");
      out.write("    background-color: #0056b3;\n");
      out.write("}\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        <title> Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Bạn đã chọn những sản phẩm này nè:</h1>\n");
      out.write("        ");

            CartDTO cart = (CartDTO) session.getAttribute("CART");
            if (cart != null) {
        
      out.write("\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                   <th>No</th>\n");
      out.write("                    <th>ID</th>\n");
      out.write("                    <th>Name</th>\n");
      out.write("                    <th>Description</th>\n");
      out.write("                    <th>Price</th>\n");
      out.write("                    <th>Image</th>\n");
      out.write("                     <th>Title</th>\n");
      out.write("                     <th>Category</th>\n");
      out.write("                    <th>quantity</th>\n");
      out.write("                     <th>Subtotal</th>\n");
      out.write("                    <th>Action</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    int count = 1;
                    double total = 0;
                    for (Cart p : cart.getCart().values()) {
                        total += p.getPrice() * p.getQuantity();
                        
                
      out.write("\n");
      out.write("            <form action=\"RemoveViewController\" method=\"POST\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( count++);
      out.write("</td>\n");
      out.write("                    <td name=\"id\">   ");
      out.print( p.getId());
      out.write("   </td>\n");
      out.write("                 \n");
      out.write("                     <td name=\"price\">");
      out.print( p.getPrice());
      out.write("$</td>\n");
      out.write("                    <td name=\"name\">");
      out.print( p.getName());
      out.write("</td>\n");
      out.write("      \n");
      out.write("                    <td name=\"quantity\">");
      out.print( p.getQuantity());
      out.write("</td>\n");
      out.write("  \n");
      out.write("                    <td>");
      out.print( p.getPrice() * p.getQuantity());
      out.write("$</td>\n");
      out.write("                  \n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"hidden\" name=\"id\" value=\"");
      out.print(p.getId() );
      out.write("\" />\n");
      out.write("                        <input type=\"submit\" name=\"action\" value=\"Remove\"/>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");

                String message = (String) request.getAttribute("MESSAGE");
                if (message == null) {
                    message = "";
                }
            
      out.write("\n");
      out.write("            ");
      out.print( message);
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("    <h1>Total:");
      out.print( total);
      out.write(" $  </h1>      \n");
      out.write("    ");

        }
    
      out.write("\n");
      out.write("    </br>\n");
      out.write("    <a href=\"home\">Add more</a>\n");
      out.write("</body>\n");
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

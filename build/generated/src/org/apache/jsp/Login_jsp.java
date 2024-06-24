package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Login page</title>\n");
      out.write("         <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <style>\n");
      out.write("          \n");
      out.write(".gradient-custom-2 {\n");
      out.write("/* fallback for old browsers */\n");
      out.write("background: #fccb90;\n");
      out.write("\n");
      out.write("/* Chrome 10-25, Safari 5.1-6 */\n");
      out.write("background: -webkit-linear-gradient(to right, #ee7724, #d8363a, #dd3675, #b44593);\n");
      out.write("\n");
      out.write("/* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */\n");
      out.write("background: linear-gradient(to right, #ee7724, #d8363a, #dd3675, #b44593);\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media (min-width: 768px) {\n");
      out.write(".gradient-form {\n");
      out.write("height: 100vh !important;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("@media (min-width: 769px) {\n");
      out.write(".gradient-custom-2 {\n");
      out.write("border-top-right-radius: .3rem;\n");
      out.write("border-bottom-right-radius: .3rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <section class=\"h-100 gradient-form\" style=\"background-color: #eee;\">\n");
      out.write("  <div class=\"container py-5 h-100\">\n");
      out.write("    <div class=\"row d-flex justify-content-center align-items-center h-100\">\n");
      out.write("      <div class=\"col-xl-10\">\n");
      out.write("        <div class=\"card rounded-3 text-black\">\n");
      out.write("          <div class=\"row g-0\">\n");
      out.write("            <div class=\"col-lg-6\">\n");
      out.write("              <div class=\"card-body p-md-5 mx-md-4\">\n");
      out.write("\n");
      out.write("                <div class=\"text-center\">\n");
      out.write("                  <img src=\"https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/lotus.webp\"\n");
      out.write("                    style=\"width: 185px;\" alt=\"logo\">\n");
      out.write("                  <h4 class=\"mt-1 mb-5 pb-1\">We are The Lotus Team</h4>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <form>\n");
      out.write("                  <p>Please login to your account</p>\n");
      out.write("\n");
      out.write("                  <div data-mdb-input-init class=\"form-outline mb-4\">\n");
      out.write("                    <input type=\"email\" id=\"form2Example11\" class=\"form-control\"\n");
      out.write("                      placeholder=\"Phone number or email address\" />\n");
      out.write("                    <label class=\"form-label\" for=\"form2Example11\">Username</label>\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                  <div data-mdb-input-init class=\"form-outline mb-4\">\n");
      out.write("                    <input type=\"password\" id=\"form2Example22\" class=\"form-control\" />\n");
      out.write("                    <label class=\"form-label\" for=\"form2Example22\">Password</label>\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                  <div class=\"text-center pt-1 mb-5 pb-1\">\n");
      out.write("                    <button data-mdb-button-init data-mdb-ripple-init class=\"btn btn-primary btn-block fa-lg gradient-custom-2 mb-3\" type=\"button\">Log\n");
      out.write("                      in</button>\n");
      out.write("                    <a class=\"text-muted\" href=\"#!\">Forgot password?</a>\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                  <div class=\"d-flex align-items-center justify-content-center pb-4\">\n");
      out.write("                    <p class=\"mb-0 me-2\">Don't have an account?</p>\n");
      out.write("                    <button  type=\"button\" data-mdb-button-init data-mdb-ripple-init class=\"btn btn-outline-danger\">Create new</button>\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-6 d-flex align-items-center gradient-custom-2\">\n");
      out.write("              <div class=\"text-white px-3 py-4 p-md-5 mx-md-4\">\n");
      out.write("                <h4 class=\"mb-4\">We are more than just a company</h4>\n");
      out.write("                <p class=\"small mb-0\">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\n");
      out.write("                  tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud\n");
      out.write("                  exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</section>\n");
      out.write("        ");
 
            String error= (String)request.getAttribute("ERROR");
            if(error== null) error= "";
        
      out.write("\n");
      out.write("         <h1>");
      out.print( error );
      out.write("</h1>\n");
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

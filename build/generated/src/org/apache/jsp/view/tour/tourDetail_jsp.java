package org.apache.jsp.view.tour;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tourDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"\n");
      out.write("              integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"../../css/home.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"../../css/tourDetail.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../home/header.jsp", out, false);
      out.write("  \n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"col-lg-8 bg-white\">\n");
      out.write("                <div class=\"row hedding m-0 pl-3 pt-0 pb-3\">\n");
      out.write("                    Product Detail Design Using Bootstrap 4.0\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row m-0\">\n");
      out.write("                    <div class=\"col-lg-4 left-side-product-box pb-3\">\n");
      out.write("                        <img src=\"http://nicesnippets.com/demo/pd-image1.jpg\" class=\"border p-3\">\n");
      out.write("                        <span class=\"sub-img\">\n");
      out.write("                            <img src=\"http://nicesnippets.com/demo/pd-image2.jpg\" class=\"border p-2\">\n");
      out.write("                            <img src=\"http://nicesnippets.com/demo/pd-image3.jpg\" class=\"border p-2\">\n");
      out.write("                            <img src=\"http://nicesnippets.com/demo/pd-image4.jpg\" class=\"border p-2\">\n");
      out.write("                        </span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-8\">\n");
      out.write("                        <div class=\"right-side-pro-detail border p-3 m-0\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-lg-12\">\n");
      out.write("                                    <span>Who What Wear</span>\n");
      out.write("                                    <p class=\"m-0 p-0\">Women's Velvet Dress</p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-lg-12\">\n");
      out.write("                                    <p class=\"m-0 p-0 price-pro\">$30</p>\n");
      out.write("                                    <hr class=\"p-0 m-0\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-lg-12 pt-2\">\n");
      out.write("                                    <h5>Product Detail</h5>\n");
      out.write("                                    <span>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\n");
      out.write("                                        tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\n");
      out.write("                                        quis nostrud exercitation ullamco laboris.</span>\n");
      out.write("                                    <hr class=\"m-0 pt-2 mt-2\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-lg-12\">\n");
      out.write("                                    <p class=\"tag-section\"><strong>Tag : </strong><a href=\"\">Woman</a><a href=\"\">,Man</a></p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-lg-12\">\n");
      out.write("                                    <h6>Quantity :</h6>\n");
      out.write("                                    <input type=\"number\" class=\"form-control text-center w-100\" value=\"1\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-lg-12 mt-3\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-lg-6 pb-2\">\n");
      out.write("                                            <a href=\"#\" class=\"btn btn-danger w-100\">Add To Cart</a>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-lg-6\">\n");
      out.write("                                            <a href=\"#\" class=\"btn btn-success w-100\">Shop Now</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12 text-center pt-3\">\n");
      out.write("                        <h4>More Product</h4>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row mt-3 p-0 text-center pro-box-section\">\n");
      out.write("                    <div class=\"col-lg-3 pb-2\">\n");
      out.write("                        <div class=\"pro-box border p-0 m-0\">\n");
      out.write("                            <img src=\"http://nicesnippets.com/demo/pd-b-image1.jpg\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 pb-2\">\n");
      out.write("                        <div class=\"pro-box border p-0 m-0\">\n");
      out.write("                            <img src=\"http://nicesnippets.com/demo/pd-b-images2.jpg\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 pb-2\">\n");
      out.write("                        <div class=\"pro-box border p-0 m-0\">\n");
      out.write("                            <img src=\"http://nicesnippets.com/demo/pd-b-images3.jpg\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 pb-2\">\n");
      out.write("                        <div class=\"pro-box border p-0 m-0\">\n");
      out.write("                            <img src=\"http://nicesnippets.com/demo/pd-b-images4.jpg\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../home/footer.jsp", out, false);
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" \n");
      out.write("        integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"\n");
      out.write("        integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"\n");
      out.write("        integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
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

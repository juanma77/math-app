package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class division2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>División 2</title>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("      <body>  \n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            body {\n");
      out.write("            background: url(\"./images/division2.jpg\");\n");
      out.write("            background-size: 1400px 700px;\n");
      out.write("            background-repeat: no-repeat;\n");
      out.write("           \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("              .textentry {\n");
      out.write("                position:  absolute;\n");
      out.write("                top:       100px;  /* I usually locate relative to top  */\n");
      out.write("                left:      1010px; /* left corner of container (screen) */\n");
      out.write("                /*height:    80px; */  /*  often useful to keep screen orderly */\n");
      out.write("                width: 170px; \n");
      out.write("                height: 100px;\n");
      out.write("                 border-color: black;\n");
      out.write("                font-size: 30px;\n");
      out.write("                font-family: bariol;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("              .textentry2 {\n");
      out.write("                  position:  absolute;\n");
      out.write("                top:       310px;  /* I usually locate relative to top  */\n");
      out.write("                left:      1010px; /* left corner of container (screen) */\n");
      out.write("                /*height:    80px; */  /*  often useful to keep screen orderly */\n");
      out.write("                width: 170px; \n");
      out.write("                height: 100px;\n");
      out.write("                 border-color: black;\n");
      out.write("                font-size: 30px;\n");
      out.write("                font-family: bariol;\n");
      out.write("                \n");
      out.write("           \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .textentry3 {\n");
      out.write("                position:  absolute;\n");
      out.write("                top:       520px;  /* I usually locate relative to top  */\n");
      out.write("                left:      1010px; /* left corner of container (screen) */\n");
      out.write("                /*height:    80px; */  /*  often useful to keep screen orderly */\n");
      out.write("                width: 170px; \n");
      out.write("                height: 100px;\n");
      out.write("                 border-color: black;\n");
      out.write("                font-size: 30px;\n");
      out.write("                font-family: bariol;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("             #enviar2{\n");
      out.write("               position:  absolute;\n");
      out.write("                top:  630px;  /* I usually locate relative to top  */\n");
      out.write("                left: 1010px; \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("              #enviar2{\n");
      out.write("               position:  absolute;\n");
      out.write("                top:  630px;  /* I usually locate relative to top  */\n");
      out.write("                left: 1010px; \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("           #siguiente{\n");
      out.write("               \n");
      out.write("                position: absolute;\n");
      out.write("                  top:  400px; \n");
      out.write("                left: 1180px; \n");
      out.write("            }\n");
      out.write("         </style>\n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("          <script>\n");
      out.write("             \n");
      out.write("             \n");
      out.write("             function validarDivision21(){\n");
      out.write("                \n");
      out.write("                varDivision21 = document.getElementsByClassName(\"textEntry\").value;\n");
      out.write("                if(varDivision21==2){\n");
      out.write("                 \n");
      out.write("                    alert(\"PUNTOS : +1\" );\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                varDivision22 = document.getElementsByClassName(\"textEntry2\").value;\n");
      out.write("                if(varDivision22==4){\n");
      out.write("                 \n");
      out.write("                    alert(\"PUNTOS : +1\" );\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                varDivision23 = document.getElementsByClassName(\"textEntry3\").value;\n");
      out.write("                if(varDivision23==3){\n");
      out.write("                 \n");
      out.write("                    alert(\"PUNTOS : +1\" );\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("             \n");
      out.write("            \n");
      out.write("             \n");
      out.write("               \n");
      out.write("             \n");
      out.write("             \n");
      out.write("         </script>   \n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("         <br><br><br><br><br><br>\n");
      out.write("         <br><br><br> <br><br><br>\n");
      out.write("         <br><br><br> <br><br><br>\n");
      out.write("         <br><br><br> <br><br><br>\n");
      out.write("         <br><br><br> <br>\n");
      out.write("         \n");
      out.write("         \n");
      out.write("           \n");
      out.write("        <form action=\"\" method=\"post\" onsubmit=\"validarDivision21()\">\n");
      out.write("            \n");
      out.write("        \n");
      out.write("         \n");
      out.write("        \n");
      out.write("         <input type=\"text\" name=\"usuario\"  required size=\"15px\" class=\"textentry\" > <br><br>\n");
      out.write("           <input id=\"enviar1\" type=\"submit\" value=\"Enviar\"/>\n");
      out.write("           <input type=\"text\" name=\"usuario2\"  required size=\"15px\" class=\"textentry2\">\n");
      out.write("         \n");
      out.write("           <input type=\"text\" name=\"usuario3\"  required size=\"15px\" class=\"textentry3\">\n");
      out.write("            \n");
      out.write("           <!-- Contraseña:<input type=\"password\" name=\"contrasena\"  required><br><br> -->\n");
      out.write("            \n");
      out.write("           \n");
      out.write("           \n");
      out.write("          <img id=\"siguiente\" onclick=\"location='juegodivicion.jsp'\" src=\"sig.png\" width=\"90\" height=\"50\" >\n");
      out.write("            <input id=\"enviar2\" type=\"submit\" value=\"Enviar\"/>\n");
      out.write("           \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <input type=\"hidden\" name=\"bandera\" value=\"0\">\n");
      out.write("            \n");
      out.write("        </form>   \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("   <!-- <body background=\"./images/sumas1.jpg;\" background-size: 80px 60px>-->\n");
      out.write("        <!--<h1>Hello World!</h1> -->\n");
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

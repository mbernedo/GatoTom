/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.37
 * Generated at: 2016-09-27 19:17:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import edu.ulima.bean.Tipo;
import edu.ulima.bean.Pokemon;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("edu.ulima.bean.Tipo");
    _jspx_imports_classes.add("edu.ulima.bean.Pokemon");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      java.util.ArrayList pokemones = null;
      synchronized (session) {
        pokemones = (java.util.ArrayList) _jspx_page_context.getAttribute("pokemones", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (pokemones == null){
          pokemones = new java.util.ArrayList();
          _jspx_page_context.setAttribute("pokemones", pokemones, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      java.util.ArrayList tipos = null;
      synchronized (session) {
        tipos = (java.util.ArrayList) _jspx_page_context.getAttribute("tipos", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (tipos == null){
          tipos = new java.util.ArrayList();
          _jspx_page_context.setAttribute("tipos", tipos, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>TODO supply a title</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <link href=\"css/estilo01.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link href=\"twitter-bootstrap/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-3\">\r\n");
      out.write("                <p>Pokemon:</p>\r\n");
      out.write("                <input type=\"text\" id=\"nombrePokemon\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-3\">\r\n");
      out.write("                <p> Tipo </p>\r\n");
      out.write("                <select id=\"pokemones\" name=\"pokemon\">\r\n");
      out.write("                    <option value=\"\"></option>\r\n");
      out.write("                    ");
 for (int i = 0; i < tipos.size(); i++) {
                            Tipo tipo = (Tipo) tipos.get(i);
      out.write("\r\n");
      out.write("                    <option value=\"");
      out.print( tipo.getId());
      out.write('"');
      out.write('>');
      out.print( tipo.getTipo());
      out.write("</option>\r\n");
      out.write("                    ");
 } 
      out.write("\r\n");
      out.write("                </select>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-3\">\r\n");
      out.write("                <br>\r\n");
      out.write("                <button class=\"btn btn-primary\" id=\"Filtrar\"> Filtrar </button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-3\">\r\n");
      out.write("                <br>\r\n");
      out.write("                <button class=\"btn btn-primary\" id=\"Ingresar\">Ingresar</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div style=\"margin-top: 55px\">\r\n");
      out.write("            ");
 for (int i = 0; i < pokemones.size(); i++) {
                    Pokemon pokemon = (Pokemon) pokemones.get(i);
            
      out.write("\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-3\">\r\n");
      out.write("                    <input value=\"");
      out.print( pokemon.getNombre());
      out.write("\" class=\"form-control poke");
      out.print( pokemon.getId());
      out.write("\" readonly=\"true\" />\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-3\">\r\n");
      out.write("                    <input value=\"");
      out.print( pokemon.getTipo().getTipo());
      out.write("\" class=\"form-control poke");
      out.print( pokemon.getId());
      out.write("\" readonly=\"true\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-3\">\r\n");
      out.write("                    <a class=\"btn btn-primary eliminar\" id=\"b");
      out.print( pokemon.getId());
      out.write("\"> Eliminar </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <div class=\"col-md-3\">\r\n");
      out.write("                        <a class=\"btn btn-primary modificar\" style=\"display: none\" id=\"m");
      out.print( pokemon.getId());
      out.write("\">Modificar</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-3\">\r\n");
      out.write("                    <a class=\"btn btn-primary editar\"  id=\"e");
      out.print( pokemon.getId());
      out.write("\">Editar</a>\r\n");
      out.write("                </div> \r\n");
      out.write("            </div> \r\n");
      out.write("            ");
 }
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <script src=\"jquery/jquery.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"js/jquery.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

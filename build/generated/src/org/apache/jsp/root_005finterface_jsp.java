package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import hiben.IntfGroup;
import java.util.List;
import org.hibernate.Criteria;
import hiben.Interfaces;
import conn.FactoryManager;
import org.hibernate.Session;
import java.util.Set;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import hiben.Interfaces;
import java.util.List;
import org.hibernate.Criteria;
import hiben.IntfGroup;
import conn.FactoryManager;
import org.hibernate.Session;
import hiben.User;

public final class root_005finterface_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(5);
    _jspx_dependants.add("/partials/header.jsp");
    _jspx_dependants.add("/partials/sidebar_search.jsp");
    _jspx_dependants.add("/partials/top_bar.jsp");
    _jspx_dependants.add("/partials/footer.jsp");
    _jspx_dependants.add("/partials/commonjs.jsp");
  }

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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("    <title>MobiShop</title>\n");
      out.write("\n");
      out.write("    <link href=\"http://localhost:8080/MobiShop/partials/assets/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"http://localhost:8080/MobiShop/partials/assets/font-awesome/css/font-awesome.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <link href=\"http://localhost:8080/MobiShop/partials/assets/css/animate.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"http://localhost:8080/MobiShop/partials/assets/css/style.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Toastr -->\n");
      out.write("    <link href=\"http://localhost:8080/MobiShop/partials/assets/css/plugins/toastr/toastr.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- FAVICONS -->\n");
      out.write("<!--    <link rel=\"shortcut icon\" href=\"http://localhost:8080/MobiShop/partials/assets/img/favicon/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("    <link rel=\"icon\" href=\"http://localhost:8080/MobiShop/partials/assets/img/favicon/favicon.ico\" type=\"image/x-icon\">-->\n");
      out.write("\n");
      out.write("    <!-- GOOGLE FONT -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Open+Sans:400italic,700italic,300,400,700\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar-default navbar-static-side\" role=\"navigation\">\n");
      out.write("    <div class=\"sidebar-collapse\">\n");
      out.write("        <ul class=\"nav\" id=\"side-menu\">\n");
      out.write("            <li class=\"nav-header\">\n");
      out.write("                <div class=\"dropdown profile-element\"> <span>\n");
      out.write("                        <!--                        <img alt=\"image\" class=\"img-circle\" src=\"img/profile_small.jpg\" />\n");
      out.write("                                            </span>\n");
      out.write("                                            <a data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"#\">\n");
      out.write("                                                <span class=\"clear\"> <span class=\"block m-t-xs\"> <strong class=\"font-bold\">David Williams</strong>\n");
      out.write("                                                    </span> <span class=\"text-muted text-xs block\">Art Director <b class=\"caret\"></b></span> </span> </a>\n");
      out.write("                                            <ul class=\"dropdown-menu animated fadeInRight m-t-xs\">\n");
      out.write("                                                <li><a href=\"profile.html\">Profile</a></li>\n");
      out.write("                                                <li><a href=\"contacts.html\">Contacts</a></li>\n");
      out.write("                                                <li><a href=\"mailbox.html\">Mailbox</a></li>\n");
      out.write("                                                <li class=\"divider\"></li>\n");
      out.write("                                                <li><a href=\"login.html\">Logout</a></li>\n");
      out.write("                                            </ul>-->\n");
      out.write("                </div>\n");
      out.write("                <!--                <div class=\"logo-element\">\n");
      out.write("                                    IN+\n");
      out.write("                                </div>-->\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            ");

                try {
                    Session con = FactoryManager.getSessionFactory().openSession();
//                IntfGroup intgrp = null;

                    Criteria cri = con.createCriteria(IntfGroup.class);
                    cri.addOrder(Order.asc("groupName"));

                    List<IntfGroup> intgrplist = cri.list();

                    for (IntfGroup intgrp : intgrplist) {

                        if (intgrp.getGroupName().equals("NoGroup")) {

                            for (Interfaces inf : intgrp.getInterfaceses()) {
            
      out.write("\n");
      out.write("            <li>\n");
      out.write("                <a href=\"http://localhost:8080/MobiShop/");
      out.print(inf.getUrl());
      out.write("\"><i class=\"fa fa-flask\"></i> <span class=\"nav-label\">");
      out.print(inf.getIfaseName());
      out.write("</span> </a>\n");
      out.write("            </li>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");

            } else {
            
      out.write("\n");
      out.write("            <li>\n");
      out.write("                <a href=\"\"><i class=\"fa fa-th-large\"></i> <span class=\"nav-label\">");
      out.print(intgrp.getGroupName());
      out.write("</span> <span class=\"fa arrow\"></span></a>\n");
      out.write("                <ul class=\"nav nav-second-level\">\n");
      out.write("                    ");


                        for (Interfaces inf : intgrp.getInterfaceses()) {
                    
      out.write("\n");
      out.write("\n");
      out.write("                    <li ><a href=\"http://localhost:8080/MobiShop/");
      out.print(inf.getUrl());
      out.write('"');
      out.write('>');
      out.print(inf.getIfaseName());
      out.write("</a></li>\n");
      out.write("\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            ");

                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write(" \n");
      out.write("            <div id=\"page-wrapper\" class=\"gray-bg top-navigation\">\n");
      out.write("                <div class=\"row border-bottom\">\n");
      out.write("                    ");
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("<!--<!DOCTYPE html>-->\n");
      out.write("<!--<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("    </body>\n");
      out.write("</html>-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");


        User u = null;

        u = (User) session.getAttribute("user");

      out.write("\n");
      out.write("<nav class=\"navbar navbar-static-top\" role=\"navigation\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("        <button aria-controls=\"navbar\" aria-expanded=\"false\" data-target=\"#navbar\" data-toggle=\"collapse\" class=\"navbar-toggle collapsed\" type=\"button\">\n");
      out.write("            <i class=\"fa fa-reorder\"></i>\n");
      out.write("        </button>\n");
      out.write("        <a href=\"http://localhost:8080/MobiShop/\" class=\"navbar-brand\"><strong style=\"font-family: Forte; font-size: x-large\" >MobiShop</strong></a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"navbar-collapse collapse\" id=\"navbar\">\n");
      out.write("        <ul class=\"nav navbar-nav\">\n");
      out.write("            <li class=\"\">\n");
      out.write("                <a aria-expanded=\"false\" role=\"button\" href=\"http://localhost:8080/MobiShop/search.jsp?category=1\"><h3 style=\"color: #222\">Mobile Phones</h3></a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"\">\n");
      out.write("                <a aria-expanded=\"false\" role=\"button\" href=\"http://localhost:8080/MobiShop/search.jsp?category=2\"><h3 style=\"color: #222\">Tabs and iPads</h3></a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"\">\n");
      out.write("                <form role=\"search\" class=\"navbar-form-custom\" method=\"get\" action=\"search.jsp\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <input type=\"text\" placeholder=\"Search for something...\" class=\"form-control\" name=\"search\" id=\"search\">\n");
      out.write("                    </div>                    \n");
      out.write("                </form>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!--            \n");
      out.write("                        <li class=\"\">\n");
      out.write("                            <a aria-expanded=\"false\" role=\"button\" href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"> Menu item <span class=\"caret\"></span></a>\n");
      out.write("                            <ul role=\"menu\" class=\"dropdown-menu\">\n");
      out.write("                                <li><a href=\"\">Menu item</a></li>\n");
      out.write("                                <li><a href=\"\">Menu item</a></li>\n");
      out.write("                                <li><a href=\"\">Menu item</a></li>\n");
      out.write("                                <li><a href=\"\">Menu item</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </ul>\n");
      out.write("        <ul class=\"nav navbar-top-links navbar-right\">\n");
      out.write("            <li>\n");
      out.write("                <span class=\"m-r-sm text-muted welcome-message\"><strong>Welcome \n");
      out.write("                        ");

                            if (u != null) {
                        
      out.write("\n");
      out.write("                        <a href=\"http://localhost:8080/MobiShop/myprofile.jsp\">\n");
      out.write("                            ");

                                out.write(u.getPersonalDetails().getFName());
                            
      out.write("\n");
      out.write("                        </a>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                        to MobiShop</strong></span>\n");
      out.write("            </li>    \n");
      out.write("            <li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                ");

                    if (u == null) {
                
      out.write("\n");
      out.write("                <a href=\"http://localhost:8080/MobiShop/login.jsp\">\n");
      out.write("                    <i class=\"fa fa-sign-in\"></i> \n");
      out.write("                    Log In\n");
      out.write("                </a>\n");
      out.write("                ");

                } else {
                
      out.write("\n");
      out.write("                <a href=\"http://localhost:8080/MobiShop/logout\">\n");
      out.write("                    <i class=\"fa fa-sign-in\"></i>\n");
      out.write("                    Log Out\n");
      out.write("                </a>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write(" \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                ");
                    try {

                        User user = (User) session.getAttribute("user");

                        if (user == null) {
                            response.sendRedirect("login.jsp");
                            return;
                        }
                        if (user.getUserType().getType().equals("Root")) {
                        } else {
                            response.sendRedirect("login.jsp");
                            return;
                        }

                        Session con = FactoryManager.getSessionFactory().openSession();

                        Interfaces intf = null;
                        String action = "";
                        String id = request.getParameter("id");
                        if (id == null) {
                            action = "addInterface";
                        } else {
                            action = "editInterface";
                            intf = (Interfaces) con.load(Interfaces.class, Integer.parseInt(id));
                        }

                        Criteria cri = con.createCriteria(Interfaces.class);

                        List<Interfaces> intflist = cri.list();

                        cri = con.createCriteria(IntfGroup.class);

                        List<IntfGroup> intfgrplist = cri.list();
                
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <div class=\"panel blank-panel\">\n");
      out.write("\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <div class=\"panel-title m-b-md\"><h3>User Interfaces and Interface Group</h3></div>\n");
      out.write("                                <div class=\"panel-options\">\n");
      out.write("\n");
      out.write("                                    <ul class=\"nav nav-tabs\">\n");
      out.write("                                        <li class=\"active\"><a data-toggle=\"tab\" href=\"#tab-1\">User Interfaces</a></li>\n");
      out.write("                                        <li class=\"\"><a data-toggle=\"tab\" href=\"#tab-2\">Interface Group</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("\n");
      out.write("                                <div class=\"tab-content\">\n");
      out.write("                                    <div id=\"tab-1\" class=\"tab-pane active\">\n");
      out.write("                                        <div class=\"col-lg-12\">\n");
      out.write("                                            <div class=\"ibox float-e-margins\">\n");
      out.write("                                                <div class=\"ibox-title\">\n");
      out.write("                                                    <h5> Interfaces\n");
      out.write("                                                        <!--<small>Enter the details of the journal you want to create</small>-->\n");
      out.write("                                                    </h5>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <div class=\"ibox-content\">\n");
      out.write("                                                    <form name=\"add_interface\" method=\"post\" id=\"add_interface\" class=\"form-horizontal\"\n");
      out.write("                                                          action=\"");
      out.print(action);
      out.write("\">\n");
      out.write("                                                        <div class=\"row\">\n");
      out.write("                                                            <div class=\"col-lg-12\">\n");
      out.write("                                                                <div class=\"form-group\">\n");
      out.write("                                                                    <label class=\"col-sm-3 control-label\">Interface Group : </label>\n");
      out.write("                                                                    <div class=\"col-sm-6\">\n");
      out.write("                                                                        <select class=\"form-control\" name=\"igid\">                                                                            \n");
      out.write("                                                                            <option value=\"\">---</option>\n");
      out.write("                                                                            ");

                                                                                for (IntfGroup intfygp : intfgrplist) {
                                                                                    if (intf != null && intfygp.equals(intf.getIntfGroup())) {
                                                                            
      out.write("\n");
      out.write("                                                                            <option value=\"");
      out.print(intfygp.getIdintfGroup());
      out.write("\" selected=\"\">");
      out.print(intfygp.getGroupName());
      out.write("</option>\n");
      out.write("                                                                            ");

                                                                            } else {
                                                                            
      out.write("\n");
      out.write("                                                                            <option value=\"");
      out.print(intfygp.getIdintfGroup());
      out.write('"');
      out.write('>');
      out.print(intfygp.getGroupName());
      out.write("</option>\n");
      out.write("                                                                            ");

                                                                                    }
                                                                                }
                                                                            
      out.write("\n");
      out.write("                                                                        </select>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                                <div class=\"form-group\">\n");
      out.write("                                                                    <label class=\"col-sm-3 control-label\">Interface Name : </label>\n");
      out.write("                                                                    ");
 if (intf != null) {
      out.write("\n");
      out.write("                                                                    <div class=\"col-sm-6\">\n");
      out.write("                                                                        <input type=\"hidden\" name=\"id\" value=\"");
      out.print(intf.getIdinterfaces());
      out.write("\">\n");
      out.write("                                                                        <input name=\"name\" required=\"\" type=\"text\" class=\"form-control\"\n");
      out.write("                                                                               value=\"");
      out.print(intf.getIfaseName());
      out.write("\" placeholder=\"Enter Interface Name\">\n");
      out.write("                                                                    </div>                                                                    \n");
      out.write("                                                                    ");
 } else { 
      out.write("\n");
      out.write("                                                                    <div class=\"col-sm-6\">   \n");
      out.write("                                                                        <input type=\"hidden\" name=\"id\" value=\"\">\n");
      out.write("                                                                        <input name=\"name\" required=\"\" type=\"text\" class=\"form-control\" placeholder=\"Enter Interface Name\">\n");
      out.write("                                                                    </div>                                                                    \n");
      out.write("                                                                    ");
 } 
      out.write("\n");
      out.write("                                                                </div>\n");
      out.write("                                                                <div class=\"form-group\">\n");
      out.write("                                                                    <label class=\"col-sm-3 control-label\">Interface URL : </label>\n");
      out.write("                                                                    ");
 if (intf != null) {
      out.write("\n");
      out.write("                                                                    <div class=\"col-sm-6\">                                                                        \n");
      out.write("                                                                        <input name=\"url\" required=\"\" type=\"text\" class=\"form-control\"\n");
      out.write("                                                                               value=\"");
      out.print(intf.getUrl());
      out.write("\" placeholder=\"Enter Interface URL\">\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div class=\"col-sm-3 \">\n");
      out.write("                                                                        <button class=\"btn btn-primary\" type=\"submit\">Update Interface\n");
      out.write("                                                                            <span class=\"fa fa-plus\"></span></button>\n");
      out.write("                                                                        <a href=\"http://localhost:8080/MobiShop/root_interface.jsp\" class=\"btn btn-primary\">\n");
      out.write("                                                                            Clear\n");
      out.write("                                                                        </a>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    ");
 } else { 
      out.write("\n");
      out.write("                                                                    <div class=\"col-sm-6\">\n");
      out.write("                                                                        <input name=\"url\" required=\"\" type=\"text\" class=\"form-control\" placeholder=\"Enter Interface URL\">\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div class=\"col-sm-3 \">\n");
      out.write("                                                                        <button class=\"btn btn-primary\" type=\"submit\">Add Interface\n");
      out.write("                                                                            <span class=\"fa fa-plus\"></span></button>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    ");
 } 
      out.write("\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </form>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <div class=\"row\">\n");
      out.write("                                                    <div class=\"col-lg-12\">\n");
      out.write("                                                        <div class=\"ibox float-e-margins\">\n");
      out.write("                                                            <div class=\"ibox-title\">\n");
      out.write("                                                                <h5>\n");
      out.write("                                                                    Interface\n");
      out.write("                                                                    <!--<small>Enter the details of the journal you want to create</small>-->\n");
      out.write("                                                                </h5>                                          \n");
      out.write("                                                            </div>\n");
      out.write("\n");
      out.write("                                                            <div class=\"ibox-content\">\n");
      out.write("                                                                <div class=\"row\">\n");
      out.write("                                                                    <table class=\"table table-hover\">\n");
      out.write("                                                                        <tr>\n");
      out.write("                                                                            <th><h3>Interface Group</h3></th>\n");
      out.write("                                                                        <th><h3>Interface</h3></th>\n");
      out.write("                                                                        <th><h3>URL</h3></th>\n");
      out.write("                                                                        <th></th>\n");
      out.write("                                                                        </tr>\n");
      out.write("                                                                        ");

                                                                            for (Interfaces inerface : intflist) {
                                                                        
      out.write("\n");
      out.write("                                                                        <tr>\n");
      out.write("                                                                            <td>                                                                                \n");
      out.write("                                                                                <h4> ");
      out.print(inerface.getIntfGroup().getGroupName());
      out.write("</h4>\n");
      out.write("                                                                            </td>\n");
      out.write("                                                                            <td>\n");
      out.write("                                                                                <h4>");
      out.print(inerface.getIfaseName());
      out.write("</h4>\n");
      out.write("                                                                            </td>\n");
      out.write("                                                                            <td >\n");
      out.write("                                                                                <h4>");
      out.print(inerface.getUrl());
      out.write("</h4>\n");
      out.write("                                                                            </td>\n");
      out.write("                                                                            <td>\n");
      out.write("                                                                                <a href=\"");
      out.print("http://localhost:8080/MobiShop/root_interface.jsp?id=" + inerface.getIdinterfaces());
      out.write("\">\n");
      out.write("                                                                                    <button class=\"btn btn-default pull-right\" type=\"button\">Edit</button>\n");
      out.write("                                                                                </a> \n");
      out.write("                                                                            </td>\n");
      out.write("                                                                        </tr>\n");
      out.write("                                                                        ");

                                                                            }
                                                                        
      out.write("\n");
      out.write("                                                                    </table>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div id=\"tab-2\" class=\"tab-pane\">\n");
      out.write("\n");
      out.write("                                        ");

                                            IntfGroup ig = null;
                                            String actionig = "";
                                            String idig = request.getParameter("idgroup");
                                            if (idig == null) {
                                                actionig = "addIntfGroup";
                                            } else {
                                                actionig = "editIntfGroup";
                                                ig = (IntfGroup) con.load(IntfGroup.class, Integer.parseInt(idig));
                                            }
                                        
      out.write("\n");
      out.write("\n");
      out.write("                                        <div class=\"col-lg-12\">\n");
      out.write("                                            <div class=\"ibox float-e-margins\">\n");
      out.write("                                                <div class=\"ibox-title\">\n");
      out.write("                                                    <h5>Interface Group\n");
      out.write("                                                        <!--<small>Enter the details of the journal you want to create</small>-->\n");
      out.write("                                                    </h5>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <div class=\"ibox-content\">\n");
      out.write("                                                    <form name=\"add_Interface_group\" method=\"post\" id=\"add_Interface_group\" class=\"form-horizontal\"\n");
      out.write("                                                          action=\"");
      out.print(actionig);
      out.write("\">\n");
      out.write("                                                        <div class=\"row\">\n");
      out.write("                                                            <div class=\"col-lg-12\">\n");
      out.write("                                                                <div class=\"form-group\">\n");
      out.write("                                                                    <label class=\"col-sm-3 control-label\">Interface Group Name : </label>\n");
      out.write("                                                                    ");
 if (ig != null) {
      out.write("\n");
      out.write("                                                                    <div class=\"col-sm-6\">\n");
      out.write("                                                                        <input type=\"hidden\" name=\"idgroup\" value=\"");
      out.print(ig.getIdintfGroup());
      out.write("\">\n");
      out.write("                                                                        <input name=\"name\" required=\"\" type=\"text\" class=\"form-control\"\n");
      out.write("                                                                               value=\"");
      out.print(ig.getGroupName());
      out.write("\" placeholder=\"Enter Group Name\">\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div class=\"col-sm-3 \">\n");
      out.write("                                                                        <button class=\"btn btn-primary\" type=\"submit\">Update Interface Group\n");
      out.write("                                                                            <span class=\"fa fa-plus\"></span></button>\n");
      out.write("                                                                        <a href=\"http://localhost:8080/MobiShop/root_interface.jsp\" class=\"btn btn-primary\">Clear</a>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    ");
 } else { 
      out.write("\n");
      out.write("\n");
      out.write("                                                                    <div class=\"col-sm-6\">\n");
      out.write("                                                                        <input type=\"hidden\" name=\"idgroup\" value=\"\">\n");
      out.write("                                                                        <input name=\"name\" required=\"\" type=\"text\" class=\"form-control\" placeholder=\"Enter Group Name\">\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div class=\"col-sm-3 \">\n");
      out.write("                                                                        <button class=\"btn btn-primary\" type=\"submit\">Add Interface Group\n");
      out.write("                                                                            <span class=\"fa fa-plus\"></span></button>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </form>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <div class=\"row\">\n");
      out.write("                                                    <div class=\"col-lg-12\">\n");
      out.write("                                                        <div class=\"ibox float-e-margins\">\n");
      out.write("                                                            <div class=\"ibox-title\">\n");
      out.write("                                                                <h5>\n");
      out.write("                                                                    Interface Group\n");
      out.write("                                                                    <!--<small>Enter the details of the journal you want to create</small>-->\n");
      out.write("                                                                </h5>                                          \n");
      out.write("                                                            </div>\n");
      out.write("\n");
      out.write("                                                            <div class=\"ibox-content\">\n");
      out.write("                                                                <div class=\"row\">\n");
      out.write("                                                                    <table class=\"table\">\n");
      out.write("                                                                        ");

                                                                            for (IntfGroup intfgp : intfgrplist) {
                                                                        
      out.write("\n");
      out.write("                                                                        <tr>\n");
      out.write("                                                                            <td>\n");
      out.write("                                                                                <div class=\"col-sm-8\">\n");
      out.write("                                                                                    <input name=\"idgroup\" type=\"hidden\" class=\"form-control\" value=\"\">\n");
      out.write("\n");
      out.write("                                                                                    <h3 style=\"padding-left: 20px\">");
      out.print(intfgp.getGroupName());
      out.write("</h3>\n");
      out.write("                                                                                </div>\n");
      out.write("                                                                                <div class=\"col-sm-4\">                                                                    \n");
      out.write("                                                                                    <a href=\"");
      out.print("http://localhost:8080/MobiShop/root_interface.jsp?idgroup=" + intfgp.getIdintfGroup());
      out.write("\">\n");
      out.write("                                                                                        <button class=\"btn btn-default pull-right\" type=\"button\">Edit</button>\n");
      out.write("                                                                                    </a>\n");
      out.write("                                                                                </div>\n");
      out.write("                                                                            </td>\n");
      out.write("                                                                        </tr>\n");
      out.write("                                                                        ");

                                                                            }
                                                                        
      out.write("\n");
      out.write("                                                                    </table>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");

                }catch(Exception e){
                    e.printStackTrace();
                }

      out.write("\n");
      out.write("            </div>\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"footer\" style=\"position: relative\">\n");
      out.write("    <strong>Copyright</strong> Example Company &copy; 2015-2016\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"http://localhost:8080/MobiShop/partials/assets/js/jquery-2.1.1.js\"></script>\n");
      out.write("<script src=\"http://localhost:8080/MobiShop/partials/assets/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"http://localhost:8080/MobiShop/partials/assets/js/plugins/metisMenu/jquery.metisMenu.js\"></script>\n");
      out.write("<script src=\"http://localhost:8080/MobiShop/partials/assets/js/plugins/slimscroll/jquery.slimscroll.min.js\"></script>\n");
      out.write("<script src=\"http://localhost:8080/MobiShop/partials/assets/js/plugins/toastr/toastr.min.js\"></script>\n");
      out.write("<script src=\"http://localhost:8080/MobiShop/partials/assets/js/inspinia.js\"></script>\n");
      out.write("<script src=\"http://localhost:8080/MobiShop/partials/assets/js/plugins/pace/pace.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- jQuery UI \n");
      out.write("<script src=\"http://localhost:8080/MobiShop/partials/assets/js/plugins/jquery-ui/jquery-ui.min.js\"></script>\n");
      out.write("\n");
      out.write(" Flot \n");
      out.write("<script src=\"http://localhost:8080/MobiShop/partials/assets/js/js/plugins/flot/jquery.flot.js\"></script>\n");
      out.write("<script src=\"http://localhost:8080/MobiShop/partials/assets/js/js/plugins/flot/jquery.flot.tooltip.min.js\"></script>\n");
      out.write("<script src=\"http://localhost:8080/MobiShop/partials/assets/js/js/plugins/flot/jquery.flot.spline.js\"></script>\n");
      out.write("<script src=\"http://localhost:8080/MobiShop/partials/assets/js/js/plugins/flot/jquery.flot.resize.js\"></script>\n");
      out.write("<script src=\"http://localhost:8080/MobiShop/partials/assets/js/js/plugins/flot/jquery.flot.pie.js\"></script>-->");
      out.write("\n");
      out.write("\n");
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

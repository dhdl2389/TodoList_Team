/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.79
 * Generated at: 2023-09-19 07:21:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.json.JSONObject;
import java.util.ArrayList;
import TodoBoard.Board;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1694691672641L));
    _jspx_dependants.put("jar:file:/C:/Users/khs22/Desktop/TeamProject/TodoListTeamProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/TodoTeamProject/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.json.JSONObject");
    _jspx_imports_classes.add("TodoBoard.Board");
    _jspx_imports_classes.add("java.util.ArrayList");
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<script	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("	\r\n");
      out.write("	*{\r\n");
      out.write("		margin:0px;\r\n");
      out.write("		padding:0px;\r\n");
      out.write("	}\r\n");
      out.write("	button{\r\n");
      out.write("		width: 50px;\r\n");
      out.write("		height: 30px;\r\n");
      out.write("		color: #2564cf;\r\n");
      out.write("		background-color: white;\r\n");
      out.write("		border: 1px solid #e1dfdd;\r\n");
      out.write("		transition: all 0.2s ;\r\n");
      out.write("		\r\n");
      out.write("	}\r\n");
      out.write("	button:hover{\r\n");
      out.write("		background: #faf9f8;\r\n");
      out.write("	}\r\n");
      out.write("	hr{\r\n");
      out.write("		background:#e1dfdd;\r\n");
      out.write("  		height:1px;\r\n");
      out.write("    	border:0;\r\n");
      out.write("    	margin-top: 15px;\r\n");
      out.write("    	margin-bottom: 15px;\r\n");
      out.write("	}\r\n");
      out.write("	header{\r\n");
      out.write("		width: 100%;\r\n");
      out.write("		height:48px;\r\n");
      out.write("		background-color: #2564cf;\r\n");
      out.write("		/*border: 1px solid black;*/\r\n");
      out.write("		\r\n");
      out.write("		position: relative;\r\n");
      out.write("		display: flex;\r\n");
      out.write("	}\r\n");
      out.write("	header img{\r\n");
      out.write("		width: 15px;\r\n");
      out.write("		height: 15px;\r\n");
      out.write("		margin-left: 10px;\r\n");
      out.write("		margin-top: 14px;\r\n");
      out.write("	}\r\n");
      out.write("	header .title{\r\n");
      out.write("		color: white;\r\n");
      out.write("		font-size: 16px;\r\n");
      out.write("		font-weight: bold;\r\n");
      out.write("		margin-left: 40px;\r\n");
      out.write("		position: relative;\r\n");
      out.write("		top: 12px;\r\n");
      out.write("​\r\n");
      out.write("	}\r\n");
      out.write("	header .wrapSearch{\r\n");
      out.write("		width: 400px;\r\n");
      out.write("		height: 32px;\r\n");
      out.write("		background-color: white;\r\n");
      out.write("		border-radius: 5px;\r\n");
      out.write("		margin: 0 auto;\r\n");
      out.write("		margin-top: 7px;\r\n");
      out.write("		\r\n");
      out.write("	}\r\n");
      out.write("	.wrapSearch img{\r\n");
      out.write("		position: relative;\r\n");
      out.write("		top: -5px;\r\n");
      out.write("	}\r\n");
      out.write("	header .searchInsert{\r\n");
      out.write("		width: 300px;\r\n");
      out.write("		height: 20px;\r\n");
      out.write("		outline: none;\r\n");
      out.write("		border: none;\r\n");
      out.write("		margin-left: 10px;\r\n");
      out.write("		position: relative;\r\n");
      out.write("		top: -8px;\r\n");
      out.write("		\r\n");
      out.write("	}\r\n");
      out.write("	.logOutIcon{\r\n");
      out.write("		width: 35px;\r\n");
      out.write("		height: 35px;\r\n");
      out.write("		\r\n");
      out.write("		position: absolute;\r\n");
      out.write("		right: 10px;\r\n");
      out.write("		top: -8px;\r\n");
      out.write("		\r\n");
      out.write("		filter: invert(100%) sepia(0%) saturate(7499%) hue-rotate(169deg) brightness(125%) contrast(98%);\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.wrapContents{\r\n");
      out.write("		display: flex;\r\n");
      out.write("	}\r\n");
      out.write("	nav{\r\n");
      out.write("		width: 15%;\r\n");
      out.write("		height: 900px;\r\n");
      out.write("		border-right: 1px solid #edeceb;\r\n");
      out.write("		padding-top: 15px;\r\n");
      out.write("		position: relative;\r\n");
      out.write("	}\r\n");
      out.write("	.wrapMenu{\r\n");
      out.write("		width: 90%;\r\n");
      out.write("		height: 50px;\r\n");
      out.write("		line-height: 50px;\r\n");
      out.write("		text-align: left;\r\n");
      out.write("		padding-left: 30px;\r\n");
      out.write("	}\r\n");
      out.write("	.wrapMenu img{\r\n");
      out.write("		margin-right: 5px;\r\n");
      out.write("		position: relative;\r\n");
      out.write("		top: 2px;\r\n");
      out.write("	}\r\n");
      out.write("	.wrapMenu:hover{\r\n");
      out.write("		background-color: #eff6fc;\r\n");
      out.write("	}\r\n");
      out.write("	a{\r\n");
      out.write("		color: black;\r\n");
      out.write("		text-decoration: none;\r\n");
      out.write("		font-size: 14px;\r\n");
      out.write("	}\r\n");
      out.write("	a:hover{\r\n");
      out.write("		font-weight: bold;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	section{\r\n");
      out.write("		width: 85%;\r\n");
      out.write("		height: 900px;\r\n");
      out.write("		background-color: #faf9f8;\r\n");
      out.write("		/*border: 1px solid black;*/\r\n");
      out.write("		padding-top: 20px;\r\n");
      out.write("	}\r\n");
      out.write("	.todayToDoTitle{\r\n");
      out.write("		font-size: 20px;\r\n");
      out.write("		color: #292827;\r\n");
      out.write("		font-weight: bold;\r\n");
      out.write("		margin-left: 25px;\r\n");
      out.write("	}\r\n");
      out.write("	.toDo{\r\n");
      out.write("		width: 97%;\r\n");
      out.write("		height: 52px;\r\n");
      out.write("		border: 1px solid #edeceb;\r\n");
      out.write("		background-color: white;\r\n");
      out.write("		box-shadow: 1px 1px 1px #edeceb;\r\n");
      out.write("		border-radius: 5px;\r\n");
      out.write("		margin: 10px auto;\r\n");
      out.write("		line-height: 52px;\r\n");
      out.write("		\r\n");
      out.write("		position: relative;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	/*.checkBox {\r\n");
      out.write("        /* border: 1px solid black; \r\n");
      out.write("        float: left;\r\n");
      out.write("        margin-left: 70px;\r\n");
      out.write("        margin-top: -65px;\r\n");
      out.write("        cursor: pointer;\r\n");
      out.write("      }\r\n");
      out.write("      */\r\n");
      out.write("      \r\n");
      out.write("      .checkBox{\r\n");
      out.write("		  position: relative;\r\n");
      out.write("		  top: 3px;\r\n");
      out.write("	  }\r\n");
      out.write("      \r\n");
      out.write("      .toDo label{\r\n");
      out.write("		  padding-left: 5px;\r\n");
      out.write("	  }\r\n");
      out.write("      \r\n");
      out.write("      #toDoInsert{\r\n");
      out.write("		  width: 90.5%;\r\n");
      out.write("		  height: 46px;\r\n");
      out.write("		  outline: none;\r\n");
      out.write("		  border: none;\r\n");
      out.write("		  padding-left: 5px;\r\n");
      out.write("		\r\n");
      out.write("	  }\r\n");
      out.write("      input[type=\"checkbox\"] {\r\n");
      out.write("	    width: 1rem;\r\n");
      out.write("	    height: 1rem;\r\n");
      out.write("	    border-radius: 50%;\r\n");
      out.write("	    border: 1px solid #999;\r\n");
      out.write("	    appearance: none;\r\n");
      out.write("	    cursor: pointer;\r\n");
      out.write("	    transition: background 0.2s;\r\n");
      out.write("	    \r\n");
      out.write("	    margin-left: 10px;\r\n");
      out.write("  }\r\n");
      out.write("      \r\n");
      out.write("      input[type=\"checkbox\"]:checked {\r\n");
      out.write("        appearance: none;\r\n");
      out.write("        background-color: #2564cf;\r\n");
      out.write("        width: 1rem;\r\n");
      out.write("        height: 1rem;\r\n");
      out.write("        border: 2px solid black;\r\n");
      out.write("        border-radius: 50%;\r\n");
      out.write("      }\r\n");
      out.write("      .wrapButton{\r\n");
      out.write("		 position: absolute;\r\n");
      out.write("		 right: 15px;\r\n");
      out.write("		 top: 0px;\r\n");
      out.write("	  }\r\n");
      out.write("​\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("window.addEventListener(\"load\", test);\r\n");
      out.write("\r\n");
      out.write("function test(){\r\n");
      out.write("	$.ajax({\r\n");
      out.write("		type:\"get\",\r\n");
      out.write("		url:\"/TodoTeamProject/mainData\",\r\n");
      out.write("		dataType:\"json\",\r\n");
      out.write("		success:function(data){\r\n");
      out.write("			output='';\r\n");
      out.write("			$.each(data,function(){ \r\n");
      out.write("				output+= '<span>';\r\n");
      out.write("				output+='<div class=\"toDo\"><input type=\"checkbox\" class=\"checkBox\"><label for=\"toDo2\">';\r\n");
      out.write("				output+= this.contents;\r\n");
      out.write("				output+= '</label><div class=\"wrapButton\"><button onclick=\"selectContents('+ this.code + ')\">수정</button><button>삭제</button></div></div>';\r\n");
      out.write("				output+= '</span>';\r\n");
      out.write("			});\r\n");
      out.write("			document.getElementById('disp').innerHTML = output;\r\n");
      out.write("		} \r\n");
      out.write("	});\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("function test2(){\r\n");
      out.write("	$.ajax({\r\n");
      out.write("		type:\"get\",\r\n");
      out.write("		url:\"/TodoTeamProject/completeData\",\r\n");
      out.write("		dataType:\"json\",\r\n");
      out.write("		success:function(data){\r\n");
      out.write("			output='';\r\n");
      out.write("			$.each(data,function(){ \r\n");
      out.write("				output+= '<span>';\r\n");
      out.write("				output+='<div class=\"toDo\"><input type=\"checkbox\" class=\"checkBox\"><label for=\"toDo2\">';\r\n");
      out.write("				output+= this.contents;\r\n");
      out.write("				output+= '</label><div class=\"wrapButton\"><button onclick=\"selectContents('+ this.code + ')\">수정</button><button>삭제</button></div></div>';\r\n");
      out.write("				output+= '</span>';\r\n");
      out.write("			});\r\n");
      out.write("			document.getElementById('disp').innerHTML = output;\r\n");
      out.write("		} \r\n");
      out.write("	});\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function selectContents(itemCode) {\r\n");
      out.write("    // Redirect to update.jsp with the item ID\r\n");
      out.write("    window.location.href = 'update?code=' + itemCode;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"wrapOutside\">\r\n");
      out.write("\r\n");
      out.write("        <header>\r\n");
      out.write("			<img src=\"data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wBDABQODxIPDRQSEBIXFRQYHjIhHhwcHj0sLiQySUBMS0dARkVQWnNiUFVtVkVGZIhlbXd7gYKBTmCNl4x9lnN+gXz/2wBDARUXFx4aHjshITt8U0ZTfHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHz/wAARCABUAFUDASIAAhEBAxEB/8QAGwABAAMBAQEBAAAAAAAAAAAAAAQFBgMCAQf/xAArEAACAgEDAgUEAgMAAAAAAAABAgADBAUREgYxEyFBUZEyYXGhIoEUQrH/xAAZAQACAwEAAAAAAAAAAAAAAAADBAABAgX/xAAfEQADAQEBAQADAQEAAAAAAAAAAQIRAxIxBCFhEzL/2gAMAwEAAhEDEQA/AISqzsFUEsTsAPWWqdPZroGJqQn/AFZjv+hPHTyo2prz23Ckr+Zro927VDxC3PmqWsweTjW4tprvQqw/c5TSdUKngUN5c+RA/G0zcPzv3Og7ny8OuNjW5VoroQsx/UsX6ezUQsDU5H+qsd/2JO6XVPAvby58gD+Npexbr3qaxBY5prWfn7KyMVYEMDsQfSfJZ9Qqi6m3DbcqC35lZGpr1KYFrHhLwtNyM4nwVAUd2Y7CdsvRMvFqNjBLFHfgd9po9HVF0zH4bbFdzt7+smEAgg9vWKV+RSr+B1yTR+fxOmQFXItCfSHIH43iOi58qtem1bK24up3Bl2nUzhALMZWf1IfYfG0oYmK5zf/AEjSpz8JOdnW513iXEeXkqjsBI0RNpJLEZb0k4Odbg3eJSR5+TKexEtX6mcoRXjKr+hL7j42lDExXOKetGldL9I922vda1ljcnY7kzxETZksdN1e7AU18RZV34k7bfgyRl9Q3X1GumoU8vIty3P9SmiDfKG9aNe6SzRERCGTrjY75V6U1DdmPxNCnTWOEHiXWl/UrsB/yVegWpVqa8ztyUqD95r4p36VNYg/KE1rMXqenPp9oUtzRvpbaQpouqLU8Omrf+fLlt7CZ2H5U6hNg7SVYibpmnPqFpUNwRfqbaXL9NY5Q+HdaH9C2xH/ACc+l7U8O6rf+fLlt7iX8V7dbV4g3OJc6zB5OO+Le9No2ZT8zlLLX7Ut1N+B34qFJ+8rY5DblNi9LHhb6Vopza/GvcpUewXuZKzOnEWkti2OXA34vsd/iWWjWpbplPA/QvEj2Ikx3VELuQFUbkmI12tWMzznyYAjY7GJ0vcWX2OvZmJHzE6Aqc5OTWM+tAi5DbD3AJ+SJBiU5T+otNr4erLHtcvYxdj3JO88xEso9V2PU4etijDsQdpMfWM+xCjZDbH2AB+QJBiU5T+otNr4IiJZR2xsu/Ectj2MhPfbsf6nTJ1LLyk4X3sy+wAA/UixK8rdwvX8EREsolabif5uYlJOy92P2msTTMKtAgxqiB6soJ+TMtpGWuHnJY/0EcWPsDNiliWIHrdWQ+YIPlEvyXSr+DHJLDMa7pteG6W0Datztx9jKiXfUWdVeUopYOEO7MO2/tKSM8vThegV56/Rb6FpteY723jetDtx9zL99MwrEKHGqAPqqgH5EpOnc6qgvRcwQOd1Y9t/aaN7ErQvY6qg8ySfKKd3asPzU+TF6lif4WY9IO691P2kWTdXy1zM57E+gDip9wJCjsb5W/Ras39Gl0XSaDjLkZCCx381DeYA/EmZmkYmRSVSlKn2/iyLt5/1OOhZ9V2JXQWC21jjxJ7j3EnZmZTh0my1wPLyX1J+0Qur/wBP6NSp8mIdSjsjd1OxiLXNlrue7MSf7idEUPMREhBERIQRESEEREhBERIQRESEP//Z\">\r\n");
      out.write("            <p class=\"title\">To Do</p>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"wrapSearch\">\r\n");
      out.write("				<img width=\"30px\" height=\"30px\" src=\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAACXBIWXMAAAsTAAALEwEAmpwYAAAD8UlEQVR4nO2ZXYhVVRTH9wyRJUhZ2kPRJxolOXPPXufaKNFEJSQiROJLpuOcte6ZDIbwqcfpgxChh4pejMowggrR6NGPpl5E8+61TjPCwBSEQUnYx0NYJjU39h0v3Ls9907es891bswfztu9/31++2PttdZRakEL6m71j8htAZondImfA5IX7KNL/HyAyVMQl+9TqtKj5qsCNPdr4j2AMg0klZYP8k+AvA9QHlHzRYVhXqVRPgXimTkB0qFMWOINVw1gcGz8Go38CqBcbAuAGh+NcmAAT9/UUYjVOyeWAsmXTV+K5G9APgHEHwHK60DymibZD8jHAOV889WRMwGavo5AFIZ5uSaeTAdg1iQ7IC4va/b/gV3Hrw8w2QTEh9KB+DeIkwdzhYC4vFijfJXyAj8A8tNqrNJ7JX5BZNam+qGcK1Jyb34gxO+lrUK4Y/L2dj1XbTl9rSZ+N8V30k6cf4hINqasxNHBofHrvPiT7E7x3618Rygg+cZZ/mmvUWas0gvIB53z8lc4PHGPtzHCyGxzYv8/YZQEyrPWRVNLAOVHZ6y3vQ0AJMed8Lpf5SRNEjv3yx8Ql2/IbNw/Inc13to8E6BZoXLSoN3GKGfqYQKUZzIbAzK5UcrLG7cQkLzhHPr3VVYB8V7nkL+ocpam5FFnzKnspihf1JuGJbNZ5SyIy8sckIt2y2UyddMRTeUBlbsqPZrkz/pxM4d69/7INXWokxuGs2QPlwzZNESQyKxVuavSA8gXvK6IRjnS6TNSGObl7g2f+YwA8ltOKHxJ5awgMo/5j1okWxtvWhYvb9tCGuVNJ03Zp3x0RGxuVW9cGOGVKs8Smvh7JyXa6sVckxx2tteHKicB8k5nW523yaQnc9niZr+aDCjPWhdNLdEkZ52DvtffCGOVXptjOTP1bXHbyZu9joG2rdQwYRfWUHK38ilNUrq8guPPbTPBjz/vSandX1U+VSQpaJKfU0rRahSDuHxHu94rRqcXpfUCAHnC1yRVBfHXWhP/kgZRF1XO2irySrsoECcPuZnDpZU457Xm+S8QzpOEURL1PZvc0tyzvBgieRKIP0v1QP4VUNZcTYjGqDbbr/qk1mkE4g808Xi1dG3+v+/CKHmgYxC2JWrLTyAzCsi/twVLl0F8bFuxHYeo/T6IzJ12tm1i1w6AtiuHvN4bQDsQ9QoicyuQvAwkp6pN7DmCg0Z5J4jMw14BskK46h+SG8MSP17dfii7Zr9amVF7yHMtzIot7okaBBBvV/NZxTkgZjPf/wME8pCazwrQ9LW8J7oBonYgm3y06R6I1jA8AygjqtvU3wDTpRANMMQnuxqipsx9owUtSHW9/gVC5jtJi6WCCwAAAABJRU5ErkJggg==\">\r\n");
      out.write("				<input type=\"text\" class=\"searchInsert\">\r\n");
      out.write("			</div>\r\n");
      out.write("           \r\n");
      out.write("            <a href=\"\"><img class=\"logOutIcon\" src=\"https://img.icons8.com/material/24/000000/exit.png\" alt=\"exit\"/></a>\r\n");
      out.write("        </header>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"wrapContents\">\r\n");
      out.write("            <nav>\r\n");
      out.write("				<div class=\"wrapMenu\">\r\n");
      out.write("					<img width=\"17px\" height=\"17px\" src=\"https://img.icons8.com/ios/50/000000/sun--v1.png\" alt=\"sun--v1\"/>\r\n");
      out.write("                	<a href=\"\">오늘 할 일</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"wrapMenu\">\r\n");
      out.write("					<img width=\"17px\" height=\"17px\" src=\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAAACXBIWXMAAAsTAAALEwEAmpwYAAACaklEQVR4nO1WPWgUQRRe1EsTtRfEn0ZLC0HUCNe4sHfzfbOeuIWNCQa2FbEVrhERJJrKxiaIFpoujdhoZRQTJDaCTcSgWKv4Q2JUPnwLx7IX7vY2V+XBwDLvfd/3Zt7Mmw2CLduyElav13cAuEHyC8nPAK6naVoLhmUAZkj+7RwA7gxF3Ht/0QS/OeeOxXF8EsAPzcm3qeKtVmuPhG3V57N5kuOW1FfFbFoCJO+a+L28D8BDS2KmMsE0TWve+8MAzgC4CuC3tjuKor352DiOD5D8CWAdQFuYRqNxSAe2L9EkSXaSnCT5JKttblzrhtVtKIj/DuCxzoe4NxSP/x+olRzBO5JzJG+q1htdtyRJRkhOWOycYTtvygqAE4XgNE1rAD5Z8Cvv/aVms7k/GNDEIS5xGvfHwrKQPGgBH9rt9ragYhOnuKWh89Kt9r9IrjnnjlSdgDgBrEojDMPRwiAAt20Xlqpsrda6F4x7qmtgGIajAN5b4K2qEsgWBmC56+ozIzmm+2xJXAkGNHEYlzjHegJ57xM1FJJ/ALCsuLDWmNadc+f6BU8PWgphbeunBwFfrmD7p8qAZw18tmwCKqUt4lGZBOYtgeNlE1BrtwSe9w0G8NoSKDy5SZJsd85d0NB3F45TxrFYJoGX9pdzusDXAPCm46FZIhnl40iG5p8vfQa8/WZFUbTbnunFDuG3NrLXbkHx3vtdxjFpvtkyCUxkv1kAXlgfz4SWs63X0DOtuQ7/qnZQWJsbL9W/ST5QMzKSNQBPTXgkH685+Ug+U6xhhL3f7Yz0ZAD2OeeOqgS9YhQrjLClhbcsGJL9A6x5gYBpUb/TAAAAAElFTkSuQmCC\" alt=\"sun--v1\"/>\r\n");
      out.write("                	<a href=\"\">중요</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"wrapMenu\" id=completeCnt>\r\n");
      out.write("					<img width=\"17px\" height=\"17px\" src=\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAAACXBIWXMAAAsTAAALEwEAmpwYAAABu0lEQVR4nO1ZQUoDQRAcUPIMfYTmoFFy362anOYXBkE/IuITlHhSiSeNv4n6APUoiTQmMAwkYWczOwl0wZyyqe7q6eme7TVGoVAoNh4ATkjeA/gA8EtymmLhn/sdwIBkp7bj3W53l+RNKoe5WtC1+BAtIKfz9ETUSRuf6KksywPnXMskgnOuZa09JDn0bE96vd5xZTLJeY9kmMTjJSD54Nm/M1UhB3ZOIJE3DcP+78RcwLgygV9tUqbNIohNvzqZqvDz32QC6/iQu/owWCqA27wDJhOoAqg7sJkpVBTFPsk3kj8ARgD2wmestecAPmWR7MdwMJWAmWH/ovfq/16W5WlQRSZyOazCkVQAgO/A+Ffw38uwDAK4qMKRWsBoWfTCq7jsQPiGtYoj+RkQg7MovizI3/7sFVRutWeRHFNtZNROHA9qCjFdI8u6A1xDI8sqAGtoZLkFjOo2sqwCijU0suQCsO1jFWQebAFo1x1sDbwIPJuGQfLRE3AbQ9AJDuJQopJ6uAugLQELSvBRFKGMtsNy2PQCcBUdEfm4kFHERJx3zu2YupD5vIy45TA18IlpLLai00ahUChMk/gDm9RZhN0AqSYAAAAASUVORK5CYII=\" alt=\"sun--v1\"/>\r\n");
      out.write("                	<a href=\"javascript:test2();\">완료된 일정</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <hr>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"wrapMenu\">\r\n");
      out.write("					<img width=\"17px\" height=\"17px\" src=\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAEIAAABCCAYAAADjVADoAAAACXBIWXMAAAsTAAALEwEAmpwYAAAEBUlEQVR4nO2bS4gcVRSGr0aJLnxEVPABigg+CISI4M5GwbHo8/+np8GajZIs1IYIPhYuXCjjQkTwAZpFXIi4ECUYUYhiIAuXGggikk0EHyg+ozJqwPGRGTnagbatmalbde/0ren64d/11D3nm3vPfdQt51rVU6/XO1dEtrh1kIhckmXZZpeSOp3OaQD2klw2A3hlMBicHqOtbrd7Dcmjw3b+APCgS0Uk7zwJYcQPRGrrwGg7AE6o6lUuBQF4bhyE9ZAYbZH8pgD6nEtBJPcUBPdGjLYA/DDelojc7lIQpxFEnudn2swwapIvFoB4e/x3IUzyx4K2BuO/i1Kse73e5fZfB/BVQRBJ2ooogCMkH1HVs2pDILmT5OKkE6vpL1X1+soQVDUnuZRAIiF6yC8istUbQr/fv5Dkz5NOILAPOedO8QJB8tEEAo/hm31BHEog6Bh+0gsEgG8TCDqGX/MFsZBA0MENYH8Lgi2I5bZHsB0ay22N4KrF8qlpL5afqOqNXhBWAgHgIwAHG+QvhnEfnJmZOc8bwio9Ys41SAB2A3in0+mcUechC00Hoaq62pH//Pz8qVmWXdrv9y/a0CBWkvUQko+R/H4kt89V9f48zzdNBQgR2QLg/VWK6j7rKRsahPx75nm4xAxzx4YFIeUhmA9UApFl2dkAXgLwNcmf1sFHReTuSBBsuv20EggUvOlaBy+p6g2hIQxBHKkK4oMJgFhe6wVwFQhD76kKYv+EQMxGgLAI4OqqIK4jeWydIez9zzQXBoK9utg5ntxCWRCmPM/PIXmLvQuJaRG5TUS2RegJS4UFGA2cPu3GTsXT9yUA9xQ+FA0DEQVC00D0YkFoEogsyzYDeK9CsT1RalGGhoAg+Xw0CE0BISLbKrytt9/vKt0IGgACwKu+PQHAXb6NLJQFYYcZJO+1FWaN88XXbY1QNj7b6JH8LSoEXxAAHqpQsQstIt0y8dkFsugQfEEw4BUCAC+UjO/N6BAqgHg3FAiSz4YaFrUh+IIAMAvgrwAQjqvqtYGGxceqKrUg+IIwqep2qxUAnqhiu7vd7XYvc/WGxeKwYM+utDP1FhKdPu3O5OiwAPC7JS8iO2ypvdbf/++4vqkgAJwP4DMAb9nZQZnkT4rklWVqUCNAVBVJ2D3uUFeH5lzDZMduw49q/lmKTyUIAA+P70WmFcTugrVFC4ItCLY9ggGGxncFNWLgGiSSLxfksM/3IYcLHmKXKW4SkSsa4B226izI4RkvEAAeD7ijTMYicqv3J8ckj0868MD+sNJmjOQggeBD2bb4211VAbiP5J8JJFLHxwB0XF2JyFY7MQbwawJJlfbw88ynbcfqQirP802qenECM8KazrLsgqDJuynW38Jd7bA6CVvsAAAAAElFTkSuQmCC\" alt=\"sun--v1\"/>\r\n");
      out.write("                	<a href=\"\">To Do Memo</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("    \r\n");
      out.write("            <section>\r\n");
      out.write("				\r\n");
      out.write("    			<p class=\"todayToDoTitle\">오늘 할 일</p>\r\n");
      out.write("    			\r\n");
      out.write("    			<div class=\"toDo\">\r\n");
      out.write("					<input type=\"checkbox\" class=\"checkBox\">\r\n");
      out.write("					<input type=\"text\" id=\"toDoInsert\" placeholder=\"작업 추가\">\r\n");
      out.write("					<button class=\"insertBtn\">추가</button>\r\n");
      out.write("				</div>\r\n");
      out.write("    			<div id=\"disp\">\r\n");
      out.write("    			\r\n");
      out.write("				</div>\r\n");
      out.write("				</div>\r\n");
      out.write("    			\r\n");
      out.write("    			\r\n");
      out.write("    \r\n");
      out.write("            </section>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"disp\"></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

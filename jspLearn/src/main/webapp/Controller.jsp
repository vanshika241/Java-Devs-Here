<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Controller</title>
</head>
<body>
   <%
   String progLang = request.getParameter("prog");
   if(progLang.equals("Java")){
	   response.sendRedirect("JavaProg.jsp");
   }
   else if(progLang.equals("C++")){
	   response.sendRedirect("CppProg.jsp");
   }
   else if(progLang.equals("None")){
	   response.sendRedirect("Other.jsp");
   }
   %>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"    %>
<!--     isELIgnored="false" // this used for second option -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Result is :<%=request.getAttribute("result") %>
<%--  Result is ${result} --%>
<!--   or -->
<%-- Result is :${result} --%>
</body>
</html>
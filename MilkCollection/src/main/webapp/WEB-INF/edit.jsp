<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration page</title>
<link rel="stylesheet" href="bootstrap/css/bootstrap-min.css">
<link href="<c:url value="/resources/css/Style1.css"/>" rel="stylesheet" />
</head>
<body>
	<div class="container"> 
	<header class="header"> Edit Registration form </header>
   <form action="/MilkCollection/load.sp">
          <div>
				Farmer Id:${msg.id}<input type="hidden" id="txtbox" name="id" value="${msg.id} ">
			</div>
			<div>
				ReEnter First name:<input type="text" id="txtbox" name="fname" value="${msg.fname} ">
			</div>
			<br>
			<div>
				ReEnter Last name:<input type="text" id="txtbox" name="lname"value="${msg.lname} ">
			</div>
			<br>
			<div>
				ReEnter Mobile no:<input type="text" id="txtbox" name="mobilenum" value="${msg.mobilenum} ">
			</div>
			<br>
			<input class="favorite styled" type="submit">
			</form>
			
	   </div>
	<br>

</body>
</html>
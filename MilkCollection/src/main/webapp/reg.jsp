<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
		<header class="header"> Registration Form</header>

		<form action="./register.sp" method="post">
			<div>
				Enter First name:<input type="text" id="txtbox" name="fname">
			</div>
			<br>
			<div>
				Enter Last name:<input type="text" id="txtbox" name="lname">
			</div>
			<br>
			<div>
				Enter Mobile no:<input type="number" id="txtbox" name="mobilenum">
			</div>
			<br> <input class="favorite styled" type="submit">
	</div>
	<br>
	</form>
	</div>

</body>
</html>
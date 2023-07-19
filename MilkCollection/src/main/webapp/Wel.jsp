<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Welcome</title>
<link rel="stylesheet" href="bootstrap/css/bootstrap-min.css">
<link href="<c:url value="/resources/css/Style.css"/>" rel="stylesheet" type="text/css"/>

</head>
<body>
	<header>
		<h2>Pruthvi Milk Collection Center Ozewadi</h2>
	</header>
	<section>
		<nav>
			<a href="reg.jsp">
			<button class="favorite styled" type="submit">Registration</button>
			</a>
			<form action="./collect">
				<button class="favorite styled" type="submit">Collection
					Milk</button>
			</form>
			<a href="list.sp">
				<button class="favorite styled" type="submit">List of Farmer
				</button>
			</a>
		</nav>
		<article style="background-color: blueviolet;">
			<img src="<c:url value="resources/image/dairy.png"/>">
		</article>
	</section>
	<footer>
		<p>A glass of milk a day keeps the doctors away.</p>
	</footer>

</body>
</html>
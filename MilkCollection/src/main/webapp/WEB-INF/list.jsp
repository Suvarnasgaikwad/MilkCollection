<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<link rel="stylesheet" href="bootstrap/css/bootstrap-min.css">
<link href="<c:url value="/resources/css/Style2.css"/>" rel="stylesheet" />
</head>
<body>
	<div class="container">
		<header class="header">List of Farmer</header>
		<div>
			<table>
				<tr>
					<th>Farmer Id</th>
					<th>Registration Date</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Mobile Number</th>
					<th>Action</th>
				</tr>
				<c:forEach items="${msg}" var="farm" varStatus="status">
					<tr>
						<td>${status.index + 1}</td>
						<td>${farm.date}</td>
						<td>${farm.fname}</td>
						<td>${farm.lname}</td>
						<td>${farm.mobilenum}</td>
						<td>
							<div>
								<button class="favorite styled" type="button">Delete</button>
								<button class="favorite styled" type="button">Update</button>
							</div>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>
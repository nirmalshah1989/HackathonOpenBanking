<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

<head>
	<title>Microservices</title>
</head>

<body>
	<h1 style="color: red">Microservices with Spring Boot</h1>
	<div class="container">
		<div class="row">
			<h2>Transaction Details</h2>
			 <c:forEach var="transaction" items="${transactionDetails}">
			<ul>
				<li><strong>Date :</strong> ${transaction.date}</li>
				<li><strong>Amount :</strong> ${transaction.amount}</li>
				<li><strong>Type :</strong> ${transaction.type}</li>
			</ul>
			</c:forEach>
		</div>
	</div>
</body>
</html>
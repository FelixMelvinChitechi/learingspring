<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>

<html>
<head>

<title>luv2code Company Home Page</title>

</head>

<body>

<h2>luv2code Company Home Page-Yoohoo-Silly-Goose</h2>
<hr>
<p>
Welcome to luv2code Company Home Page
</p>

<hr>
	
	<!-- display user name and role -->
	
	<p>
		User: <security:authentication property="principal.username" />
		<br><br>
		Role(s): <security:authentication property="principal.authorities" />
	</p>
	
	<hr>
	
<!-- Only show this to MANAGER role -->
	<security:authorize access="hasRole('MANAGER')">


		<!-- Add a link to point to /leaders...this is for the manager -->

		<p>
			<a href="${pageContext.request.contextPath}/leaders">Leadership
				Meeting</a>
		</p>

		<!-- Add a link to point to /systems...this is for admins -->

		
	</security:authorize>

	<!-- Only show this to ADMIN -->
	<security:authorize access="hasRole('ADMIN')">
		<p>

			<a href="${pageContext.request.contextPath}/systems">IT Systems
				Meeting</a>
		</p>
	</security:authorize>

	<form:form action="${pageContext.request.contextPath}/logout" method="POST">

<input type="submit" value="logout" />
</form:form>
</body>

</html>
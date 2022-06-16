<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


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

<form:form action="${pageContext.request.contextPath}/logout" method="POST">

<input type="submit" value="logout" />
</form:form>
</body>

</html>
	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ajout liste</title>
<link rel="stylesheet" href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"/>
</head>
<body>
<h1>Page modifier liste</h1>
<div class="container">
	<form:form modelAttribute="liste" action="/web-application-0.0.1-SNAPSHOT/modifier-liste" method="POST">
	<fieldset class="form-group">
		<form:label path="description">description</form:label>
		<form:input path="description" class="form-control" type="text" name="description" required="required"></form:input>
		<form:errors path="description" cssClass="text-warning"></form:errors>
	</fieldset>
	<fieldset class="form-group">
		<form:label path="targetDate">Date</form:label>
		<form:input path="targetDate" class="form-control" type="text" name="description" required="required"></form:input>
		
	</fieldset>
		<input class="btn btn-success" type="submit" value="Modifier">
	</form:form>
</div>

</body>
<link rel="stylesheet" href="webjars/jquery/1.9.1/jquery.min.js"/>
<link rel="stylesheet" href="webjars/bootstrap/3.3.6/js/bootstrap.min.js"/>	
</html>
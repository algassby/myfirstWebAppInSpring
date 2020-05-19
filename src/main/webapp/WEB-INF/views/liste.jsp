<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"/>

</head>
<body>
	<%@ include file="common/navigation.jsp" %>

<p>${prenom}</p><h1>La liste des taches:</h1>

<div class="container">
	<table class="table table-striped">
	<caption>Les taches sont:</caption>
		<thead>
			<tr>
				<th>Description</th>
				<th>Date</th>
				<th>Status</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${liste}" var="liste">
			<tr>
				<td>${liste.description}</td>
				<td><fmt:formatDate pattern="dd/MM/yyyy" value="${liste.targetDate}"/></td>
				<td>${liste.estEffectuee}</td>
				<td><a class="btn btn-success" href="/web-application-0.0.1-SNAPSHOT/modifier-tache?id=${liste.id }">Modifier</a></td>
				<td><a class="btn btn-danger" href="/web-application-0.0.1-SNAPSHOT/supprimer-tache?id=${liste.id }">Supprimer</a></td>
				
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div>
		<a class="btn btn-primary" href="/web-application-0.0.1-SNAPSHOT/ajout-liste">Ajouter</a>
	</div>
	
</div>


</body>
<link rel="stylesheet" href="webjars/jquery/1.9.1/jquery.min.js"/>
<link rel="stylesheet" href="webjars/bootstrap/3.3.6/js/bootstrap.min.js"/>	
</html>
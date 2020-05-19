<%@ include file="common/header.jsp" %>
<%@ include file="common/navigation.jsp" %>
<h2>Java J2E c'est génial</h2>
<h2>voici mon prenom :${prenom}</h2>
<br>
<p style="color:red;"> ${error_login}</p>
<br>
<form action="/web-application-0.0.1-SNAPSHOT/" method="POST">
	Prenom: 	<input name="prenom" value="Algassimou" type="text">
	Password: 	<input type="password" value="admin" name="password">
	<input type="submit">
</form>

</body>
</html>
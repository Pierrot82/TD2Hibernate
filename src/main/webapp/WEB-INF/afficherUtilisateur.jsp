<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>afficher utilisateur</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">
</head>
<body>
<%@ include file="/WEB-INF/menu.jsp" %>



	<table id="">
		<thead>
			<tr>
				<th>Login</th>
				<th>Mot de passe</th>
			</tr>
		</thead>
		<c:forEach items="${ listeUtilisateur }" var="utilisateur">
		<tbody>
			<tr>
				<td><c:out value=" ${ utilisateur.login }"></c:out></td>
				<td><c:out value=" ${ utilisateur.mdp }"></c:out></td>
				<td> <a href="modifier?idUtilisateur=${ utilisateur.idUtilisateur }"><button type="button" class="btn btn-warning">Modifier</button></a> 
            	<a href="supprimer?idUtilisateur=${ utilisateur.idUtilisateur }"><button type="button" class="btn btn-danger">Supprimer</button></a></td>
			</tr>
		</tbody>
		</c:forEach>
	</table>



</body>
</html>
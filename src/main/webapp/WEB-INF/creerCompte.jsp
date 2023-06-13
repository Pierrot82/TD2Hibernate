<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>creer compte</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">
</head>
<body>
<%@ include file="/WEB-INF/menu.jsp" %>

<form method="post">
  <div class="mb-3">
    <label for="login" class="form-label">login</label>
    <input type="text" class="form-control" name="login">
   
  </div>
  <div class="mb-3">
    <label for="mdp" class="form-label">mot de passe</label>
    <input type="password" class="form-control" name="mdp">
  </div>
  
    <div class="mb-3">
    <label for="adresse" class="form-label">adresse</label>
    <input type="text" class="form-control" name="adresse">
  </div>
  
    <div class="mb-3">
    <label for="ville" class="form-label">ville</label>
    <input type="text" class="form-control" name="ville">
  </div>
  
    <div class="mb-3">
    <label for="cp" class="form-label">cp</label>
    <input type="number" class="form-control" name="cp">
  </div>
  
    <div class="mb-3">
    <label for="telephone" class="form-label">telephone</label>
    <input type="number" class="form-control" name="telephone">
  </div>
  
    <div class="mb-3">
    <label for="email" class="form-label">email</label>
    <input type="email" class="form-control" name="email">
  </div>
  

  <button type="submit" class="btn btn-primary">Submit</button>
</form>

</body>
</html>
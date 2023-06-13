<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>paiement</title>
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
    <label for="montant" class="form-label">montant</label>
    <input type="text" class="form-control" name="montant">
   
  </div>
  <div class="mb-3">
    <label for="date" class="form-label">date</label>
    <input type="date" class="form-control" name="date">
  </div>
  
    <div class="mb-3">
    <label for="numeroCompte" class="form-label">numeroCompte</label>
    <input type="number" class="form-control" name="numeroCompte">
  </div>
  
    <div class="mb-3">
    <label for="numeroCarte" class="form-label">numeroCarte</label>
    <input type="number" class="form-control" name="numeroCarte">
  </div>
  
    <div class="mb-3">
    <label for="dateExpiration" class="form-label">DateExpiration</label>
    <input type="date" class="form-control" name="dateExpiration">
  </div>


  <button type="submit" class="btn btn-primary">Submit</button>
</form>

</body>
</html>
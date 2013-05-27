<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<h1>Guess the number!@!</h1>
	<br />
	
	
	<form action="valida">
	   <label for="numero" >Informe o número</label>
	   <br/>
	   <input type="text" id="numero" name="numero" >
	   <br/>
	   <input type="submit" >
	</form>
 
    <br/>
     
     ${mensagem}
     <c:url value="/" var="home"></c:url> 
     <a href="${home}">Inicia</a>    


</body>
</html>
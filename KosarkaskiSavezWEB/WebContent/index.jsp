<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/KosarkaskiSavezWEB/RegistrovanjeServlet" method="post">
	Unesite ime igraca:
	<input type="text" name="ime"><br>
	Unesite prezime igraca
	<input type="text"name="prezime"><br>
	Unesite ime lige
	<input type="text" name="liga"><br>
	Unesite ime tima
	<input type="text" name="tima"><br>
	Unesite email ekipe
	<input type="text" name="email"><br>
	<input type="submit" name="submit">
</form>

</body>
</html>
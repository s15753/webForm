<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formularz do wyliczania rat</title>
</head>
<body>
	<form action="form" method="post">
		<label>Wnioskowana kwota kredytu:<input type="text" id="kwotaKredytu" name="kwotaKredytu"/></label>
		<label>Ilosc rat:<input type="text" id="iloscRat" name="iloscRat"/></label>
		<label>Oprocentowanie:<input type="text" id="oprocentowanie" name="oprocentowanie"/></label>
		<label>Oplata stala:<input type="text" id="oplataStala" name="oplataStala"/></label>
		<label>Rodzaj rat:<select name="rodzajRat"/>
							<option>Stala</option>
  							<option>Malejaca</option>
						</select>
		<label><br/>
		<input type="submit" name="action" value="Wyslij"/>
		<input type="submit" name="action" value="DoPDF"/>
	</form>
</body>
</html>
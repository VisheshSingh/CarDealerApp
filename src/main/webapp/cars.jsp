<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.ArrayList" %>
  <%@ page import="cardealershipwebproject.Car" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DISPLAY CARS</title>
</head>
<body>
<!-- 	USE REFERENCE -->
	<% ArrayList<Car> car = (ArrayList<Car>) request.getAttribute("carlist"); 
		for(Car c: car){
			out.println(c.getModelNumber()+" "+ c.getYearofProduction()+" "+ c.getDownPayment());
		}
	%>
	
	<% ArrayList<Car> cars = (ArrayList<Car>) session.getAttribute("carlist"); 
		for(Car c: cars){
			out.println(c.getModelNumber()+" "+ c.getYearofProduction()+" "+ c.getDownPayment());
		}
	%>
	
	<a href="next.jsp">NEXT RESOURCE</a>
	
</body>
</html>
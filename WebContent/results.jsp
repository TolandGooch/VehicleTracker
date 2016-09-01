<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>results - test</title>
</head>
<body>
<h1>Vehicle data table</h1>
<table border="1">
		<tr>	
			<th>Make</th>
			<th>Model</th>
			<th>Model Type</th>
			<th>Vehicle Type</th>
			<th>Mileage</th>
		</tr>
		<c:forEach var="vehicle" items="${vehicles}">
		<tr>
			<td><c:out value="${vehicle.make}"/></td>
			<td><c:out value="${vehicle.model}"/></td>
			<td><c:out value="${vehicle.modelType}"/></td>
			<td><c:out value="${vehicle.vehicleType}"/></td>
			<td><c:out value="${vehicle.mileage}"/></td>
		</tr>
		</c:forEach>	
	</table>


		
</body>
	
</html>
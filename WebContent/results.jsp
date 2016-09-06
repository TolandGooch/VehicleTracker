<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>  
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
			<th>Style</th>
			<th>Vehicle Type</th>
			<th>Mileage</th>
			<th>Modifiers</th>
		</tr>
		<c:forEach var="vehicle" items="${vehicles}">
		<tr>
			<td><c:out value="${vehicle.make}"/></td>
			<td><c:out value="${vehicle.model}"/></td>
			<td><c:out value="${vehicle.modelType}"/></td>
			<td><c:out value="${vehicle.numDoor}"/></td>
			<td><c:out value="${vehicle.vehicleType}"/></td>
			<td><c:out value="${vehicle.mileage}"/></td>
			<td><a href="editVehicle.do?id=${vehicle.id}">Edit this vehicle</a><br>
			<a href="removeVehicle.do?id=${vehicle.id}">Delete this vehicle</a></td>
			
		</tr>
		</c:forEach>	
	</table>
	<br>
	
	<a href="addVehicle.do">Add new vehicle</a><br><br>
	
	
	
	
	<%-- <form action="/VehicleMaintenanceTracker-servlet" method="GET">
		<table>
			<tr>
				<td>Make</td>
				<td><input type="text" name="make" value="${vehicle.make}"/></td>
			</tr>
			<tr>
				<td>Model</td>
				<td><input type="text" name="model" value="${vehicle.model}"/></td>
			</tr>
			<tr>
				<td>Model type</td>
				<td><input type="text" name="modelType" value="${vehicle.modelType}"/></td>
			</tr>
			<tr>
				<td>Style</td>
				<td><input type="text" name="numDoor " value="${vehicle.numDoor}"/></td>
			</tr>
			<tr>
				<td>Vehicle Type</td>
				<td><input type="text" name="vehicleType" value="${vehicle.vehicleType}"/></td>
			</tr>
			<tr>
				<td>Mileage</td>
				<td><input type="text" name="mileage" value="${vehicle.mileage}"/></td>
			</tr>
	</table>
	</form>
			<a href="editvehicle.do">Edit this vehicle</a><br>
			<a href="deleteVehicle.do">Delete this vehicle</a>

 --%>

		
</body>
	
</html>
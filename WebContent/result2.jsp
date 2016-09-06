<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="stylesheet.css" rel="stylesheet" type="text/css" media="all" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>results - test</title>
</head>
<body>
<h1>Vehicle data table</h1>
	
	<form action="/VehicleMaintenanceTracker-servlet" method="GET">
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

 
      <input type="submit" value="Submit" />
	

			
</body>
</html>
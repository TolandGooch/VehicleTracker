<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="stylesheet.css" rel="stylesheet" type="text/css" media="all" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Vehicle Tracker Data Results</title>
</head>
<body>
	<div class="page_container">
			<div class="bannerArea">
				<div class="banner_right"><a href="https://tolandgooch.com">Contact Me</a> <a href="index.html">Site Index</a></div>s
				<div class="banner_left"><a href="index.html">
					<img src="images/template/largem.jpg" alt="Large Marge" width="248" height="105" border="0" /></a></div>
			</div>
			<div class="contentArea"><!-- InstanceBeginEditable name="heading" -->
				<div class="content_title">
<h1>Vehicle Tracker Data Table</h1>
</div>
			<!-- InstanceEndEditable --><!-- InstanceBeginEditable name="navigation" -->
			<div class="content_left"><a href="inddex.html" class="nav_first">Home Page</a> <a href="GetVehicle.do" class="nav_last">Vehicle list</a></div>
			<!-- InstanceEndEditable --><!-- InstanceBeginEditable name="content" -->
			<div class="content_center">

<table border="1px" cellpadding="0" cellspacing="0">
		<thead>
		<tr>
		<th width="20%">id</th><th width="25%">Make</th><th width="20%">Model</th><th width="20%">ModelType</th><th width="20%">VehicleType</th><th width="20%">Mileage</th><th width="20%">actions</th>
		</tr>
		</thead>
		<tr>	
			<th>ID</th>
			<th>Make</th>
			<th>Model</th>
			<th>Model Type</th>
			<th>Style</th>
			<th>Vehicle Type</th>
			<th>Mileage</th>
			<th>Modifiers</th>
		</tr>
		<c:forEach var="vehicle" items="${sessionScope.vehicles}">
		<tr>
			<td><c:out value="${vehicle.id}"/></td>
			<td><c:out value="${vehicle.make}"/></td>
			<td><c:out value="${vehicle.model}"/></td>
			<td><c:out value="${vehicle.modelType}"/></td>
			<td><c:out value="${vehicle.numDoor}"/></td>
			<td><c:out value="${vehicle.vehicleType}"/></td>
			<td><c:out value="${vehicle.mileage} miles"/></td>
			<td>
			<form action="edit.jsp">
			<input type ="hidden" name="id" value="${vehicle.id}"/>
			<input type ="Submit" value="Edit"/>
			</form>
			
			<form action="updateVehicle.do">
			<input type ="hidden" name = "id" value="${vehicle.id}"/>
			<input type ="Submit" value="Delete"/>
			</form>
			</td>
		</c:forEach>	
		</tr>
	</table>
	<br>
	
	<form action="/VehicleMaintenanceTracker-servlet" method="GET">
		<table>
			<tr>
				<td>Make</td>
				<input type ="hidden" name = "id" value="${vehicle.id}"/>
				<td><input type="text" name="make" value="${v.make}"/></td>
			</tr>
			<tr>
				<td>Model</td>
				<td><input type="text" name="model" value="${v.model}"/></td>
			</tr>
			<tr>
				<td>Model type</td>
				<td><input type="text" name="modelType" value="${v.modelType}"/></td>
			</tr>
			<tr>
				<td>Style</td>
				<td><input type="text" name="numDoor " value="${v.numDoor}"/></td>
			</tr>
			<tr>
				<td>Vehicle Type</td>
				<td><input type="text" name="vehicleType" value="${v.vehicleType}"/></td>
			</tr>
			<tr>
				<td>Mileage</td>
				<td><input type="text" name="mileage" value="${v.mileage}"/></td>
			</tr>

	</table>
		
</body>
	
</html>
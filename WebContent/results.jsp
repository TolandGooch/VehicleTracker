<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="stylesheet.css" rel="stylesheet" type="text/css" media="all" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>results - test</title>
</head>
<body>
	<div class="page_container">
			<div class="bannerArea">
				<div class="banner_right"><a href="https://tolandgooch.com">Contact Me</a> <a href="index.html">Site Index</a></div>
				<div class="banner_left"><a href="index.html">
					<img src="images/template/largem.jpg" alt="Large Marge" width="248" height="105" border="0" /></a></div>
			</div>
			<div class="contentArea"><!-- InstanceBeginEditable name="heading" -->
				<div class="content_title">

<h1>Vehicle data table</h1>
</div>
			<!-- InstanceEndEditable --><!-- InstanceBeginEditable name="navigation" -->
			<div class="content_left"><a href="index.html" class="nav_first">Home Page</a> <a href="addVehicle.do" class="nav_last">Add new vehicle</a></div>
			<!-- InstanceEndEditable --><!-- InstanceBeginEditable name="content" -->
			<div class="content_center">

<table border="1">
		<tr>	
			<th>Make </th>
			<th>Model </th>
			<th>Model Type </th>
			<th>Style </th>
			<th>Vehicle Type </th>
			<th>Mileage </th>
			<th>Modifiers </th>
		</tr>
		<c:forEach var="vehicle" items="${vehicles}">
		<tr>
			<td><p><c:out value="${vehicle.make} "/></p></td>
			<td><p><c:out value="${vehicle.model} "/></p></td>
			<td><p><c:out value="${vehicle.modelType} "/></p></td>
			<td><p><c:out value="${vehicle.numDoor} "/></p></td>
			<td><p><c:out value="${vehicle.vehicleType} "/></p></td>
			<td><p><c:out value="${vehicle.mileage} "/></p></td>
			<td><a href="editVehicle.do?id=${vehicle.id} ">Edit this vehicle</a><br>
			<a href="removeVehicle.do?id=${vehicle.id} ">Delete this vehicle</a></td>
			
		</tr>
		</c:forEach>	
	</table>
	<br>
	
	</div>
			<!-- InstanceEndEditable --><!-- InstanceBeginEditable name="sidebar" -->
			<div class="content_right">										<!--<![endif]-->
				</object>
			</div>
			
			<!-- InstanceEndEditable -->
			<div class="clear_both"></div>
			</div>
			<div class="footerArea">
				<div class="footer_left">©2016 Toland Gooch</div>
				<div class="footer_right"><a href="#">Privacy Statement</a> <a href="https://github.com/TolandGooch/VehicleTracker">View Code on GitHub</a></div>
			</div>
		</div>
		
</body>
	
</html>
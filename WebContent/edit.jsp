<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="stylesheet.css" rel="stylesheet" type="text/css" media="all" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit Vehicle information</title>
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
<h1>Edit vehicle page</h1>
					
				</div>
			<!-- InstanceEndEditable --><!-- InstanceBeginEditable name="navigation" -->
			<div class="content_left"><a href="index.html" class="nav_first">Home Page</a><a href="GetVehicle.do " class="nav_last">Vehicle list</a></div>
			<!-- InstanceEndEditable --><!-- InstanceBeginEditable name="content" -->
			<div class="content_center">


<h2>Here you can edit the existing vehicle.</h2>
<h3>${message}</h3>
<form action="editVehicleFinal.do" method="GET" >
<table>
<tbody>
    <tr>
        <td><p>Make: </p></td>
        <td><input type="hidden" name="id" value="${vehicle.id}"><input type="text" name="make" value="${vehicle.make }"></td>
    </tr>
    <tr>
        <td><p>Model: </p></td>
        <td><input type="text" name="model" value="${vehicle.model}"></td>
    </tr>
    <tr>
        <td><p>Model Type: </p></td>
        <td><input type="text" name="modelType" value="${vehicle.modelType}"></td>
    </tr>
    <tr>
        <td><p>Model Type: </p></td>
        <td><input type="text" name="numDoor" value="${vehicle.numDoor}"></td>
    </tr>
    <tr>
        <td><p>Vehicle Type: </p></td>
        <td><input type="text" name="vehicleType" value="${vehicle.vehicleType}"></td>
    </tr>
    <tr>
        <td><p>Mileage: </p></td>
        <td><input type="text" name="mileage" value="${vehicle.mileage}"></td>
    </tr>

    <tr>
        <td><input value="Edit" type="submit"></td>
        <td></td>
    </tr>
</tbody>
</table>
</form>
</div>
			<!-- InstanceEndEditable --><!-- InstanceBeginEditable name="sidebar" -->
			<div class="content_right">										<!--<![endif]-->
			</div>
			
			<!-- InstanceEndEditable -->
			<div class="clear_both"></div>
			</div>
			<div class="footerArea">
				<div class="footer_left">©2016 Toland Gooch</div>
				<div class="footer_right"><a href="#">Privacy Statement</a> • <a href="https://github.com/TolandGooch/VehicleTracker">View Code on GitHub</a></div>
			</div>
		</div>
</body>
</html>
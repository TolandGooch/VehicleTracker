<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add  Vehicle information </title>
</head>
<body>
<a href="index.html">Home Page</a><br>
<a href="GetVehicle.do">Vehicle list</a><br>

<h1>Add Vehicle page</h1>
<p>Here you can add a new vehicle.</p>
<form action="addVehicleFinal.do" method="GET" >
<table>
<tbody>
    <tr>
        <td>Make:</td>
        <td><input type="text" name="make" value=""></td>
    </tr>
    <tr>
        <td>Model:</td>
        <td><input type="text" name="model"></td>
    </tr>
    <tr>
        <td>Model Type:</td>
        <td><input type="text" name="modelType"></td>
    </tr>
    <tr>
        <td>Model Type:</td>
        <td><input type="text" name="numDoor"></td>
    </tr>
    <tr>
        <td>Vehicle Type:</td>
        <td><input type="text" name="vehicleType"></td>
    </tr>
    <tr>
        <td>Mileage:</td>
        <td><input type="text" name="mileage"></td>
    </tr>

    <tr>
        <td><input value="Add vehicle" type="submit"></td>
        <td></td>
    </tr>
</tbody>
</table>
</form>


</body>
</html>
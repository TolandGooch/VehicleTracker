<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit Vehicle information</title>
</head>
<body>
<a href="index.html">Home Page</a><br>
<a href="GetVehicle.do">Vehicle list</a><br>

<h1>Edit vehicle page</h1>
<p>Here you can edit the existing vehicle.</p>
<p>${message}</p>
<form action="editVehicleFinal.do" method="GET" >
<table>
<tbody>
    <tr>
        <td>Make:</td>
        <td><input type="hidden" name="id" value="${vehicle.id}"><input type="text" name="make" value="${vehicle.make }"></td>
    </tr>
    <tr>
        <td>Model:</td>
        <td><input type="text" name="model" value="${vehicle.model}"></td>
    </tr>
    <tr>
        <td>Model Type:</td>
        <td><input type="text" name="modelType" value="${vehicle.modelType}"></td>
    </tr>
    <tr>
        <td>Model Type:</td>
        <td><input type="text" name="numDoor" value="${vehicle.numDoor}"></td>
    </tr>
    <tr>
        <td>Vehicle Type:</td>
        <td><input type="text" name="vehicleType" value="${vehicle.vehicleType}"></td>
    </tr>
    <tr>
        <td>Mileage:</td>
        <td><input type="text" name="mileage" value="${vehicle.mileage}"></td>
    </tr>

    <tr>
        <td><input value="Edit" type="submit"></td>
        <td></td>
    </tr>
</tbody>
</table>
</form>


</body>
</html>
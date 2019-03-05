<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@	page import="org.json.simple.JSONObject"%>
<%@ page import="java.util.List"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>



<!-- This is an ng-app directive named "asyncForm" -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<jsp:include page="/resources/partials/header.jsp" />
<title>Hello</title>
</head>

<body ng-app="GuiltTrip" >

<div ng-controller="GuiltController as controller">

	<form name="myAsynchronosForm" ng-submit="controller.sendGuiltTripData()">
		<!-- Note to self** In this code: <form action="setup" method="post">, the "form action" is where the URL redirect occurs -->
		<table>
			<th>Welcome to Guilt Trip!</th>

			<tr>
				<td>Enter activity</td>
				<td><input type="text" ng-model="controller.activity" required /></td>
			</tr>
			<tr>
				<td>Enter motivation (optional)</td>
				<td><input type="text" ng-model="controller.motivation" /></td>
			</tr>
			<tr>
				<td>Enter reminder time</td>
				<td><input type="text" ng-model="controller.reminderTime" required /></td>
			</tr>
			<tr>
				<td><input type="submit"></input></td>
			</tr>
		</table>
	</form>
		        <div style="border:5px, solid, red;" ng-repeat="guilt in controller.guiltData">
		        
		        
		        <!-- ng-repeat is Angular's for loop -->
		          <h3> {{controller.vm.guilt.motivation}}</h3>
		        <!-- Why is this h3 iterating 5 times? -->  
		          <h3 style="border:5px, solid, red;"> whatever</h3>
		           <span>{{guilt.activity}}</span>
		       		<span>{{guilt.motivation}}</span>
		       		<span>{{guilt.reminderTime}}</span>
		          
		        </div> 
      <script>
 
      </script>

</div>
</body>
</html>
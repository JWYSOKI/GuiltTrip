<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%> 
<jsp:include page="/resources/partials/header.jsp" />    

<!-- This is an ng-app directive named "asyncForm" -->
<html ng-app="asyncForm">
	<head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Hello</title>      
    </head>
		<body ng-controller="MainController">
		<form name="myAsynchronosForm ng-submit="vm.submit()">
		   <!-- Note to self** In this code: <form action="setup" method="post">, the "form action" is where the URL redirect occurs -->
			<h4>{{message}}</h4>  
			
			<table>
		         <th>Welcome to Guilt Trip!</th>
		           
					<tr>
						<td>Enter activity</td>
						<td><input type="text" ng-model="activity" /></td>
					</tr>						
					<tr>
						<td>Enter motivation</td>
						<td><input type="text" ng-model="motivation" /></td>
					</tr>									
					<tr>
						<td>Enter reminder time</td>
						<td><input type="text" ng-model="reminder_time" /></td>
					</tr>					 
			</table>	     
		    </form>
		    
			<button type="submit" ng-click="asyncFunction()">Take a Guilt Trip</button>	    
		    
	    </body>
</html>
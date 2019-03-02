<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@	page import="org.json.simple.JSONObject"%>
<%@ page import="java.util.List"%>



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
	<form name="myAsynchronosForm">
		<!-- Note to self** In this code: <form action="setup" method="post">, the "form action" is where the URL redirect occurs -->
		<table>
			<th>Welcome to Guilt Trip!</th>

			<tr>
				<td>Enter activity</td>
				<td><input type="text" ng-model="activity" required /></td>
			</tr>
			<tr>
				<td>Enter motivation (optional)</td>
				<td><input type="text" ng-model="motivation" /></td>
			</tr>
			<tr>
				<td>Enter reminder time</td>
				<td><input type="text" ng-model="reminder_time" required /></td>
			</tr>
			<tr>
				<td><input type="submit" ng-click="asyncFunction()"></input></td>
			</tr>
		</table>
	</form>

	<%
		JSONObject json = new JSONObject();
		json.put("title", "TITLE_TEST");
		json.put("link", "LINK_TEST");
	    out.print(json);
		out.flush();
	%>

      <script>
         function studentController($scope,$http) {
            var url = "/data.txt";

            $http.get(url).then( function(response) {
               $scope.students = response.data;
            });
         }
      </script>
      
      <script src = "https://ajax.googleapis.com/ajax/libs/angularjs/1.2.15/angular.min.js">
      </script>




</body>
</html>
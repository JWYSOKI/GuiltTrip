<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<!-- ng-app is an AngularJS attribute. Also called the " application directive". It is special directive that Angular looks for inside html and if it finds it, 
Angular will bootstrap itself, initialize itself, and start managing the html page -->
<!--    <html ng-app>           -->          

<head>

<!-- the src here is source code that points to an AngularJS file that is hosted on an external server -->
<script data-require="angular.js@*" data-semver="4.0.0" src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.10/angular.min.js"></script>

    <script data-require="angular.js@*" data-semver="4.0.0" src="script.ts"></script>
    <script data-require="angular.js@*" data-semver="4.0.0" src="system.config.js"></script>
    <script data-require="angular.js@*" data-semver="4.0.0" src="tsconfig.json"></script>
    <link rel="stylesheet" href="style.css" />
    <script src="guilttrip.js"></script>

</head>

  <body>
  
 <!-- In Angular, double curly braces are called "binding expressions" that tells Angular to evaluate what's inside. EX: {{ 543 / 20 }} --> 
 
  
 <!--   <div ng-controller="MainController">              --> 
   <!-- The ng-controller directive is an attribute used to specify the name of a controller we want to use to manage a specfic html section. 
  To work, needs a controller with the same name, created by writing a function and assigning the function to a variable with a matching name.
  EX: 
  
  var MainController = function($scope){
  	$scope.message = "I'm a working Angular controller!";
   };   
   
   This is also the "view" portion of MVC     
  -->
  
  </div> 
  </body>
</html>

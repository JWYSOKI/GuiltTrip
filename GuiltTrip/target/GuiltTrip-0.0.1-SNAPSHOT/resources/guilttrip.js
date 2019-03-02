//Angular controllers here.
//The primary responsibility of a controller is to set up the model on scope object.
//Angular passes scope to controller function and controller manipulates scope.
//This is where the Model and Controller portions of MVC are handled. 
//This creates a separation of concerns where the controller is focused on scope and view is focused on html with directives, which is a strong point of Angular

//Defines the 'asyncForm' module
var asyncForm = angular.module('asyncForm', []);

//Declares a controller called `MainController` that is registered in an AngularJS module named `asyncForm`.
//The data model(a simple array of items in object literal notation) is now instantiated within the MainConroller controller. 
//The controller is simply a constructor function that takes a $scope parameter.
asyncForm.controller('MainController', function MainController($scope, $http) {
	$scope.activity = "";
	$scope.motivation = "";
	$scope.time = "";
	console.log($scope);
	
	//ng-click functionality here
	$scope.message = "Thanks and enjoy your trip!"
	$scope.asyncFunction = function showAsyncData() {
		
		
			var requestBody = {
				activity: $scope.activity,
				motivation: $scope.motivation,
				time: $scope.time
				};
		$http.post('http://localhost:8080/GuiltTrip/data', JSON.stringify(requestBody))
		}
	


  
  //Can i add another controller here? It is still inside my 'asyncForm' module so that should work, if I understand correctly
  
});
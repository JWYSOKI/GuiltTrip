
Angular creates a separation of concerns where the controller is focused on scope and view is focused on html with directives,
 which is a strong point of Angular  -->



ng-app is an AngularJS attribute. Also called the " application directive". It is special directive that Angular looks for inside html and if it finds it, 
Angular will bootstrap itself, initialize itself, and start managing the html page 
   


the src here is source code that points to an AngularJS file that is hosted on an external server

  
In Angular, double curly braces are called "binding expressions" that tells Angular to evaluate what's inside. EX: {{ 543 / 20 }}
 
  
          
The ng-controller directive is an attribute used to specify the name of a controller we want to use to manage a specfic html section. 
To work, needs a controller with the same name, created by writing a function and assigning the function to a variable with a matching name.
  
  EX: 
  
  var MainController = function($scope){
  	$scope.message = "I'm a working Angular controller!";
   };   
   
   This is also the "view" portion of MVC     

The primary responsibility of a controller is to set up the model on scope objects.
Angular passes scope to controller function and controller manipulates scope.
This is where the Model and Controller portions of MVC are handled. 

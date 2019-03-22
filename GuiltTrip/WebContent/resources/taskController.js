//John Papa recommended format: Components (module, controller, factory) kept separate in their own files.

'use strict'; 

angular
	.module('GuiltTrip')

//Controller is a constructor function that takes a $scope parameter.
	.controller('GuiltController', GuiltController);
	
GuiltController.$inject = ['guiltService', '$log'];
	
function GuiltController(guiltService, $log){
	
	let vm = this;
	
	vm.taskInfo = {};
	
	vm.taskData = [];
	
	
// ng-click functionality here on the hello.jsp form
	
	vm.sendTaskData = function sendTaskData() {

// This binds data from view and sends to back end (which is currently '/data')		
				let newTaskInfo = {
				"activity": vm.activity,
				"motivation": vm.motivation,
				"reminderTime": vm.reminderTime
			}		
				
		console.log("from controller" + newTaskInfo);
		guiltService.addTask(newTaskInfo).then(function(response){
			
			console.log(vm.taskData);
			vm.taskData = response.data;
			
			
		});
				
		}
	
//This is a promise to return data from hello.jsp form asynchronously 
	//and ( IN THEORY ) display that retrieved data in view
	
	
	vm.getTaskData = function getTaskData(){
			return guiltService.getTaskList()
			.then(function(response){
				vm.taskData = response.data;
				 console.log(vm.taskData);
				 return vm.taskData;
			})
			  
			 
		  };
		  	 	
	
};
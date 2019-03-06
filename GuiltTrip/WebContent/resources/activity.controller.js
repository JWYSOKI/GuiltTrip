//John Papa recommended format: Components (module, controller, factory) kept separate in their own files.

'use strict'; 

angular
	.module('GuiltTrip')

//Controller is a constructor function that takes a $scope parameter.
	.controller('GuiltController', GuiltController);
	
GuiltController.$inject = ['guiltService', '$log'];
	
function GuiltController(guiltService, $log){
	
	let vm = this;
	
	vm.guiltTripInfo = {};
	
	vm.guiltData = [];
	
	
// ng-click functionality here on the hello.jsp form
	
	vm.sendGuiltTripData = function sendGuiltTripData() {

// This binds data from view and sends to back end (which is currently '/data')		
				let newGuiltTripInfo = {
				"activity": vm.activity,
				"motivation": vm.motivation,
				"reminderTime": vm.reminderTime
			}		
				
		console.log("from controller" + newGuiltTripInfo);
		guiltService.addGuilt(newGuiltTripInfo).then(function(response){
			
			console.log(vm.guiltData);
			vm.guiltData = response.data;
			
			
		});
				
		}
	
//This is a promise to return data from hello.jsp form asynchronously 
	//and ( IN THEORY ) display that retrieved data in view
	
	
	vm.getGuiltTripData = function getGuiltTripData(){
			return guiltService.getGuiltList()
			.then(function(response){
				vm.guiltData = response.data;
				 console.log(vm.guiltData);
				 return vm.guiltData;
			})
			  
			 
		  };
		  	 	
	
};
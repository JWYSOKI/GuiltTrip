//John Papa recommended format: 
//Components (module, controller, factory) kept separate in their own files.
// Wrap Angular components in an IIFE to remove variables from global scope. 

'use strict'; 

angular
	.module('GuiltTrip')

// The controller is a constructor function that takes a $scope parameter.
	.controller('GuiltController', GuiltController);
	
GuiltController.$inject = ['guiltService', '$log'];
	
function GuiltController(guiltService, $log){
	
	let vm = this;
	
	vm.guiltTripInfo = {};
	
	vm.guiltData = [];
	
	
// ng-click functionality here on the hello.jsp form

	
	vm.sendGuiltTripData = function sendGuiltTripData() {

// This binds data from view (form) and ships it off to '/data' (or back end)			
				let newGuiltTripInfo = {
				"activity": vm.activity,
				"motivation": vm.motivation,
				"reminderTime": vm.reminderTime
			}		
				
		console.log("from controller" +  newGuiltTripInfo);
		guiltService.addGuilt(newGuiltTripInfo);
				console.log(vm.guiltData);
				
		}
	
/////////////////////////////////////////////////////////////
	
	vm.getGuiltTripData = function getGuiltTripData(){
			return guiltService.getGuiltList()
			.then(function(data){
				vm.guiltData = data;
				 console.log(vm.guiltData);
				 return vm.guiltData;
			})
			  
			 
		  };
		  	 	
	vm.getGuiltTripData();	
};
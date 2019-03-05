//John Papa recommended format: 
//Components (module, controller, factory) kept separate in their own files
// Wrap Angular components in an IIFE to remove variables from global scope. 

//Question: should this be named a 'manager' instead of service since it is front end?


"use strict";

angular
	.module('GuiltTrip')
	.factory('guiltService', guiltService);

guiltService.$inject = ['$http','$log'];
	
	function guiltService($http, $log){
		
		return{
			addGuilt: addGuilt,
			getGuiltList: getGuiltList
		};
		
		function addGuilt(newGuiltTripInfo){
			return $http.post('data', newGuiltTripInfo);
		}	
		
		function getGuiltList(){
			return $http.get('data');
		}
	}
	
	
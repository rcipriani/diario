var diarioController = angular.module('diarioController', []);

diarioController.controller('diarioController', ['$scope', '$location', function ($scope, $location) { 
	
	$scope.goTo = function (url){
		console.log("goTo");
		$location.path(url);			
	};
	
}]);
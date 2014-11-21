var diarioApp = angular.module('diarioApp', [ 
	'ngRoute',
	'diarioController',
	'eventoController'
]);

diarioApp.config(['$routeProvider', '$locationProvider', function ($routeProvider, $locationProvider) { 
	
	$routeProvider 
	
	// Home
	.when("/", {redirectTo: "/eventospainel"})
	
	.when("/eventospainel", {templateUrl: "pages/evento/eventospainel.html", controller: "eventoController"})
	
	// Pages
	.when("/about", {templateUrl: "partials/about.html", controller: "PageCtrl"}) 
	.when("/faq", {templateUrl: "partials/faq.html", controller: "PageCtrl"}) 
	
	// else 404
	.when("/404", {templateUrl: "partials/erro404.html", controller: 'diarioController'}) 
	.otherwise("/404", {redirectTo: "/404"});
	
	$locationProvider.html5Mode(false).hashPrefix('!');	
	
}]);
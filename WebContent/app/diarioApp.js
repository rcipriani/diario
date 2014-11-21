var diarioApp = angular.module('diarioApp', [ 
	'ngRoute',
	'pageController',
	'diarioController',
	'eventoController',
	'diarioDirectives'
]);

diarioApp.config(['$routeProvider', '$locationProvider', function ($routeProvider, $locationProvider) { 
	
	$routeProvider 
	
	// Home
	.when("/", {redirectTo: "/eventospainel"})
	
	.when("/eventospainel", {templateUrl: "pages/evento/eventospainel.html", controller: "eventoController"})
	
	// Pages
	.when("/about", {templateUrl: "partials/about.html", controller: "pageController"}) 
	.when("/faq", {templateUrl: "partials/faq.html", controller: "pageController"}) 
	
	// else 404
	.when("/404", {templateUrl: "partials/erro404.html", controller: 'diarioController'}) 
	.otherwise("/404", {redirectTo: "/404"});
	
	$locationProvider.html5Mode(false).hashPrefix('!');	
	
}]);
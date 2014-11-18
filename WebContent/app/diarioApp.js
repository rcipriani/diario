var diarioApp = angular.module('diarioApp', [ 
	'ngRoute' 
]);

diarioApp.config(['$routeProvider', function ($routeProvider) { 
	
	$routeProvider 
	
	// Home
	.when("/", {templateUrl: "pages/evento/evento.html", controller: "diarioController"}) 
	
	// Diario
//	.when("/evento", {templateUrl: "pages/evento/evento.html", controller: "PageCtrl"}) 
	
	// Pages
	.when("/about", {templateUrl: "partials/about.html", controller: "PageCtrl"}) 
	.when("/faq", {templateUrl: "partials/faq.html", controller: "PageCtrl"}) 
	/* etc� routes to other pages� */ 
	
	// Blog
	.when("/blog", {templateUrl: "partials/blog.html", controller: "BlogCtrl"}) 
	.when("/blog/post", {templateUrl: "partials/blog_item.html", controller: "BlogCtrl"}) 
	
	// else 404
	.when("/404", {templateUrl: "partials/erro404.html", controller: "BlogCtrl"}) 
	.otherwise("/404", {templateUrl: "partials/erro404.html", controller: "PageCtrl"});
	
}]);
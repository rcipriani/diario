var app = angular.module('tutorialWebApp', [ 
	'ngRoute' 
]);

app.config(['$routeProvider', function ($routeProvider) { 
	$routeProvider 
	// Home
	.when("/", {templateUrl: "pages/evento/evento.html", controller: "PageCtrl"}) 
	// Pages
//	.when("/about", {templateUrl: "partials/about.html", controller: "PageCtrl"}) 
//	.when("/faq", {templateUrl: "partials/faq.html", controller: "PageCtrl"}) 
	/* etc… routes to other pages… */ 
	// Blog
//	.when("/blog", {templateUrl: "partials/blog.html", controller: "BlogCtrl"}) 
//	.when("/blog/post", {templateUrl: "partials/blog_item.html", controller: "BlogCtrl"}) 
	// else 404
	.otherwise("/404", {templateUrl: "partials/404.html", controller: "PageCtrl"}); 
}]);

/** * Controls the Blog */ 
app.controller('BlogCtrl', function (/* $scope, $location, $http */) { 
	console.log("Blog Controller reporting for duty."); 
}); 

/** * Controls all other Pages */ 
app.controller('PageCtrl', function ($scope /*, $location, $http */) { 
	
	console.log("Page Controller reporting for duty."); 
	
	// Activates the Carousel 
	$('.carousel').carousel({ 
		interval: 5000 
	}); 
	
	// Activates Tooltips for Social Links 
	$('.tooltip-social').tooltip({ 
		selector: "a[data-toggle=tooltip]" 
	});
	
	 $scope.lista = [
                    	{nome: "eu", email: "fdsa@", idade: 32, gostaDeCerveja: true}
                     ];
     
		$scope.teste = function (url){
			
			var xhr = $scope.createXHR();
		    xhr.open("GET", url, true);
		   
		    xhr.onreadystatechange = function() {
		        if (xhr.readyState == 4) {
		            if (xhr.status != 404) {
		                var data = eval("(" + xhr.responseText + ")");
		                
		                $scope.lista = data.listing.testes;
		                $scope.$digest();
		                
		            } else {
		                document.getElementById("zone").innerHTML = fname + " not found";
		            }
		        }
		    }
		    xhr.send(null);
			
		}
		
		$scope.createXHR = function (){
		    var request = false;
		    try {
		        request = new ActiveXObject('Msxml2.XMLHTTP');
		    } catch (err2) {
		        try {
		            request = new ActiveXObject('Microsoft.XMLHTTP');
		        } catch (err3) {
		            try {
		                request = new XMLHttpRequest();
		            } catch (err1) {
		                request = false;
		            }
		        }
		    }
		    return request;
		}
	
});

var diarioDirectives = angular.module('diarioDirectives', []);

// Click to navigate
//similar to <a href="#/partial"> but hash is not required, 
//e.g. <div rc-click-link="/partial">
diarioDirectives.directive('rcClickLink', ['$location', function($location) {
 return {
     link: function(scope, element, attrs) {
         element.on('click', function() {
             scope.$apply(function() {
                 $location.path(attrs.rcClickLink);
             });
         });
     }
 };
}]);
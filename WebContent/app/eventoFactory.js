 var eventoFactory = angular.module('eventoFactory', []);
 
 eventoFactory.factory('eventoFactory', ['$http', function($http) {
	
	return {
        buscarLista: function() {
            return $http({
           	 	method: "get"
       	 		, url: "s/evento/service/listar"
            });
        }
		,gravarEvento: function(evento) {
			console.log(evento);
			var teste = "testes";
	        return $http({
	        	method: "get"
	        	, url: "s/evento/service/gravar"
        		, params: {'evento': teste}
	        });
		}
	};
	
}]);

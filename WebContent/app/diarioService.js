 
diarioApp.factory('diarioService', function($http) {
	
	console.log("Diário service requisitado."); 
	
	return {
        buscarLista: function() {
            return $http({
           	 	method: "get"
       	 		, url: "s/eventoservice/listar"
            });
        }
		,gravarEvento: function(evento) {
			console.log(evento);
			var teste = "testes";
	        return $http({
	        	method: "get"
	        	, url: "s/eventoservice/gravar"
        		, params: {'evento': teste}
	        });
		}
	}
	
});

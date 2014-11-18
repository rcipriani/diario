 
diarioApp.factory('diarioService', function($http) {
	
	console.log("Diário service requisitado."); 
	
	return {
        buscarLista: function(url) {
            return $http({
           	 	method: "get"
       	 		, url: url
            });
        }
		,gravarEvento: function(url) {
	        return $http({
	       	 method: "get"
	   		 , url: "s/"
        });
   }
	}
	
});

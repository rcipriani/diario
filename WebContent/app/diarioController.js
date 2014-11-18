/** * Controls all other Pages */ 
diarioApp.controller('diarioController', function ($scope, diarioService /*, $location, $http */) { 
	
	console.log("Diário controller requisitado."); 
	
	 $scope.eventos = [
                    	{id: 0, nome: "testeInicializador"}
                     ]
	 , evento = "";
	 
	 $scope.listar = function (){
			
	 	diarioService.buscarLista().success(function (data){
	 		console.log(data);
	 		$scope.eventos = data.eventos.lista;
	 		
 		});
			
	}
	 
	 $scope.gravar = function (evento){
	 	diarioService.gravarEvento(evento)
	 	.success(function (data){
	 		console.log(data);
	 	});
	}
	 
	 
	 
	 
	 
	 
	 
	 
     /*
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
		}*/
	
});

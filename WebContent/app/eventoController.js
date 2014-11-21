var eventoController = angular.module('eventoController', [ 
	'eventoFactory'
]);

eventoController.controller('eventoController', ['$scope', 'eventoFactory', function ($scope, eventoFactory) { 
	
	$scope.eventos = [
	                  {id: 0, nome: "testeInicializador"}
                     ]
	 , evento = "";
	 
	$scope.listar = function (){
		
		eventoFactory.buscarLista().success(function (data){
	 		$scope.eventos = data.eventos.lista;
	 		
			});
			
	};
	 
	$scope.gravar = function (evento){
		eventoFactory.gravarEvento(evento)
		 	.success(function (data){
		 		console.log(data);
		 	});
	};
	
}]);



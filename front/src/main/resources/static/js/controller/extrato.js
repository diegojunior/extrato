extratoApp.controller('ExtratoCTRL', ['$scope', 'extratoService', function($scope, extratoService) {
	
	$scope.extrato = {listaControleLancamento: []};
		
	$scope.lancamentos = function(indice, tamanhoPagina, totalElementos) {
		extratoService
			.extrato(indice, tamanhoPagina, totalElementos)
				.get({}, function(extrato) {
				
					$scope.extrato = extrato;
				
				}, function(erros){
				
					alert(erros);
				
				});
	}
	
	$scope.lancamentos(1, 25, 39);
	
}]);
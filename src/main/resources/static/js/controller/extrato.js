extratoApp.controller('ExtratoCTRL', ['$scope', 'extratoService', function($scope, extratoService) {
	
	$scope.extrato = {lancamentos: []};
		
	$scope.lancamentos = function(indice, tamanhoPagina, totalElementos) {
		extratoService
			.extrato(indice, tamanhoPagina, totalElementos)
				.query({}, function(lancamentos) {
				
					$scope.extrato.lancamentos = lancamentos;
				
				}, function(erros){
				
					alert(erros);
				
				});
	}
	
	$scope.lancamentos(1, 25, 39);
	
}]);
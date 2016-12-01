extratoApp.service('extratoService', ['$resource', ExtratoService]);

function ExtratoService($resource) {
	
	var url = '/extrato/v1/lancamentos/:indice/:tamanhoPagina/:totalElementos'
	
	this.extrato = function(indiceParam, tamnhoPaginaParam, totalElementosParam) {
		
		var params = {indice: indiceParam, tamanhoPagina: tamnhoPaginaParam, totalElementos: totalElementosParam};
		
		return $resource(url, params);
		
	}
}
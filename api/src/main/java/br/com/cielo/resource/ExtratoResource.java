package br.com.cielo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.cielo.model.Extrato;
import br.com.cielo.resource.conversor.ExtratoConversor;
import br.com.cielo.resource.json.ExtratoJson;
import br.com.cielo.service.ExtratoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RequestMapping("/extrato/v1")
@RestController
@Api(value = "Lançamento")
public class ExtratoResource {

	@Autowired
	private ExtratoService service;

	@Autowired
	private ExtratoConversor conversor;

	@RequestMapping(method = RequestMethod.GET, path = "/lancamentos/{indice}/{tamanhoPagina}/{totalElementos}")
	@ApiOperation(value = "Serviço de extrato dos lançamentos.")
	public ResponseEntity<ExtratoJson> lancamentos(
			@ApiParam(required = true, name = "indice", defaultValue = "1") 
			@PathVariable(value = "indice") final int indiceParam,
			@ApiParam(required = true, name = "tamanhoPagina", defaultValue = "25") 
			@PathVariable(value = "tamanhoPagina") final int tamanhoPaginaParam,
			@ApiParam(required = true, name = "totalElementos", defaultValue = "39") 
			@PathVariable(value = "totalElementos") final int totalElementosParam) {

		Extrato extrato = this.service.gerar();
		ExtratoJson extratoJson = this.conversor.converterFrom(extrato);

		return new ResponseEntity<ExtratoJson>(extratoJson,
				HttpStatus.OK);
	}

}

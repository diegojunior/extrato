package br.com.cielo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cielo.model.Extrato;
import br.com.cielo.resource.conversor.ExtratoConversor;
import br.com.cielo.resource.json.ControleLancamentoJson;
import br.com.cielo.resource.json.ExtratoJson;
import br.com.cielo.service.ExtratoService;

@RequestMapping("/v1/extratos")
@RestController
public class ExtratoResource {

	@Autowired
	private ExtratoService service;
	
	@Autowired
	private ExtratoConversor conversor;
	
	@RequestMapping("/lancamentos/{indice}/{tamanhoPagina}/{totalElementos}")
	public ResponseEntity<List<ControleLancamentoJson>> lancamentos(@PathVariable(value = "indice") final String indiceParam,
			@PathVariable(value = "tamanhoPagina") final String tamanhoPaginaParam,
			@PathVariable(value = "totalElementos") final String totalElementosParam) {
		
		Extrato extrato = this.service.gerar();
		ExtratoJson extratoJson = conversor.converterFrom(extrato);
		
		return new ResponseEntity<List<ControleLancamentoJson>>(extratoJson.getListaControleLancamento(), HttpStatus.OK);
	}
	
}

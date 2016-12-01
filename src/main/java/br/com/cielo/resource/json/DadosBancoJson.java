package br.com.cielo.resource.json;

import br.com.cielo.model.DadosBanco;

public class DadosBancoJson implements Json {

	private int codigo;
	
	private String codigoAgencia;
	
	private String contaCorrente;
	
	public DadosBancoJson(DadosBanco dados) {
		this.codigo = dados.getCodigo();
		this.codigoAgencia = dados.getCodigoAgencia();
		this.contaCorrente = dados.getContaCorrente();
	}

	public int getCodigo() {
		return codigo;
	}

	public String getCodigoAgencia() {
		return codigoAgencia;
	}

	public String getContaCorrente() {
		return contaCorrente;
	}
	
	
}

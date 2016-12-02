package br.com.cielo.resource.json;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.cielo.model.ControleLancamento;

public class ControleLancamentoJson implements Json {

	private String dataEfetivaLancamento;
	
	private String dataLancamentoContaCorrenteCliente;
	
	private String numeroEvento;
	
	private String descricaoGrupoPagamento;
	
	private String codigoIdentificadorUnico;
	
	private String nomeBanco;
	
	private int quantidadeLancamentoRemessa;
	
	private int numeroRaizCNPJ;
	
	private int numeroSufixoCNPJ;
	
	private String valorLancamentoRemessa;
	
	private LancamentoJson lancamentoContaCorrenteCliente;
	
	public ControleLancamentoJson(final ControleLancamento controle) {
		this.dataEfetivaLancamento = formatarData(controle.getDataEfetivaLancamento());
		this.dataLancamentoContaCorrenteCliente = formatarData(controle.getDataLancamentoContaCorrente());
		this.numeroEvento = controle.getNumeroEvento();
		this.descricaoGrupoPagamento = controle.getDescricaoGrupoPagamento();
		this.codigoIdentificadorUnico = controle.getCodigoIdentificadorUnico();
		this.nomeBanco = controle.getNomeBanco();
		this.quantidadeLancamentoRemessa = controle.getQuantidadeLancamentoRemessa();
		this.numeroRaizCNPJ = controle.getNumeroRaizCnpj();
		this.numeroSufixoCNPJ = controle.getNumeroSufixoCnpj();
		this.valorLancamentoRemessa = controle.getValorLancamentoRemessa().toString();
		this.lancamentoContaCorrenteCliente = new LancamentoJson(controle.getLancamento());
	}

	public String getDataEfetivaLancamento() {
		return dataEfetivaLancamento;
	}

	public String getDataLancamentoContaCorrenteCliente() {
		return dataLancamentoContaCorrenteCliente;
	}

	public String getNumeroEvento() {
		return numeroEvento;
	}

	public String getDescricaoGrupoPagamento() {
		return descricaoGrupoPagamento;
	}

	public String getCodigoIdentificadorUnico() {
		return codigoIdentificadorUnico;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public int getQuantidadeLancamentoRemessa() {
		return quantidadeLancamentoRemessa;
	}

	public int getNumeroRaizCNPJ() {
		return numeroRaizCNPJ;
	}

	public int getNumeroSufixoCNPJ() {
		return numeroSufixoCNPJ;
	}

	public String getValorLancamentoRemessa() {
		return valorLancamentoRemessa;
	}

	public LancamentoJson getLancamentoContaCorrenteCliente() {
		return lancamentoContaCorrenteCliente;
	}
	
	private String formatarData(Date data) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		return df.format(data);
	}
	
}

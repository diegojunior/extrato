package br.com.cielo.resource.json;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.cielo.model.ControleLancamento;

public class ControleLancamentoJson implements Json {

	private final String dataEfetivaLancamento;
	
	private final String dataLancamentoContaCorrenteCliente;
	
	private final String numeroEvento;
	
	private final String descricaoGrupoPagamento;
	
	private final String codigoIdentificadorUnico;
	
	private final String nomeBanco;
	
	private final int quantidadeLancamentoRemessa;
	
	private final int numeroRaizCNPJ;
	
	private final int numeroSufixoCNPJ;
	
	private final String valorLancamentoRemessa;
	
	private final LancamentoJson lancamentoContaCorrenteCliente;
	
	public ControleLancamentoJson(final ControleLancamento controle) {
		dataEfetivaLancamento = formatarData(controle.getDataEfetivaLancamento());
		dataLancamentoContaCorrenteCliente = formatarData(controle.getDataLancamentoContaCorrente());
		numeroEvento = controle.getNumeroEvento();
		descricaoGrupoPagamento = controle.getDescricaoGrupoPagamento();
		codigoIdentificadorUnico = controle.getCodigoIdentificadorUnico();
		nomeBanco = controle.getNomeBanco();
		quantidadeLancamentoRemessa = controle.getQuantidadeLancamentoRemessa();
		numeroRaizCNPJ = controle.getNumeroRaizCnpj();
		numeroSufixoCNPJ = controle.getNumeroSufixoCnpj();
		valorLancamentoRemessa = controle.getValorLancamentoRemessa().toString();
		lancamentoContaCorrenteCliente = new LancamentoJson(controle.getLancamento());
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
	
	private String formatarData(final Date data) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		return df.format(data);
	}
	
	public String getDadosBancarios() {
		StringBuilder sb = new StringBuilder();
		sb.append(getNomeBanco())
			.append(" Ag ")
			.append(getLancamentoContaCorrenteCliente().getDadosDomicilioBancario().getCodigoAgencia())
			.append(" CC ")
			.append(getLancamentoContaCorrenteCliente().getDadosDomicilioBancario().getContaCorrente());
		
		return sb.toString();
	}
	
}

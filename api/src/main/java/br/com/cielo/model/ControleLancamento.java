package br.com.cielo.model;

import java.math.BigDecimal;
import java.util.Date;

public class ControleLancamento implements Model {

	private Date dataEfetivaLancamento;
	
	private Date dataLancamentoContaCorrente;
	
	private String numeroEvento;
	
	private String descricaoGrupoPagamento;
	
	private String codigoIdentificadorUnico;
	
	private String nomeBanco;
	
	private int quantidadeLancamentoRemessa;
	
	private int numeroRaizCnpj;
	
	private int numeroSufixoCnpj;
	
	private BigDecimal valorLancamentoRemessa;
	
	private Lancamento lancamento;
	
	private ControleLancamento(Date dataEfevaLancamento, Date dataLancamentoContaCorrente, String numeroEvento,
			String descricaoGrupoPagamento, String codigoIdentificadorUnico, String nomeBanco,
			int quantidadeLancamentoRemessa, int numeroRaizCnpj, int numeroSufixoCnpj,
			BigDecimal valorLancamentoRemessa, Lancamento lancamento) {
		this.dataEfetivaLancamento = dataEfevaLancamento;
		this.dataLancamentoContaCorrente = dataLancamentoContaCorrente;
		this.numeroEvento = numeroEvento;
		this.descricaoGrupoPagamento = descricaoGrupoPagamento;
		this.codigoIdentificadorUnico = codigoIdentificadorUnico;
		this.nomeBanco = nomeBanco;
		this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
		this.numeroRaizCnpj = numeroRaizCnpj;
		this.numeroSufixoCnpj = numeroSufixoCnpj;
		this.valorLancamentoRemessa = valorLancamentoRemessa;
		this.lancamento = lancamento;
	}
	
	public static ControleLancamento build(Date dataEfetivaLancamento, Date dataLancamentoContaCorrente, String numeroEvento,
			String descricaoGrupoPagamento, String codigoIdentificadorUnico, String nomeBanco,
			int quantidadeLancamentoRemessa, int numeroRaizCnpj, int numeroSufixoCnpj,
			BigDecimal valorLancamentoRemessa, Lancamento lancamento) {
		
		return new ControleLancamento(dataEfetivaLancamento, dataLancamentoContaCorrente, 
				numeroEvento, descricaoGrupoPagamento, 
				codigoIdentificadorUnico, nomeBanco, 
				quantidadeLancamentoRemessa, numeroRaizCnpj, 
				numeroSufixoCnpj, valorLancamentoRemessa, 
				lancamento);
	}

	public Date getDataEfetivaLancamento() {
		return dataEfetivaLancamento;
	}

	public Date getDataLancamentoContaCorrente() {
		return dataLancamentoContaCorrente;
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

	public int getNumeroRaizCnpj() {
		return numeroRaizCnpj;
	}

	public int getNumeroSufixoCnpj() {
		return numeroSufixoCnpj;
	}

	public BigDecimal getValorLancamentoRemessa() {
		return valorLancamentoRemessa;
	}

	public Lancamento getLancamento() {
		return lancamento;
	}
	
}

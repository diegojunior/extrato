package br.com.cielo.model;

import java.math.BigDecimal;
import java.util.Date;

public class ControleLancamento implements Model {

	private final Date dataEfetivaLancamento;
	
	private final Date dataLancamentoContaCorrente;
	
	private final String numeroEvento;
	
	private final String descricaoGrupoPagamento;
	
	private final String codigoIdentificadorUnico;
	
	private final String nomeBanco;
	
	private final int quantidadeLancamentoRemessa;
	
	private final int numeroRaizCnpj;
	
	private final int numeroSufixoCnpj;
	
	private final BigDecimal valorLancamentoRemessa;
	
	private final Lancamento lancamento;
	
	private ControleLancamento(final Date dataEfetivaLancamento, final Date dataLancamentoContaCorrente, 
			final String numeroEvento, final String descricaoGrupoPagamento, 
			final String codigoIdentificadorUnico, final String nomeBanco,
			final int quantidadeLancamentoRemessa, final int numeroRaizCnpj, 
			final int numeroSufixoCnpj, final BigDecimal valorLancamentoRemessa, 
			final Lancamento lancamento) {
		this.dataEfetivaLancamento = dataEfetivaLancamento;
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
	
	public static ControleLancamento build(final Date dataEfetivaLancamento, 
			final Date dataLancamentoContaCorrente, final String numeroEvento, 
			final String descricaoGrupoPagamento, final String codigoIdentificadorUnico, 
			final String nomeBanco, final int quantidadeLancamentoRemessa, 
			final int numeroRaizCnpj, final int numeroSufixoCnpj,
			final BigDecimal valorLancamentoRemessa, final Lancamento lancamento) {
		
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

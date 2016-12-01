package br.com.cielo.resource.json;

import br.com.cielo.model.Lancamento;

public class LancamentoJson implements Json {

	private String numeroRemessaBanco;
	
	private String nomeSituacaoRemessa;
	
	private String nomeTipoOperacao;
	
	private DadosBancoJson dadosDomicilioBancario;
	
	public LancamentoJson(final Lancamento lancamento) {
		this.numeroRemessaBanco = lancamento.getNumeroRemessaBanco();
		this.nomeSituacaoRemessa = lancamento.getSituacao().getLabel();
		this.nomeTipoOperacao = lancamento.getTipoOperacao().getLabel();
		this.dadosDomicilioBancario = new DadosBancoJson(lancamento.getDados());
	}

	public String getNumeroRemessaBanco() {
		return numeroRemessaBanco;
	}

	public String getNomeSituacaoRemessa() {
		return nomeSituacaoRemessa;
	}

	public String getNomeTipoOperacao() {
		return nomeTipoOperacao;
	}

	public DadosBancoJson getDadosDomicilioBancario() {
		return dadosDomicilioBancario;
	}
	
	
}

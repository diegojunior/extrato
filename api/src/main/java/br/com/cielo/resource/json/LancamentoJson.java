package br.com.cielo.resource.json;

import br.com.cielo.model.Lancamento;

public class LancamentoJson implements Json {

	private final String numeroRemessaBanco;
	
	private final String nomeSituacaoRemessa;
	
	private final String nomeTipoOperacao;
	
	private final DadosBancoJson dadosDomicilioBancario;
	
	public LancamentoJson(final Lancamento lancamento) {
		numeroRemessaBanco = lancamento.getNumeroRemessaBanco();
		nomeSituacaoRemessa = lancamento.getSituacao().getLabel();
		nomeTipoOperacao = lancamento.getTipoOperacao().getLabel();
		dadosDomicilioBancario = new DadosBancoJson(lancamento.getDados());
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

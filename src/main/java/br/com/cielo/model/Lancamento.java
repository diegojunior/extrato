package br.com.cielo.model;

public class Lancamento implements Model {

	private String numeroRemessaBanco;
	
	private SituacaoRemessaEnum situacao;
	
	private TipoOperacaoEnum tipoOperacao;
	
	private DadosBanco dados;
	
	private Lancamento(String numeroRemessaBanco, SituacaoRemessaEnum situacao, TipoOperacaoEnum tipoOperacao,
			DadosBanco dados) {
		super();
		this.numeroRemessaBanco = numeroRemessaBanco;
		this.situacao = situacao;
		this.tipoOperacao = tipoOperacao;
		this.dados = dados;
	}

	public static Lancamento build(String numeroRemessaBanco, SituacaoRemessaEnum situacao, TipoOperacaoEnum tipoOperacao,
			DadosBanco dados) {
		return new Lancamento(numeroRemessaBanco, situacao, tipoOperacao, dados);
	}

	public String getNumeroRemessaBanco() {
		return numeroRemessaBanco;
	}

	public SituacaoRemessaEnum getSituacao() {
		return situacao;
	}

	public TipoOperacaoEnum getTipoOperacao() {
		return tipoOperacao;
	}

	public DadosBanco getDados() {
		return dados;
	}

}

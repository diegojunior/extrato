package br.com.cielo.model;

public class Lancamento implements Model {

	private final String numeroRemessaBanco;
	
	private final SituacaoRemessaEnum situacao;
	
	private final TipoOperacaoEnum tipoOperacao;
	
	private final DadosBanco dados;
	
	private Lancamento(final String numeroRemessaBanco, final SituacaoRemessaEnum situacao,
			final TipoOperacaoEnum tipoOperacao, final DadosBanco dados) {
		super();
		this.numeroRemessaBanco = numeroRemessaBanco;
		this.situacao = situacao;
		this.tipoOperacao = tipoOperacao;
		this.dados = dados;
	}

	public static Lancamento build(final String numeroRemessaBanco, final SituacaoRemessaEnum situacao, 
			final TipoOperacaoEnum tipoOperacao, final DadosBanco dados) {
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

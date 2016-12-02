package br.com.cielo.model;

import java.math.BigDecimal;

import lombok.Getter;
@Getter
public class TotalizadorLancamentos {

	private int quantidadeLancamentoRemessa;
	
	private BigDecimal valorLancamentos;

	public void totalizarLancamentos(final ControleLancamento lancamento) {
			this.quantidadeLancamentoRemessa += lancamento.getQuantidadeLancamentoRemessa();
			if (this.valorLancamentos != null) {
				this.valorLancamentos = this.valorLancamentos.add(lancamento.getValorLancamentoRemessa());
			} else {
				this.valorLancamentos = lancamento.getValorLancamentoRemessa();
			}
	}
}

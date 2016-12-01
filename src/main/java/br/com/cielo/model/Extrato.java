package br.com.cielo.model;

import java.math.BigDecimal;
import java.util.List;

import com.google.common.collect.Lists;

public class Extrato implements Model {

	private List<ControleLancamento> controleLancamentos;
	
	private TotalLancamento total;
	
	private Extrato() {
		this.controleLancamentos = Lists.newArrayList();
	}
	
	public static Extrato build() {
		return new Extrato();
	}
	
	public Extrato incluirControle(final ControleLancamento controleLancamento) {
		this.controleLancamentos.add(controleLancamento);
		return this;
	}
	
	public TotalLancamento totalizar() {
		if (this.total == null) {
			this.total = new TotalLancamento();
		}
		return total;
	}
	
	public class TotalLancamento {
		
		private int quantidadeLancamentoRemessa;
		
		private BigDecimal valorLancamentos;
		
		public TotalLancamento() {
			lancamentos();
		}

		private void lancamentos() {
			for (ControleLancamento controle : controleLancamentos) {
				this.quantidadeLancamentoRemessa += controle.getQuantidadeLancamentoRemessa();
				if (this.valorLancamentos != null) {
					this.valorLancamentos = valorLancamentos.add(controle.getValorLancamentoRemessa());
				} else {
					this.valorLancamentos = controle.getValorLancamentoRemessa();
				}
			}
		}

		public int getQuantidadeLancamentoRemessa() {
			return quantidadeLancamentoRemessa;
		}

		public BigDecimal getValorLancamentos() {
			return valorLancamentos;
		}
		
	}

	public List<ControleLancamento> getControleLancamentos() {
		return controleLancamentos;
	}

}

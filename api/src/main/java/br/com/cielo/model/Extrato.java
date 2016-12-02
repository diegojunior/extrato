package br.com.cielo.model;

import java.util.List;

import com.google.common.collect.Lists;

import lombok.Getter;
@Getter
public class Extrato implements Model {

	private final List<ControleLancamento> controleLancamentos;
	
	private TotalizadorLancamentos totalLancamentos;
	
	private Extrato() {
		this.controleLancamentos = Lists.newArrayList();
	}
	
	public static Extrato build() {
		return new Extrato();
	}
	
	public Extrato lancar(final ControleLancamento controleLancamento) {
		this.controleLancamentos.add(controleLancamento);
		this.totalizarLancamentos(controleLancamento);
		return this;
	}
	
	private void totalizarLancamentos(final ControleLancamento lancamento) {
		if (this.totalLancamentos == null) {
			this.totalLancamentos = new TotalizadorLancamentos();
		}
		this.totalLancamentos.totalizarLancamentos(lancamento);
	}
	
}

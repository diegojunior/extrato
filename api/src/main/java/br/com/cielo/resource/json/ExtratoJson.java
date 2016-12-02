package br.com.cielo.resource.json;

import java.util.List;

import com.google.common.collect.Lists;

import br.com.cielo.model.ControleLancamento;
import br.com.cielo.model.Extrato;

public class ExtratoJson implements Json{
	
	private int quantidadeRemessas;
	
	private String valorLancamentos;
	
	private List<ControleLancamentoJson> listaControleLancamento = Lists.newArrayList();
	
	public ExtratoJson(final Extrato extrato) {
		this.quantidadeRemessas = extrato.totalizar().getQuantidadeLancamentoRemessa();
		this.valorLancamentos = extrato.totalizar().getValorLancamentos().toString();
		for (ControleLancamento controleLancamento : extrato.getControleLancamentos()) {
			this.listaControleLancamento.add(new ControleLancamentoJson(controleLancamento));
		}
	}

	public int getQuantidadeRemessas() {
		return quantidadeRemessas;
	}

	public String getValorLancamentos() {
		return valorLancamentos;
	}

	public List<ControleLancamentoJson> getListaControleLancamento() {
		return listaControleLancamento;
	}
	
	
	
}

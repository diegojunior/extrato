package br.com.cielo.resource.json;

import java.util.List;

import com.google.common.collect.Lists;

import br.com.cielo.model.ControleLancamento;
import br.com.cielo.model.Extrato;
import lombok.Getter;
@Getter
public class ExtratoJson implements Json{
	
	private final int quantidadeRemessas;
	
	private final String valorLancamentos;
	
	private final List<ControleLancamentoJson> listaControleLancamento = Lists.newArrayList();
	
	public ExtratoJson(final Extrato extrato) {
		this.quantidadeRemessas = extrato.getTotalLancamentos().getQuantidadeLancamentoRemessa();
		this.valorLancamentos = extrato.getTotalLancamentos().getValorLancamentos().toString();
		for (ControleLancamento controleLancamento : extrato.getControleLancamentos()) {
			this.listaControleLancamento.add(new ControleLancamentoJson(controleLancamento));
		}
	}

}

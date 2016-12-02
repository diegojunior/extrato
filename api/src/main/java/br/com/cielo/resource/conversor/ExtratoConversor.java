package br.com.cielo.resource.conversor;

import org.springframework.stereotype.Component;

import br.com.cielo.model.Extrato;
import br.com.cielo.resource.json.ExtratoJson;
@Component
public class ExtratoConversor implements Conversor<Extrato, ExtratoJson> {

	@Override
	public ExtratoJson converterFrom(final Extrato model) {
		return new ExtratoJson(model);
	}
}

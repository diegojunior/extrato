package br.com.cielo.resource.conversor;

import br.com.cielo.model.Model;
import br.com.cielo.resource.json.Json;

public interface Conversor<M extends Model, J extends Json> {

	public J converterFrom(M model);
	
}

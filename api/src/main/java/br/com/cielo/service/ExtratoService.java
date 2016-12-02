package br.com.cielo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cielo.model.Extrato;
import br.com.cielo.repository.ExtratoRepository;

@Service
public class ExtratoService {

	@Autowired
	private ExtratoRepository repository;
	
	public Extrato gerar() {
		return repository.getExtrato();
	}
}

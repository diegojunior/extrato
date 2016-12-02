package br.com.cielo.repository;

import static br.com.cielo.model.ControleLancamento.build;
import static br.com.cielo.model.DadosBanco.build;
import static br.com.cielo.model.Extrato.build;
import static br.com.cielo.model.Lancamento.build;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

import org.springframework.stereotype.Repository;

import br.com.cielo.model.ControleLancamento;
import br.com.cielo.model.Extrato;
import br.com.cielo.model.SituacaoRemessaEnum;
import br.com.cielo.model.TipoOperacaoEnum;

@Repository
public class ExtratoRepository {

	public Extrato getExtrato() {
		
		ControleLancamento controleLancamento = build(new Date(), new Date(), 
				"42236790", "LA-56", "1", 
				"BANCO ABCD S.A.", 22, 12996721, 
				1597, new BigDecimal(11499.1).setScale(2, RoundingMode.HALF_DOWN), build("64320236054", 
				SituacaoRemessaEnum.PAGO, TipoOperacaoEnum.REGULAR, 
				build(123, "1", "00000000065470")));
		
		ControleLancamento controleLancamento2 = build(new Date(), new Date(), 
				"42592397", "LA-56", "25", 
				"BANCO ABCD S.A.", 2, 12996721, 
				1597, new BigDecimal(1960), build("64320236054", 
				SituacaoRemessaEnum.PAGO, TipoOperacaoEnum.REGULAR, 
				build(123, "1", "00000000065470")));
		
		return build()
				.lancar(controleLancamento)
				.lancar(controleLancamento2);
	}
	
}

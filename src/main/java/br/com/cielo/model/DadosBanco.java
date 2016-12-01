package br.com.cielo.model;

public class DadosBanco implements Model{

	private int codigo;
	
	private String codigoAgencia;
	
	private String contaCorrente;
	
	public DadosBanco(int codigo, String codigoAgencia, String contaCorrente) {
		super();
		this.codigo = codigo;
		this.codigoAgencia = codigoAgencia;
		this.contaCorrente = contaCorrente;
	}

	public static DadosBanco build(int codigo, String codigoAgencia, String contaCorrente) {
		return new DadosBanco(codigo, codigoAgencia, contaCorrente);
	}

	public int getCodigo() {
		return codigo;
	}

	public String getCodigoAgencia() {
		return codigoAgencia;
	}

	public String getContaCorrente() {
		return contaCorrente;
	}

	
}

package br.com.cielo.model;

public enum SituacaoRemessaEnum {

	PAGO("Pago", 1);
	
	private String label;
	private int codigo;

	private SituacaoRemessaEnum(String label, int codigo) {
		this.label = label;
		this.codigo = codigo;
	}

	public String getLabel() {
		return label;
	}

	public int getCodigo() {
		return codigo;
	}
	
}

package br.com.cielo.model;

public enum TipoOperacaoEnum {

	REGULAR("Regular", 1);
	
	private String label;
	
	private int codigo;

	private TipoOperacaoEnum(String label, int codigo) {
		this.label = label;
		this.codigo = codigo;
		
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	
}

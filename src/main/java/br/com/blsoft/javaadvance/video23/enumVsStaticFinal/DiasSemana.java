package br.com.blsoft.javaadvance.video23.enumVsStaticFinal;

public enum DiasSemana {
	
	DOMINGO(1), SEGUNDA(2), TERCA(3), QUARTA(4), QUINTA(5), SEXTA(6), SABADO(7);
	
	private final int NUM_DIA;
	
	DiasSemana(int diaEmNumero){
		this.NUM_DIA = diaEmNumero;
	}
	
	public int getDiaEmnumero() {
		return this.NUM_DIA;
	}
}

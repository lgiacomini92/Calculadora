package br.edu.utfpr.selenium.core;

public enum OperacoesEnum {
	    SOMAR("Somar"),
	    SUBTRAIR("Subtrair"),
	    MULTIPLICAR("Multiplicar"),
	    DIVIDIR("Dividir");

	    private final String text;

	    private OperacoesEnum(final String text) {
	        this.text = text;
	    }

	    //@Override
	    public String toString() {
	        return text;
	    }
}

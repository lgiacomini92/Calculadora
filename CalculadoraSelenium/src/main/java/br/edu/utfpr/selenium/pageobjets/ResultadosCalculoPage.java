package br.edu.utfpr.selenium.pageobjets;

import static br.edu.utfpr.selenium.core.SeleniumCore.*;

import java.text.DecimalFormat;

import br.edu.utfpr.selenium.core.FiltroEnum;

public class ResultadosCalculoPage {
	
	public void verificaResultado(double resultado){
		DecimalFormat df = new DecimalFormat("0.##");
		
		verificaValorElemento("vlResultado", FiltroEnum.ID, df.format(resultado));
	}
	
	public void voltarMenuCalculadoras(){
		clicaNoBotaoOuLink("//a[@href='calculadora.html']", FiltroEnum.XPATH);
	}
}

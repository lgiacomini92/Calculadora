package br.edu.utfpr.selenium.pageobjets;

import static br.edu.utfpr.selenium.core.FiltroEnum.ID;
import static br.edu.utfpr.selenium.core.SeleniumCore.clicaNoBotaoOuLink;

public class MenuCalculadorasPage {
	
	public CalculadoraComboPage acessaCalculadoraCombo(){
		clicaNoBotaoOuLink("calculadoraCombo", ID);
		return new CalculadoraComboPage();
	}
	
	public CalculadoraRadioButtonPage acessaCalculadoraRadioButton(){
		clicaNoBotaoOuLink("calculadoraRadio", ID);
		return new CalculadoraRadioButtonPage();
	}
	
	public CalculadoraBotoesPage acessaCalculadoraBotoes(){
		clicaNoBotaoOuLink("calculadoraBotoes", ID);
		return new CalculadoraBotoesPage();
	}
}

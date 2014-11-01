package br.edu.utfpr.selenium.pageobjets;

import static br.edu.utfpr.selenium.core.SeleniumCore.clicaNoBotaoOuLink;
import static br.edu.utfpr.selenium.core.SeleniumCore.digitaNoInput;
import static br.edu.utfpr.selenium.core.SeleniumCore.selecionaItemCombo;
import br.edu.utfpr.selenium.core.FiltroEnum;
import br.edu.utfpr.selenium.core.OperacoesEnum;

public class CalculadoraComboPage {
	
	public void digitaNumero1(double valor){
		digitaNoInput("txtNum1", FiltroEnum.ID, valor);
	}
	
	public void digitaNumero2(double valor){
		digitaNoInput("txtNum2", FiltroEnum.ID, valor);
	}
	
	public void selecionaOperacao(OperacoesEnum operacao){
		selecionaItemCombo("selOperacao", FiltroEnum.ID, operacao.toString());
	}
	
	public ResultadosCalculoPage clicaNoBotaoCalcular(){
		clicaNoBotaoOuLink("btnCalcular", FiltroEnum.NAME);
		return new ResultadosCalculoPage();
	}
	
	public void clicaNoBotaoLimpar(){
		clicaNoBotaoOuLink("btnLimpar", FiltroEnum.NAME);
	}
	
	public void voltarMenuCalculadoras(){
		clicaNoBotaoOuLink("//a[@href='calculadora.html']", FiltroEnum.XPATH);
	}
}

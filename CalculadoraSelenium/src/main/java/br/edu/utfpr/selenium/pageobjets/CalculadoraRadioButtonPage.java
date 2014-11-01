package br.edu.utfpr.selenium.pageobjets;

import static br.edu.utfpr.selenium.core.SeleniumCore.clicaNoBotaoOuLink;
import static br.edu.utfpr.selenium.core.SeleniumCore.digitaNoInput;
import static br.edu.utfpr.selenium.core.SeleniumCore.marcaCheckBoxOuRadioButton;
import br.edu.utfpr.selenium.core.FiltroEnum;
import br.edu.utfpr.selenium.core.OperacoesEnum;

public class CalculadoraRadioButtonPage {
	
	public void digitaNumero1(double valor){
		digitaNoInput("txtNum1", FiltroEnum.ID, valor);
	}
	
	public void digitaNumero2(double valor){
		digitaNoInput("txtNum2", FiltroEnum.ID, valor);
	}
	
	public void marcaOperacao(OperacoesEnum operacao){
		marcaCheckBoxOuRadioButton("input[value='"+operacao.toString()+"']", FiltroEnum.CSSSELECTOR);
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

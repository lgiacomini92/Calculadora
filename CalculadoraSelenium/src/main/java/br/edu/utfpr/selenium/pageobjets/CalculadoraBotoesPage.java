package br.edu.utfpr.selenium.pageobjets;

import static br.edu.utfpr.selenium.core.SeleniumCore.*;
import br.edu.utfpr.selenium.core.FiltroEnum;
import br.edu.utfpr.selenium.core.OperacoesEnum;

public class CalculadoraBotoesPage {
	
	public void digitaNumero1(double valor){
		digitaNoInput("txtNum1", FiltroEnum.ID, valor);
	}
	
	public void digitaNumero2(double valor){
		digitaNoInput("txtNum2", FiltroEnum.ID, valor);
	}
	
	public ResultadosCalculoPage clicaNoBotaoDaOperacao(OperacoesEnum operacao){
		clicaNoBotaoOuLink("//input[@value='"+operacao.toString()+"']", FiltroEnum.XPATH);
		return new ResultadosCalculoPage();
	}
	
	public void clicaNoBotaoLimpar(){
		clicaNoBotaoOuLink("btnLimpar", FiltroEnum.ID);
	}
	
	public void voltarMenuCalculadoras(){
		clicaNoBotaoOuLink("//a[@href='calculadora.html']", FiltroEnum.XPATH);
	}
}

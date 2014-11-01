package br.edu.utfpr.selenium.test.calculadorabotoes;

import static br.edu.utfpr.selenium.core.SeleniumCore.abreNavegador;
import static br.edu.utfpr.selenium.core.SeleniumCore.acessaMenuCalculadoras;
import static br.edu.utfpr.selenium.core.SeleniumCore.confirmaAlert;
import static br.edu.utfpr.selenium.core.SeleniumCore.fechaNavegador;
import static br.edu.utfpr.selenium.core.SeleniumCore.verificaMensagemAlert;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.edu.utfpr.selenium.core.OperacoesEnum;
import br.edu.utfpr.selenium.pageobjets.CalculadoraBotoesPage;
import br.edu.utfpr.selenium.pageobjets.MenuCalculadorasPage;
import br.edu.utfpr.selenium.pageobjets.ResultadosCalculoPage;

public class CalculadoraBotoesTest {
	
	static MenuCalculadorasPage menuCalculadoras;
	
	@BeforeClass
	public static void initialize(){
		abreNavegador();	
	}
	
	@Before
	public void setup(){
		menuCalculadoras = acessaMenuCalculadoras();
	}
	
	
	/**
	 * Testa a Soma na calculadora combo
	 * 2.33 + 5.44 = 7.77
	*/
	@Test
	public void testeSoma(){
		efetuaCalculo(2.33, 5.44, OperacoesEnum.SOMAR, 7.77);
	}
	
	/**
	 * Testa a Subtração na calculadora combo
	 * 8.88 - 3.33 = 5.55
	*/
	@Test
	public void testeSubtracao(){
		efetuaCalculo(8.88, 3.33, OperacoesEnum.SUBTRAIR, 5.55);
	}
	
	/**
	 * Testa a Multiplicacao na calculadora combo
	 * 9 * 3 = 27
	*/
	@Test
	public void testeMultiplicacao(){
		efetuaCalculo(9, 3, OperacoesEnum.MULTIPLICAR, 27);
	}
	
	/**
	 * Testa a Divisao na calculadora combo
	 * 9 / 3 = 3
	*/
	@Test
	public void testeDivisao(){
		efetuaCalculo(9, 3, OperacoesEnum.DIVIDIR, 3);
	}
	
	@Test
	public void testaValidacaoCamposPreenchidos(){
		CalculadoraBotoesPage calcBotoesPage = menuCalculadoras.acessaCalculadoraBotoes();
		
		calcBotoesPage.digitaNumero2(2);
		calcBotoesPage.clicaNoBotaoDaOperacao(OperacoesEnum.SUBTRAIR);
		
		verificaMensagemAlert("Favor preencher os dois números para o cálculo!");
		confirmaAlert();
	}
	
	//Metodo utilizado nos testes da classe
	public void efetuaCalculo(double num1, double num2, OperacoesEnum operacao, double resultado){
		CalculadoraBotoesPage calcBotoesPage = menuCalculadoras.acessaCalculadoraBotoes();
		
		calcBotoesPage.digitaNumero1(num1);
		calcBotoesPage.digitaNumero2(num2);
		ResultadosCalculoPage resultadosPage = calcBotoesPage.clicaNoBotaoDaOperacao(operacao);
		resultadosPage.verificaResultado(resultado);
	}
	
	@AfterClass
	public static void teardown(){
		fechaNavegador();
	}
}

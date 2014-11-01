package br.edu.utfpr.calculadoratd.testes;

import static br.edu.utfpr.calculadoratd.FuncoesCalculadora.dividir;
import static br.edu.utfpr.calculadoratd.FuncoesCalculadora.multiplicar;
import static br.edu.utfpr.calculadoratd.FuncoesCalculadora.somar;
import static br.edu.utfpr.calculadoratd.FuncoesCalculadora.subtrair;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VariosTestesNaClasse {

	/**
	 * @author: Leonardo Giacomini
	 * @since: 01/10/2014
	 * 
	 * Nesta classe ha varias formas de como pode se abordar os asserts
	 * 
	 */
	
	@Test
	public void testeSoma() {
		assertEquals("6,9", somar(2.5, 4.4));
	}
	
	@Test
	public void testeSubtracao() {
		String resultado = subtrair(9.99, 5.5);
		
		assertEquals("4,49", resultado);
	}
	
	@Test
	public void testeMultiplicacao() {
		String esperado = "72";
		String resultado = multiplicar(12, 6);
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testeDivisao() {
		assertEquals("1,22", metodoAuxiliar(11, 9));
	}
	
	/* 
	 * Este metodo é um método auxiliar que não será executado como um teste,
	 * mas poderá ser invocado pelos testes afim de reaproveitar código, caso varios testes tenham
	 * linhas que podem ser reaproveitadas. Pode ter retorno ou não, dependendo do processo a ser reutilizado.
	*/
	public String metodoAuxiliar(double num1, double num2){
		//Insere o processamento do metodo aqui...
		
		return dividir(11, 9);
	}
}

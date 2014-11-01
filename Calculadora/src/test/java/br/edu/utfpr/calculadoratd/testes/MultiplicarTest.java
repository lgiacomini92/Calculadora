package br.edu.utfpr.calculadoratd.testes;

import static br.edu.utfpr.calculadoratd.FuncoesCalculadora.multiplicar;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MultiplicarTest {
	
	@Test
	public void testeMultiplicacaoDeDoisNumerosInteiros() {
		assertEquals("48", multiplicar(6, 8));
	}
	
	@Test
	public void testeMultiplicacaoDeDoisNumerosFracionados() {
		assertEquals("13,75", multiplicar(2.5, 5.5));
	}
	
	@Test
	public void testeMultiplicacaoComNumeroNegativo() {
		assertEquals("-14", multiplicar(14, -1));
	}
	
	@Test
	public void testeMultiplicacaoComDoisNumerosNegativos() {
		assertEquals("10", multiplicar(-2, -5));
	}
}

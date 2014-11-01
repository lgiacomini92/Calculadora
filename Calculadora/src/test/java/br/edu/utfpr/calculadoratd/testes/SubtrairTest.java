package br.edu.utfpr.calculadoratd.testes;

import static br.edu.utfpr.calculadoratd.FuncoesCalculadora.subtrair;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SubtrairTest {
	
	@Test
	public void testeSutrairDoisNumerosInteiros() {
		assertEquals("4", subtrair(9, 5));
	}
	
	@Test
	public void testeSutrairDoisNumerosFracionados() {
		assertEquals("6,5", subtrair(11.6, 5.1));
	}
	
	@Test
	public void testeSutrairResultadoNegativo() {
		assertEquals("-3,1", subtrair(5, 8.1));
	}
	
	@Test
	public void testeSutrairComNumeroNegativo() {
		assertEquals("-7", subtrair(-3, 4));
	}
}

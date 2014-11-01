package br.edu.utfpr.calculadoratd.testes;

import static br.edu.utfpr.calculadoratd.FuncoesCalculadora.somar;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SomarTest{

	@Test
	public void testeSomaDeDoisNumerosInteiros() {
		assertEquals("14", somar(6, 8));
	}
	
	@Test
	public void testeSomaDeDoisNumerosFracionados() {
		assertEquals("7,77", somar(2.33, 5.44));
	}
	
	@Test
	public void testeSomaComNumeroNegativo() {
		assertEquals("4", somar(-5, 9));
	}
}

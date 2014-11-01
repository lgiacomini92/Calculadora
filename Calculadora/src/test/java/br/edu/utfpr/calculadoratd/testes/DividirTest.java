package br.edu.utfpr.calculadoratd.testes;

import static br.edu.utfpr.calculadoratd.FuncoesCalculadora.dividir;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DividirTest {
	
	@Test
	public void testeDivisaoDeDoisNumerosInteiros() {
		assertEquals("6", dividir(18, 3));
	}
	
	@Test
	public void testeDivisaoDeDoisNumerosFracionados() {
		assertEquals("2,5", dividir(13.75, 5.5));
	}
	
	@Test
	public void testeDivisaoComNumeroNegativo() {
		assertEquals("-7", dividir(-14, 2));
	}
	
	@Test
	public void testeDivisaoComDoisNumerosNegativos() {
		assertEquals("2", dividir(-8, -4));
	}
}

package br.edu.utfpr.calculadoratd.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.edu.utfpr.calculadoratd.testes.DividirTest;
import br.edu.utfpr.calculadoratd.testes.MultiplicarTest;
import br.edu.utfpr.calculadoratd.testes.SomarTest;
import br.edu.utfpr.calculadoratd.testes.SubtrairTest;

@RunWith(Suite.class)
@SuiteClasses({
	SomarTest.class,
	SubtrairTest.class,
	MultiplicarTest.class,
	DividirTest.class
	})
public class SuiteTestes {

}

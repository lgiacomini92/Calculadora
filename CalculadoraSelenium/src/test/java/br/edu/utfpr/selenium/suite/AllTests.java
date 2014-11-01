package br.edu.utfpr.selenium.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.edu.utfpr.selenium.test.calculadorabotoes.CalculadoraBotoesTest;
import br.edu.utfpr.selenium.test.calculadoracombo.CalculadoraComboTest;
import br.edu.utfpr.selenium.test.calculadoraradio.CalculadoraRadioButtonTest;

@RunWith(Suite.class)
@SuiteClasses({
	CalculadoraComboTest.class,
	CalculadoraRadioButtonTest.class,
	CalculadoraBotoesTest.class
	})
public class AllTests {

}

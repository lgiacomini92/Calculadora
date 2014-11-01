package br.edu.utfpr.selenium.test.seleniumpuro;

import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TesteSeleniumPuro {
	
	static WebDriver driver;
	
	@BeforeClass
	public static void initialize(){
		System.setProperty("webdriver.chrome.driver","./chromedriver/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
	}
	
	@Before
	public void setup(){
		driver.get("http://localhost:8080/Calculadora/calculadora.html");
	}
	
	@Test
	public void testeSomaSeleniumPuro(){
		driver.findElement(By.id("calculadoraRadio")).click();
		
		driver.findElement(By.id("txtNum1")).sendKeys("2.33");
		driver.findElement(By.id("txtNum2")).sendKeys("5.44");
		driver.findElement(By.cssSelector("input[value='Somar']")).click();
		driver.findElement(By.name("btnCalcular")).click();
		
		String resultado = driver.findElement(By.id("vlResultado")).getText();
		
		Assert.assertEquals("Resultado incorreto", "7,77", resultado);
	}
	
	@AfterClass
	public static void teardown(){
		driver.close();
	}
}

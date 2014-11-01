package br.edu.utfpr.selenium.core;

import junit.framework.Assert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import br.edu.utfpr.selenium.pageobjets.MenuCalculadorasPage;

public class SeleniumCore {
	
	private static WebDriver driver;
	
	public static void abreNavegador(){
		System.setProperty("webdriver.chrome.driver","./chromedriver/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
	}
	
	public static void fechaNavegador(){
		driver.close();
	}
	
	public static void acessaURL(String url){
		driver.get(url);
	}
	
	public static MenuCalculadorasPage acessaMenuCalculadoras(){
		acessaURL("http://localhost:8080/Calculadora/calculadora.html");
		return new MenuCalculadorasPage();
	}

	public WebDriver getDriver() {
		return driver;
	}
	
	public static WebElement buscaElemento(String localizador, FiltroEnum filtro){
		WebElement elemento;
		
		switch(filtro){
			case ID: 
			default:
				elemento = driver.findElement(By.id(localizador));
				break;
			case NAME:
				elemento = driver.findElement(By.name(localizador));
				break;
			case CLASSNAME:
				elemento = driver.findElement(By.className(localizador));
				break;
			case CSSSELECTOR:
				elemento = driver.findElement(By.cssSelector(localizador));
				break;
			case XPATH:
				elemento = driver.findElement(By.xpath(localizador));
				break;
		}
			
		return elemento;
	}
	
	public static void clicaNoBotaoOuLink(String localizador, FiltroEnum filtro){
		buscaElemento(localizador, filtro).click();
	}
	
	public static void digitaNoInput(String localizador, FiltroEnum filtro, double valor){
		buscaElemento(localizador, filtro).sendKeys(String.valueOf(valor));
	}
	
	public static String getTextElemento(String localizador, FiltroEnum filtro){
		return buscaElemento(localizador, filtro).getText();
	}
	
	public static void verificaValorElemento(String localizador, FiltroEnum filtro, String valor){
		String valorElemento = getTextElemento(localizador, filtro);
		Assert.assertEquals("O valor do elemento não é igual ao esperado", valor, valorElemento);
	}

	public static void marcaCheckBoxOuRadioButton(String localizador, FiltroEnum filtro){
		WebElement elemento = buscaElemento(localizador, filtro);
		
		if(!elemento.isSelected()){
			elemento.click();
		}
	}
	
	public static void desmarcaCheckBoxOuRadioButton(String localizador, FiltroEnum filtro){
		WebElement elemento = buscaElemento(localizador, filtro);
		
		if(elemento.isSelected()){
			elemento.click();
		}
	}
	
	public static void selecionaItemCombo(String localizador, FiltroEnum filtro, String opcao){
		Select select = new Select(buscaElemento(localizador, filtro));
		select.selectByVisibleText(opcao);
	}
	
	public static void verificaMensagemAlert(String mensagem){
		Alert alert = driver.switchTo().alert();
		
		Assert.assertEquals("Mensagem do alert incorreta", mensagem, alert.getText());
	}
	
	public static void confirmaAlert(){
		driver.switchTo().alert().accept();
	}
	
	public static void setaFrameCalculadora(){
		driver.switchTo().defaultContent();
	}
}

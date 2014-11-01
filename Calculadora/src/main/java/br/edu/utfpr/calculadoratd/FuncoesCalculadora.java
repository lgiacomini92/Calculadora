package br.edu.utfpr.calculadoratd;

import java.text.DecimalFormat;

public class FuncoesCalculadora {
	
	public static String somar(double num1, double num2){
		return formataNumero(num1 + num2);
	}
	
	public static String subtrair(double num1, double num2){
		return formataNumero(num1 - num2);
	}
	
	public static String multiplicar(double num1, double num2){
		return formataNumero(num1 * num2);
	}
	
	public static String dividir(double num1, double num2){
		return formataNumero(num1 / num2);
	}
	
	public static String formataNumero(double num){
		DecimalFormat df = new DecimalFormat("0.##");

        return df.format(num); 
	}
}

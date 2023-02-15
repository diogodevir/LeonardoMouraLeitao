package fundamentos.tarefas;

import java.util.Scanner;
//Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
public class CelsiusFahrenheit {
	public static void main(String[] args) {
		
	
//	Celsius
	System.out.println("digite a temperatura em Celsius :" );
	Scanner entrada = new Scanner(System.in);
	Double c = entrada.nextDouble();
	
//conversao
	double gFahrenheit = (c * 1.8) + 32;
	System.out.printf("%.2f", gFahrenheit);
	
	entrada.close();
	

}
}

package fundamentos.tarefas;

import java.util.Scanner;
//Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
public class FahrenheitCelsius {
	public static void main(String[] args) {
		
	
//	Fahrenheit
	System.out.println("digite a temperatura em Fahrenheit :" );
	Scanner entrada = new Scanner(System.in);
	Double f = entrada.nextDouble();
	
//conversao
	double gCelsius = (f - 32) / 1.8;
	System.out.printf("%.2f", gCelsius);
	
	entrada.close();
	

}
}

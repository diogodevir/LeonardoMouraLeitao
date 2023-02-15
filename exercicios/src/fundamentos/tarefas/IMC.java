package fundamentos.tarefas;

import java.util.Scanner;
//Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
public class IMC {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
//		altura
		System.out.println("digite a altura Ex: 1,80 ");
		double altura = entrada.nextDouble();		
//		peso
		System.out.println("digite o peso ");
		double peso = entrada.nextDouble();
				
//		calculo		
		double imc = peso / Math.pow(altura, 2);
		System.out.println("O imc total é: " + imc);
		
		entrada.close();
	}
	
}

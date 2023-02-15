package fundamentos.tarefas;

import java.util.Scanner;
//Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
public class QuadradoCuboValor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
//		valor
		System.out.println("digite um numero ");
		double valor = entrada.nextDouble();		

				
//		calculo	quadrado	
		double quadrado = Math.pow(valor, 2);
		System.out.println("O quadrado do número: " + quadrado);
//		calculo	cubo	
		double cubo = Math.pow(valor, 3);
		System.out.println("O cubo do número: " + cubo);
		
		entrada.close();
	}
	
}
	
	
	


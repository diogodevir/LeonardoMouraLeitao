package fundamentos.tarefas;

import java.util.Scanner;
//Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
public class TrianguloArea {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
//		base
		System.out.println("digite o tamanho da base do triangulo ");
		double base = entrada.nextDouble();	
//		altura
		System.out.println("digite a altura do triangulo ");
		double altura = entrada.nextDouble();	
//		calculo
		double area = (base * altura) /2;
		System.out.println("A area do triangulo e " + area);
		
		entrada.close();
}
}

package controle;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a nota: ");
		double nota = entrada.nextDouble();

//		if (nota > 10 || nota < 0) { // ver se a nota é valida
//			System.out.println("Nota inválida!");
//		} else {
//			if (nota >= 8.1) {
//				System.out.println("Conceito A");
//			} else { // posso usar tambem else if (){
//				if (nota >= 7.0 && nota <= 8.0) {
//					System.out.println("Conceito B");
//				} else {
//					if (nota >= 5.0 && nota <= 6.9) {
//						System.out.println("Conceito C");
//					} else {
//						if (nota >= 3 && nota <= 4.9) {
//							System.out.println("Conceito D");
//						} else {
//							System.out.println("Conceito E");
//						}
//					}
//				}
//			}
//		}
	
		
//		DESTA FORMA FICA MAIS FACIL LER O CODIGO
		if (nota > 10 || nota < 0) { 
			System.out.println("Nota inválida!");
		} else if (nota >= 8.1) {
			System.out.println("Conceito A");
		} else if (nota >= 7.0 && nota <= 8.0) {
			System.out.println("Conceito B");
		} else if (nota >= 5.0 && nota <= 6.9) {
			System.out.println("Conceito C");
		} else if (nota >= 3 && nota <= 4.9) {
			System.out.println("Conceito D");
		} else {
			System.out.println("Conceito E");
		}			
		System.out.println("Nota válida!");
		System.out.println("Fim!");

		entrada.close();
	}

}

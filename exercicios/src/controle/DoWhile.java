package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		String texto = "";
		
		
		do {
			System.out.println("Digite as palavras corretas! (Por favor ");
			System.out.println("Quer sair: ");
			texto = entrada.nextLine();
		} while(!texto.trim().equalsIgnoreCase("por favor")); // quando digitar por favor encerra o codigo

		entrada.close();
		
		
		
		
	}
		
}

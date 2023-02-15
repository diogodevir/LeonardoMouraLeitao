package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!valor.trim().equalsIgnoreCase("sair")) { // enquanto nao digitar sair repete   !frase.trim()
			System.out.println("Digite algo ou digite (sair): ");
			valor = entrada.nextLine();
			System.out.println(valor);
		}
		
		
		
		entrada.close();
	}

}

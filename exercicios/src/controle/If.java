package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a média: ");
		double media = entrada.nextDouble();
		
		if(media >= 7.0 && media <= 10) {
			System.out.println("Aprovado");
			System.out.println("Parabéns!!!");
			
		}
		if(media >= 6.0 && media <= 6.9) { 
			System.out.println("Recuperação");
		}
		
//		outro metodo de uso é armazenar na variavel, conforme abaixo
		boolean criterioReprovacao = media <= 5.9 && media > 0;
		if(criterioReprovacao) { 
			System.out.println("Reprovado");
		}
		
			
		entrada.close();
		
	}

}

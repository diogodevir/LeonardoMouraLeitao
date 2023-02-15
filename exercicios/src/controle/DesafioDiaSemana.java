package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
		
//		Domingo -> 1
//		Quarta  -> 4
//		Terça 	-> 3
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o nome do dia da semana: ");
		
		String dia = entrada.next();
		
		if("domingo".equalsIgnoreCase(dia.trim())) { // .equalsIgnoreCase() nao liga se é maiúscula ou minúscula
			System.out.println("Dia 1");
		} else if ("segunda".equalsIgnoreCase(dia.trim())) {
			System.out.println("Dia 2");
		} else if ("terça".equalsIgnoreCase(dia.trim()) || "terca".equalsIgnoreCase(dia.trim())) {
			System.out.println("Dia 3");
		} else if ("quarta".equalsIgnoreCase(dia.trim())) {
			System.out.println("Dia 4");
		} else if ("quinta".equalsIgnoreCase(dia.trim())) {
			System.out.println("Dia 5");
		} else if ("sexta".equalsIgnoreCase(dia.trim())) {
			System.out.println("Dia 6");
		} else if ("sábado".equalsIgnoreCase(dia.trim()) || "sabado".equalsIgnoreCase(dia.trim())) {
			System.out.println("Dia 7");
		} else {
			System.out.println("Dia inválido!");
		}	
			
			
		
	entrada.close();	
		
		
	}
	
	

}

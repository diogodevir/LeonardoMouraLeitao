package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
//	calcular a media total
//		-1 - sair do programa
		
		Scanner entrada = new Scanner(System.in);

		double nota = 0;
		int quantidadeDeNotas = 0;
		double total = 0;
		
		while(nota != -1) {// enquanto nao digitar -1 o programa executa
			System.out.print("Informe a nota: ");
			nota = entrada.nextDouble();
			
			if(nota <= 10 && nota >= 0) {// bloco de execucao de incremento
				total += nota;
				quantidadeDeNotas++;
			} else if (nota != -1) {
				System.out.println("Informe uma nota válida!");
			}
			
		
		}
		

//		calculo média
		double media = total / quantidadeDeNotas;
		System.out.printf("Média = %.2f - Quantidade de notas = %d - Soma das notas digitadas = %.2f ", media, quantidadeDeNotas, total);
		
		

		entrada.close();
		
		
	}
		
}

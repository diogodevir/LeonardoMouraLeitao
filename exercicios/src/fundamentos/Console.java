package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
//		system.out.print é diferente do system.out.println 
//		system.out.println imprime em uma nova linha
//		system.out.print concatena na mesma linha
		System.out.print("Bom");
		System.out.print(" dia!\n");
//usando system.out.println		
		System.out.println("Bom");
		System.out.println("dia!");
		
//		system.out.printf imprime formatacao
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6); // \n ou %n quebra a linha
		
		System.out.printf("Saláio: R$%.1f \n", 1234.5678); // valor float pedi para mostrar uma casa decimal ficaria 1234.5 mas ele arredonda para 1234.6
		
		System.out.printf("Nome: %s%n", "João");
		
//		usando SCANNER digita scanner ctrl+espaco seleciona java.util ele vai importar o java.util.Scanner antes do main
		// entrada do systema system.in (teclado, camera)
		
		Scanner entrada = new Scanner(System.in);//aqui estou criando uma entrada
		
		System.out.print("\nDigite o seu nome: ");
		String nome = entrada.nextLine();//a variavel vai armazenar o que for digitado
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		entrada.nextLine();//para nao dar o erro de imprimir as duas abaixo na mesma linha 
//						     depois de usar o nextInt() é preciso criar uma linha abaixo nextLine()
		
		System.out.print("Digite a cidade onde nasceu: ");
		String cidade = entrada.nextLine();
		
		System.out.print("Digite o Estado onde nasceu: ");
		String estado = entrada.nextLine();
		
	
		
		
		System.out.printf("%s %s tem %d anos.%nNatural de %s - %s", nome, sobrenome, idade, cidade, estado); // vair receber as variaveis digitadas e imprimir
		
		entrada.close();//fechar o scanner
		
		
		
	}
}

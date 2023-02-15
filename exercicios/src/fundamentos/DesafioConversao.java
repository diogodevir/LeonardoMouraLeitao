package fundamentos;

import java.util.Scanner;

// com scanner
// 3 strings nextline receber salario
// calcular a media dos 3 salarios
// separar usando , ou . o salario 578.90 578,90
// isso vai ser uma string tem que converter em valor numerico

public class DesafioConversao {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
//		System.out.print("\nDigite o primeiro salário:"); // meu bloco
//		String s1 = entrada.nextLine();//meu bloco

//		Dica do professor
		System.out.print("\nDigite o primeiro salário:");
		String s1 = entrada.nextLine().replace(",", ".");//subistitui , por ponto para nao dar problema
		
//		System.out.print("Digite o segundo salário:");
//		String s2 = entrada.nextLine();
		System.out.print("Digite o segundo salário:");
		String s2 = entrada.nextLine().replace(",", ".");
		
		
//		System.out.print("Digite o terceiro salário:");
//		String s3 = entrada.nextLine().replace(",", ".");
		System.out.print("Digite o terceiro salário:");
		String s3 = entrada.nextLine().replace(",", ".");
		
		entrada.close();
		
//		conversao de string para numero
		double s1D = Double.parseDouble(s1);
		double s2D = Double.parseDouble(s2);
		double s3D = Double.parseDouble(s3);
		
//		operacao media
		double media = (s1D + s2D + s3D) / 3;
		
		System.out.println("A média dos três últimos salários é: R$" + media);
		
		
	}

}

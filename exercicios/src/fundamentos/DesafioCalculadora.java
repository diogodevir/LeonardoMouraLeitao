package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// usuario passar um numero
//		segundo numero
//		usuario selecionar uma operacao
//		retornar o valor
		
//		numero 1
		System.out.println("digite o primeiro numero :" );
		Scanner entrada = new Scanner(System.in);
		Double n1 = entrada.nextDouble();
		
//	numero 2
		System.out.println("digite o segundo numero :" );
		Double n2 = entrada.nextDouble();
		
//		
//		operacao
		System.out.println("informe a operacao + - / * %");
		String operacao = entrada.next();
//		
//		seleciona operacao com ternario
		
	//	String calculo = "+".equals(operacao) (n1 + n2) ? "-".equals(operacao) (n1 - n2) : "*".equals(operacao) (n1 * n2) : "/".equals(operacao) (n1 / n2): "%".equals(operacao) (n1 % n2) ;
		
		//resposta do professor
		//logica do calculo
		double resultado = "+".equals(operacao) ? n1 + n2 : 0;
		resultado = "-".equals(operacao) ? n1 - n2 : resultado;
		resultado = "*".equals(operacao) ? n1 * n2 : resultado;
		resultado = "*".equals(operacao) ? n1 * n2 : resultado;
		resultado = "/".equals(operacao) ? n1 / n2 : resultado;
		resultado = "%".equals(operacao) ? n1 % n2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", n1, operacao, n2, resultado);
	
	
		entrada.close();
	}
}

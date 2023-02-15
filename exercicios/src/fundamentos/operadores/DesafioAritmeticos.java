package fundamentos.operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {
//		dica professor
//		int a = 3 * 4 - 10;
//		int b = (int) Math.pow(a, 3);// (int) converte em inteiro via cast. Math.pow = a variavel a elevada a 3 potencia
//		double c = Math.pow(a, 4);
//		
//		System.out.println(b);
//		System.out.println(c);

//		expressao 1
		double numA = Math.pow(6 * (3 + 2), 2);
		System.out.println("O resultado do numerador A é: " + numA);
		
		double denA = 3 * 2;
		System.out.println("O resultado do denominador A é: " + denA);

		
//		expressao 2
		double numB = (1 - 5) * (2 - 7);
		System.out.println("O resultado do numerador B é: " + numB);
		
		double denB = 2;
		System.out.println("O denominador B é: " + denB);
		
		double superiorA = numA / denA;
		System.out.println("O resultado do superior A é: " + superiorA);
		
		double superiorB = Math.pow(numB / denB, 2);
		System.out.println("O resultado do superior B é: " + superiorB);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		System.out.println("O resultado do superior é: " + superior);

// expressao 3
		double inferior = Math.pow(10, 3);
		System.out.println("O resultado do inferior é: " + inferior);
		
//		resultado
		double resultado = superior / inferior;
		System.out.println("O resultado da expressão é :" + resultado);
		
		
		
	}
}

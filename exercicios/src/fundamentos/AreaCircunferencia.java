package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		// declarar variavel
		// sempre lembrar do comando digitar: syso ctrl+espaco
		//int raio = 3; // defini a variavel raio do tipo inteiro
		double raio = 3.4; // variavel do tipo double significa real
		// as constantes devem ser em letra maiuscula para facilitar a identificacao
		final double PI = 3.14159; // final double -- diz que nao pode alterar a variavel (constante)
		
		double area = PI * raio * raio;
		System.out.println(area);
		
		/// calculando a area com um novo raio
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Area = " + area + " m2.");//colocar comentario junto do resultado
	}

}

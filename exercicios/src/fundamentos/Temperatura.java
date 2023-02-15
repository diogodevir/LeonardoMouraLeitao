package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		//formula de converter F para C
		//(ºF -32) * 5/9 = ºC
		//
		// armazenar o 32 em uma constante (AJUSTE)
		// 5/9.0 em uma constante (FATOR)
		// F e C variavel
		final double AJUSTE = 32;
		final double FATOR = 5 / 9.0;
		double fahrenheit = 86;
		//double fA = FATOR;
//		System.out.println(fA + " resultado do FATOR");
		
		double celsius = (fahrenheit - AJUSTE) * (FATOR);
		System.out.println(celsius + "ºC");
//		
		fahrenheit = 150;
		celsius = (fahrenheit - AJUSTE) * (FATOR);
		System.out.println(celsius + "ºC");
	}

}

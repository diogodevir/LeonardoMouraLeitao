package fundamentos;

import java.util.Scanner;

public class Wrappers {
	public static void main(String[] args) {

//		Scanner entrada = new Scanner(System.in);

//		byte
		Byte b = 100;
		Short s = 1000;
//		System.out.println("Digite um numero inteiro: "); // so exemplo
//		Integer i = Integer.parseInt(entrada.next());// int so exemplo
		Integer i = 10000;

		Long l = 1000000L;// Long determina uma classe - precisa colocar L no final
//		long l = 1000000L;// long determina um tipo primitivo - precisa colocar L no final

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
//		float
		Float f = 123.10F;
		System.out.println(f);
		
//		double
		Double d = 1234.1234;
		System.out.println(d);
		
		
//		Boolean  Wrapper 
		Boolean bo = Boolean.parseBoolean("true"); // Boolean é objeto   - boolean é tipo primitivo
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());//converti o boolean para string e imprimi em maiusculo
		
//		character
		Character c = '#'; // nao pode ser "#" tem que ser '#'
		System.out.println(c + "...");
		
			
		

//		entrada.close();
	}
}

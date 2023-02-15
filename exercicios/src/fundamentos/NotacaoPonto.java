package fundamentos;
// depois do ponto existe varios comandos
public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia X";// tem que ser String se for string nao funciona
		s = s.replaceAll("X", "Senhora");//substituiu o X por senhora
		s = s.toUpperCase();//faz imprimir em letra maiuscula
		s = s.concat("!!!");// concatena no final
		System.out.println(s);
		
		System.out.println("Diogo Moreira".toUpperCase());//coloquei tudo em maiusculo
		
		String y = "Bom dia X"
				.replace("X", "Diogo")//pode quebrar a linha depois do .replace
				.toUpperCase()
				.concat("!!!");// substitui o X por Diogo e coloca em maiusculo
		System.out.println(y);
		
//		tipos primitivos nao tem o operador "."
		int a = 3;
		System.out.println(a);
		
	}

}

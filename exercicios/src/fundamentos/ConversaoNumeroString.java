package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length());// .toString() converte para string - resultado 5 pq tem 5 caracteres
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());//Integer.toString(num2) tambem converte para string
		
		
		System.out.println(("" + num2).length());//tambem converte para string so é muito confuso
	}
}

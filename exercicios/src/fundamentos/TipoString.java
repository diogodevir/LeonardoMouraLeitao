package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Ola pessoal".charAt(2));//mostra a letra do indice 2 - no caso a
		
		String s = "Boa Tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "@!@");//substitui o !!!
		System.out.println(s.startsWith("Boa")); // resultado true
		System.out.println(s.startsWith("boa"));// resultado false
		System.out.println(s.toLowerCase().startsWith("boa"));// resultado true pq coloquei em minusculo
		System.out.println(s.length());//tamanho da string
		System.out.println(s.endsWith("Tarde"));// true pq termina com tarde
		System.out.println(s.equals("Boa tarde"));// false
		System.out.println(s.equalsIgnoreCase("Boa tarde"));//true pq ignora maiuscula e minuscula
		
		var nome = "Pedro"; // o java reconhece que o tipo eh string automaticamente
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 1234.987;
		
		String maisUmaFrase = "Nome: " + nome + " Sobrenome: " + sobrenome + " Idade: " + idade + " Salario: " + salario + "\n\n"; 
				System.out.println(maisUmaFrase);
		
		System.out.println("Nome: " + nome + " Sobrenome: " + sobrenome + " Idade: " + idade + " Salario: " + salario + "\n");
//		alterenativa de print na tela abaixo
		System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f.",
				nome, sobrenome, idade, salario);// %.2f. tipo float mostrando as duas ultimas casas decimais
		
//		faz o mesmo que foi feito acima dentro de uma variavel
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$ %.2f. \n",
				nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));//contem qual na frase - true
		System.out.println("Frase qualquer".indexOf("qual"));// indice que inicia o qual - indice 6
		System.out.println("Frase qualquer".substring(6, 10));// mostra a partir do indice 6 e mostra o 6, 7, 8, 9 e ignora o 10 - qual
	}
}

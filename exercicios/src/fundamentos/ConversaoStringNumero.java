package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número:");//Jop ctrl+espaco importar javax.swing.JOptionPane faz aparecer uma janela
		
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número:");
		
		System.out.println(valor1 + valor2);
		
		
		// aqui sera feita a conversao de string para numero
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.println("A soma é: " + soma);
		System.out.println("A média é: " + soma / 2);
		
		
	}
}
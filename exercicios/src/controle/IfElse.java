package controle;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe um numero: ");
		int numero = Integer.parseInt(valor); // 
		
		if(numero % 2 == 0) { // numero par sempre da 0
			System.out.println("numero par");
		}
		else {//numero impar sempre da 1
			System.out.println("numero impar");
		}
		
		
		
	}

}

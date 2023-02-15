package fundamentos.operadores;

//import javax.swing.JOptionPane;

public class DesafioLogicos {
	public static void main(String[] args) {
//		trabalho na terca (v ou f)
//		trabalho na quinta (v ou f)
//		se um trabalho der certo shopping tv 32 e sorvete
//		se os dois trabalhos derem certo shopping tv 50 e sorvete
//		se nenhum trabalho deu certo fica em casa sem sorvete
//		use negacao logica para sorvete tomou sorvete nao tomou fica mais saudavel
		

		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean tv50 = trabalho1 && trabalho2;
		boolean tv32 = trabalho1 ^ trabalho2; // se comprou a TV50 nao compra a TV32 (XOR) ou exclusivo
		boolean sorvete = tv50 || tv32;
		boolean saudavel = !sorvete; // operador unario
		
		System.out.println("Foi ao Shopping, comprou TV 50\"? " + tv50);
		System.out.println("Foi ao Shopping, comprou TV 32\"? " + tv32);
		System.out.println("Tomou Sorvete? " + sorvete);
		System.out.println("Não comprou nenhuma TV e não tomou sorvete (mais saudável) " + saudavel );
		
			
	
		
	}
}

package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		
		double media = 6.6;
//		String resultadoParcial = media >= 5 ? "Recuperacao" : "Reprovado";
		String resultadoFinal = media >= 7 ? "Aprovado" : media >= 5 ? "Recuperacao" : "Reprovado"; // media >= 7 ? (caso) aprovado : (caso contrario) recuperacao ou reprovado
		
		System.out.println("O aluno esta " + resultadoFinal);
		
//		
//		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "sim" : "nao";
				
				
		System.out.println("\nTem desconto? " + resultado);
		
		
	}
	
	
	

}

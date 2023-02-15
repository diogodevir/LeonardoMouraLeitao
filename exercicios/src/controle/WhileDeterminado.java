package controle;

public class WhileDeterminado {
	
	public static void main(String[] args) {
		
		int contador = 1; // contador comeca com valor 1
		
		while(contador <= 10) { // repete ate chegar em 10
		System.out.println("Contador " + contador);
		contador++; // a cada execucao o contador ta incrementando +1 (1.2.3.4.5...10)
//		contador+= 2; // incremente de 2 em 2
		}
		System.out.println("Fim!");
		
	}

}

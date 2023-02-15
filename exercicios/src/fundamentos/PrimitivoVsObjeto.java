package fundamentos;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
		
		// criar a String ou variavel dando um valor passa a ser um objeto
//		String s = "texto"; // isso é um objeto
		String s = new String("texto"); // isso tambem é um objeto
		s.toUpperCase();// aqui s.toUpperCase() o s. tem comandos associados pq e um objeto
		
//		Wrappers são a versão objeto dos tipos primitivos
		int a = 123; // tipos primitivos nao tem comandos associados pq nao sao objetos a. nao faz nada
//		a. // nao tem efeito
		System.out.println(a);
	}
}

package fundamentos.operadores;

public class Atribuicao {
	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
//		c = c + b;
		c += b; // c = c +b; faz o mesmo da linha acima
		c -= a; // c = c -a;
		c *= b;//c = c * b;
		c /= a;// c = c / a;
		
		System.out.println(c);
		
		c %= 2;// c = c % 2;
		
		System.out.println(c);
		
		
		
	}
	
	
	

}

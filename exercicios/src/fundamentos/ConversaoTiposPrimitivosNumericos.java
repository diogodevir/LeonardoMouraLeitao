package fundamentos;
//usando cast
public class ConversaoTiposPrimitivosNumericos {
	public static void main(String[] args) {
		
		double a = 1; // conversao implicita pq o double tem ponto flutuante 1.0 , o 1 e inteiro e cabe no double
		System.out.println(a);
		
//		float b = 1.0F;// resolve pq converte em ponto Float
		float b = (float) 1.0; // conversao explicita usando (cast) escrevendo que quero transformar mas 1.0F é mais facil
		System.out.println(b);
		
		int c = 340; // 4 vezes maior que o byte
//		byte d = c; // da problema pq o int é maior que o byte
		byte d = (byte) c;//conversao explicita (cast)
		System.out.println(d);
		
		double e = 1.99999999;
		int f = (int) e;//conversao explicita cast
		System.out.println(f);
		
	}
}

package controle;

public class For3 {
		public static void main(String[] args) {
			
//			int i = 0; // declarar a variavel fora do escopo do laço FOR para usar em outros locais
//			
//			for(; i < 10; i++) {
//				System.out.println(i);
//			}
//			System.out.println("Fora do laço FOR.");
//			System.out.println("I vale: " + i);
			
//			FAZER UM LAÇO FOR DENTRO DO OUTRO LAÇO FOR
			for(int i = 0; i <= 10; i++) {
				for(int j = 0; j <= 10; j++) {
					System.out.printf("I vale = %d - J vale %d\n", i, j); // repete ao todo 100 vezes pois o i repete ate 
				}														 //  ficar valendo 10 depois o j ate chegar ao 10
			}
			
			
		}

}

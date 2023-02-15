package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
//		informacoes do funcionanio
		
		
//		tipos numericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;// e preciso colocar o L ou l no final do numero para mostrar para o java que o tipo eh long
		
//		tipos numericos reais
		float salario = 11_445.44F;// to colocando um numero literal double dentro do float preciso colocar o F ou f no final para o java reconhecer
		double vendasAcumuladas = 2_991_797_103.01;
		
//		tipo booleano
		boolean estaDeFerias = false; // false ou true
		
//		tipo caractere
		char status = 'A';// so aceita uma unica letra ou simbolo existe a tabela unicode tbm

		
//		dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
//		numero de viagens
		System.out.println(numeroDeVoos / 2);
		
//		pontos por real ganhou
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
//		id
		System.out.println(id + ": recebe = " + salario);
		System.out.println("Férias: " + estaDeFerias);
		System.out.println("status (A = ativo, I = inativos: " + status);
		
	}

}

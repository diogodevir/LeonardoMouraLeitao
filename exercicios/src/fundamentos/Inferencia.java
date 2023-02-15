package fundamentos;
// inferir eh a funcao do java descobrir o tipo da variavel sozinha
public class Inferencia {
public static void main(String[] args) {
	double a = 4.5;
	System.out.println(a);
	
	a= 12; // mostra 12.0 pq e double
	System.out.println(a);

	
	var b = 4.5;// quando nao passa o tipo o java faz a inferencia e descobre o tipo da variavel
	System.out.println(b);
	
	var c = "texto";
	System.out.println(c);

	c = "outro texto";
	System.out.println(c);

//	c = 4.5; // o java nao permite isso poiso o tipo criado anteriormente foi inferido em texto
//	System.out.println(c);
	
	double d;
	d = 123.65;
	System.out.println(d);

		
}
}

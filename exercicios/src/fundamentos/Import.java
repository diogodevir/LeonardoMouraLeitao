package fundamentos;


//atalho para adicionar o import
//crtl + shift + o
// import tem que ficar fora da classe main
// importar a Date do javautil
import java.util.Date;


// importando butao JButton
//import javax.swing.JButton;


public class Import {
	public static void main(String[] args) {
				
		String s = "Bom dia!";
		System.out.println(s);
		
		// atalho para obter ajuda no comando
		// crtl + espaco
		// exemplo Date crtl+espaco - seleciono import javax.swing.JButton; depois enter 
		//ai ja sera importada a data
		Date d = new Date();// tem que ser Date
		System.out.println(d);
		
//		digito JBU ctrl+espaco e seleciono import javax.swing.JButton; e pressiono enter
//		JButton botao = new JButton();
	}
}

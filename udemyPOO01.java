package cursoUdemy;
import java.util.Scanner;
public class Exercicios {
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		String a, b, c;
		
		a = sc.nextLine();		//armazena na variavel string tudo da linha
		b = sc.next();			//armazena na variavel até o espaco
		c = sc.next();			
		int d = sc.nextInt();		//armazena na variavel int até espaço
			sc.nextLine();		// next line vazio
		String e = sc.nextLine();	
		var f = sc.next().charAt(0);	//armazena na variavel char o string posiçao X
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);	
		
		
	sc.close();	
		
		
	}

}

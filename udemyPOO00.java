package curso;
import java.util.Scanner;
public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello world!");

		int vlInteiro= 450; 				            // print = %d
		String vlString = "string"; 	        	// print = %s
		boolean vlBool = false;				          // print = 
		float vlReais = 1.456f;			          	// print = 
		double vlReaisDouble = 1.4534536;	      // print = %.2f	
		Object result;					              	// print = 
		int vlcarros = 2;
		
		System.out.println(vlString);
		System.out.println(vlReaisDouble);			            // sysout + ctrl space = atalho
		System.out.printf("%.2f%n", vlReaisDouble);         //%.NumCasas F %N <- pular linha
		
		System.out.printf("Maria tem %d e tem %d carros.%n", vlInteiro, vlcarros);

		
		sc.close();
	}

}

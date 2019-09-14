//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).


package cursoUdemy;
import java.util.Scanner;
public class Exercicios {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o valor de A");
		int vla = sc.nextInt();
		

		System.out.println("Insira o valor de B");
		int vlb = sc.nextInt();

		System.out.println("Insira o valor de C");
		int vlc = sc.nextInt();

		System.out.println("Insira o valor de D");
		int vld = sc.nextInt();
			
		int vldif = (vla*vlb)-(vlc*vld);
		
		System.out.println(vldif);
		
		
	sc.close();	
		
		
	}

}

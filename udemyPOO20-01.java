//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa

package udemyPOO20-01;
import java.util.Scanner;
public class Exercicios {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o primeiro valor");
		int vl1 = sc.nextInt();
		System.out.println("Insira o segundo valor");
		vl1 += sc.nextInt();
		

		System.out.printf("a somoa dos valores eh %d", vl1);
		
		
	sc.close();	
		
		
	}

}

//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//casas decimais conforme exemplos.
//Fórmula da área: area = π . raio2
//Considere o valor de π = 3.14159


package cursoUdemy;
import java.util.Scanner;
public class Exercicios {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o valor do raio");
		double vl1 = sc.nextInt();
		
		vl1 = (3.14159*(vl1*vl1));
		

		System.out.println(vl1);
		
		
	sc.close();	
		
		
	}

}

//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.

package cursoUdemy;
import java.util.Scanner;
public class Exercicios {
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		System.out.println("Insira o nome do funcionário:");
		String vlnome = read.nextLine();
		
		System.out.println("insira o numero de horas trabalhadas:");
		int vlhoras = read.nextInt();
		
		System.out.println("insira o custo da hora/homem:");
		double vlcusto = read.nextDouble();
		
		double vlsalario = vlhoras*vlcusto;

		System.out.printf("Funcionário: %s", vlnome);
		System.out.println();
		System.out.printf("Salário: %.2f", vlsalario);
		
		
	read.close();	
			
	}
}

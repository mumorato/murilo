package cursoUdemy;
import java.util.Scanner;
public class Exercicios {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your full name:");
		String vlname = sc.nextLine();
		
		System.out.println("How many bedrooms have in your house?");
		int vlquartos = sc.nextInt();
		
		System.out.println("Enter the product price:");
		double vlprice = sc.nextDouble();
		
		System.out.println("Enter your last name, age, and height (same line):");
		String vlLname = sc.next();
		int vlage = sc.nextInt();
		double vlpeso = sc.nextDouble();
		
		
		
		System.out.println(vlname);
		System.out.println(vlquartos);
		System.out.println(vlprice);
		System.out.println(vlLname);
		System.out.println(vlage);
		System.out.println(vlpeso);
		
		
	sc.close();	
		
		
	}

}

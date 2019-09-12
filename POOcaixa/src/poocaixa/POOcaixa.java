package poocaixa;

import java.util.Scanner;

public class POOcaixa {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ContaBancaria caixa = new ContaBancaria(100);
        for (int i = 0; i < 3; i++) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Insira o número referente a acão desejada:");
            System.out.println("1 - Saque");
            System.out.println("2 - Depósito");
            int vlopcao = sc.nextInt();
            System.out.println("Insira o valor daacao desejada");
            int vlacao = sc.nextInt();

            if (vlopcao == 1) {
                caixa.sacar(vlacao);
            } else {
                caixa.depositar(vlacao);
            }
            System.out.println("quantidade em caixa "+caixa.getQuantiaDinheiro()+".");
            System.out.println("quantidade de saques "+caixa.getNumeroSaques()+".");
            System.out.println("quantidade de depositos "+caixa.getNumeroDepositos()+".");
        }
    }

}

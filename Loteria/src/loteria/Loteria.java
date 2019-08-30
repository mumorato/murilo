

package loteria;

import java.util.Scanner;
public class Loteria {
    public static void main(String[] args) {
        
//  CRIANDO VETOR    int valores[] = new int [6];  E JÁ POPULANDO:       
        int valores[] = new int [] {0,0,0,0,0,0};
       
        Scanner in = new Scanner (System.in);
        System.out.println("Digite o numero");
        for (int i = 0; i < 6; i++) {
            int num = -1;
            while (num == -1) {
                num = funcao(in, i);
                for (int j = 0; j < i; j++) {
                    if (valores[j] == num) {
                        num = -1;
                    }
                }
            }
            valores[i]=num;
            imprimeVetor (valores);
        }       
    }
    
    public static int funcao(Scanner in, int i) {
        System.out.println("Digite o " + (i + 1) + "ro. numero.");
        int num = in.nextInt();

        if (num >= 1 && num <= 60) {
            return num;
        } else {
            return -1;
        }
    }
    
    public static void imprimeVetor (int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i]+" ");
        }
        System.out.println("");
    }
}

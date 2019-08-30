

package loteria;

import java.util.Scanner;
public class Loteria {
    public static void main(String[] args) {
       Scanner in = new Scanner (System.in);
        System.out.println("Digite o numero");
        for (int i = 0; i < 6; i++) {
            int num = -1;
            while (num == -1) {
            num = funcao(in, i);
            }
        }
    }
    public static int funcao(Scanner in, int i){
        System.out.println("Digite o " + (i+1)+ "ro. numero.");
        int num = in.nextInt();
        
        if (num >= 1 && num <= 60) {
            return num;
        }
        else{
            return -1;
        } 
            
        
    }
    
    
}

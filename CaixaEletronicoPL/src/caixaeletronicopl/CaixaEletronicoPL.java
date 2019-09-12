package caixaeletronicopl;

import java.util.Scanner;

public class CaixaEletronicoPL {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor para o saque: ");
        double vlSaque = sc.nextDouble();
        
        Contagem caixa = new Contagem();
        
        
            if (vlSaque % vtNotas[i] != 0) {                                    //se o resto é diferente de 0
                double vlRestante;
                for (int j = 0; j < vtNotas.length; j++) {
                    if (vtNotas[i] < vlSaque) {                                     //se a nota for menor que o vl
                        double vlCedulaRound = Math.round(vlSaque / vtNotas[i]);
                        vlRestante = vlSaque - (vlCedulaRound * vtNotas[i]);
                        vlSaque = vlCedulaRound * vtNotas[i];
                        System.out.println("debugg round: " + vlRestante);

                        if (vlRestante % vtNotas[i] == 0) {                             //se o vl restante for = a nota
                            for (int h = 0; h <= vtNotas.length; h++) {
                                vlRestante = vlRestante / vtNotas[i];
                                vlCedulaInt = vlRestante / vtNotas[i];
                                System.out.println(vlCedulaInt + " cedulas de " + vtNotas[i]);
                                break;
                            }
                        } else {                                                          //se nao

                            if (vlRestante >= 5) {
                                System.out.println("Resto: uma cedula de cedula de 5");
                            } else {
                                System.out.println("Resto:" + (vlRestante / 2) + " cedula de 2");
                            }
                        }
                    }

                    break;
                }
            }
        }

    }

}

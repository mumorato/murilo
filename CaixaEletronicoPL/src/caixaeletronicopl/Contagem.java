package caixaeletronicopl;
public class Contagem {
    
}
    static int vtNotas[] = new int[]{100, 50, 20, 10, 5, 2};
    static double vtResto[] = new double[20];

for (int i = 0; i < vtNotas.length; i++) {

            double vlCedulaInt;
            vtResto[i] = vlSaque % vtNotas[i];

            if (vlSaque % vtNotas[i] == 0) {

                for (int j = 0; j <= vtNotas.length; j++) {
                    vlCedulaInt = vlSaque / vtNotas[i];
                    System.out.println(vlCedulaInt + " cedulas de " + vtNotas[i]);
                    break;
                }
            }
            if (vtResto[i] == 1) {
                System.out.println("Resto = 1");
            }

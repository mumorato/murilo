/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote;

import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public class Programa extends Object {

    public static void main(String[] args) {
        Carro c1 = new Carro("chevrolet", "gasolina");
        Carro c2 = new Carro("ford", "flex");
        Carro c3 = new Carro("fiat", "alcool");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        if (c1.equals(c2)) {
            System.out.println("iguais");
        } else {
            System.out.println("diferente");
        }

        ArrayList<Carro> carros = new ArrayList<>("ford", "flex");

        int indice = carros.indexOf(carroPesquisa);
        if (indice > -1) {
            System.out.println("achou no" + indice);
        } else {
            System.out.println("nao achou");
        }
        System.out.println("------------------------------------");
        carros.sort(null);

    }

    @Override
    public int compareTo(Carro o) {
        return 0  
    }
}

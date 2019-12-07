/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote;

/**
 *
 * @author macbook
 */
public class Carro extends Object{

    private String marca;
    private String combustivel;

    public Carro(String marca, String combustivel) {
        this.marca = marca;
        this.combustivel = combustivel;
    }
    
    @Override
    public String toString(){
        
        return "marca: "+marca+" combustivel: "+combustivel;
    }

    @Override
    public boolean equals(Object obj) {
        Carro outroCarro=(Carro) obj;
        return marca.equals(outroCarro.marca)&& combustivel.equals(outroCarro.combustivel);
        
    }
    
}

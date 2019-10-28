
package model;


public class LivroImpresso extends Livro {

    public LivroImpresso(String autor, String isbn, String titulo, double preco) {//metodo construtor da classe Pai
        super(autor, isbn, titulo, preco);
    }

    @Override
    public double getPreco() {
        return super.getPreco()+100;
    }


    
}

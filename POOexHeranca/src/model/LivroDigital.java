package model;

public class LivroDigital extends Livro {

    private String marcaDagua;

    public LivroDigital(String autor, String isbn, String titulo, double preco, String marcaDagua) {//reinserir o construtor da
        super(autor, isbn, titulo, preco);                                                          //Super classe(pai)   

        this.marcaDagua = marcaDagua;
    }

    
    
    
    public String getMarcaDagua() {
        return marcaDagua;
    }

    public void setMarcaDagua(String marcaDagua) {
        this.marcaDagua = marcaDagua;
    }

}

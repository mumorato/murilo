
package model;


public class Livro {
    
    
 private String autor;                 
 private String isbn;                 
 private String titulo;                 
 private double preco;   

    public Livro(String autor, String isbn, String titulo, double preco) {          //construtor
        this.autor = autor;
        this.isbn = isbn;
        this.titulo = titulo;
        this.preco = preco;
    }
 
 
 
 

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
    
}

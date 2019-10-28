
package model;



public class Teste {
    public static void main(String[] args) {
      
     Livro livro = new Livro("Datel","23456","java",130);
     
        System.out.println("sem heranca: " + livro.getPreco());
        
     Livro ebook = new LivroDigital("Datel","23456","java",25,"epub");
     
        System.out.println("digital: " + ebook.getPreco());        

     Livro brochura = new LivroImpresso("Datel","23456","java",130);
     
        System.out.println("impresso: " + brochura.getPreco()); 


        
    }
  
}

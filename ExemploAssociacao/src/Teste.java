import jdk.internal.vm.PostVMInitHook;

public class Teste {
    public static void main(String[] args) {
   
     Cidade cidade1 = new Cidade();
            cidade1.setId(1);
            cidade1.setNome("Toledo");
     
     Autor autor1 = new Autor();
           autor1.setId(1);
           autor1.setNome("Deitel");
           autor1.setIdade(40);
           autor1.setSobrenome("Rossi");
           autor1.setCidade(cidade1);
           
     Livro livro1= new Livro();
           livro1.setId(1);
           livro1.setTitulo("Java");
           livro1.setAutor(autor1);
           
           
       System.out.println(livro1.getTitulo()+" - "+livro1.getAutor().getNome());
       System.out.println(livro1.getTitulo()+" - "+livro1.getAutor().getNome()+" - "+livro1.getAutor().getCidade().getNome());
       
   }
}

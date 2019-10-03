package br.com.ifprbiopark.sistfinanceiro;
public class ProgramaTeste {
  
    public static void main(String[] args) {
        
    Estado estadoObj = new Estado();
    estadoObj.setId(1);
    estadoObj.setNome("Parana");

    Cidade cidadeObj = new Cidade();
    cidadeObj.setId(1);
    cidadeObj.setNome("Toledo");
    cidadeObj.setEstado(estadoObj);

    Pessoa pessoaObj = new Pessoa();
    pessoaObj.setId(1);
    pessoaObj.setNome("Murilo");
    pessoaObj.setCidade(cidadeObj);

    System.out.println(pessoaObj.getNome()+"-"+pessoaObj.getCidade().getEstado().getNome()+"-"+pessoaObj.getCidade().getNome());



}


}
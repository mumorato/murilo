package visao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Arquivo {

    private String caminho;
    private String nome;

    
    public String[] ler() {
        String[] retorno = new String[4];
        return retorno;
    }

    public boolean gravar() throws FileNotFoundException {
        String path="";

        try (BufferedReader buffRead = new BufferedReader(new FileReader(path))) {
            String linha = "";
            while (true) {
                if (linha != null) {
                    System.out.println(linha);
                    
                } else {
                    break;
                }
                linha = buffRead.readLine();
            }
        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }

return true;

    }

    
    
    
    
    
    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

}

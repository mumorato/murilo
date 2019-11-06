package Modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivoConfigTelas {

    private String caminho;
    private String nome;

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

    public String[] ler() {

        String[] retorno = new String[4];
        BufferedReader in;

        try {

            in = new BufferedReader(new FileReader(this.caminho + this.nome));

            retorno[0] = in.readLine();
            retorno[1] = in.readLine();
            retorno[2] = in.readLine();
            retorno[3] = in.readLine();

        } catch (FileNotFoundException ex) {
            retorno[0] = "0";
            retorno[1] = "0";
            retorno[2] = "0";
            retorno[3] = "0";
        } catch (IOException ex) {
            retorno[0] = "0";
            retorno[1] = "0";
            retorno[2] = "0";
            retorno[3] = "0";
        }

        return retorno;
    }

    public boolean gravar() {
        return true;
    }

    public boolean salvar(String[] texto) {
        BufferedWriter out;

        try {
            out = new BufferedWriter(new FileWriter(this.caminho + this.nome));
            out.write(texto[0]);
            out.newLine();
            out.write(texto[1]);
            out.newLine();
            out.write(texto[2]);
            out.newLine();
            out.write(texto[3]);
            out.newLine();
            out.flush();
            out.close();

        } catch (IOException ex) {
            return false;
        }
        return true;
    }
}

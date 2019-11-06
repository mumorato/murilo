/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.FileOutputStream;

/**
 *
 * @author CCE
 */
public class Configuracao {

    public Configuracao(String nomeTela) {

        this.nomeTela = nomeTela;

        ArquivoConfigTelas arqConf = new ArquivoConfigTelas();

        arqConf.setCaminho("C:\\Arquivo\\");
        arqConf.setNome(nomeTela);
        String[] texto = arqConf.ler();

        try {
            this.posicaoX = Integer.valueOf(texto[0]);
            this.posicaoY = Integer.valueOf(texto[1]);
            this.largura = Integer.valueOf(texto[2]);
            this.altura = Integer.valueOf(texto[3]);
        } catch (Exception e) {
            this.posicaoX = 0;
            this.posicaoY = 0;
            this.largura = 0;
            this.altura = 0;
        }
    }

    /**
     * @return the nomeTela
     */
    public String getNomeTela() {
        return nomeTela;
    }

    /**
     * @param nomeTela the nomeTela to set
     */
    public void setNomeTela(String nomeTela) {
        this.nomeTela = nomeTela;
    }

    /**
     * @return the posicaoX
     */
    public int getPosicaoX() {
        return posicaoX;
    }

    /**
     * @param posicaoX the posicaoX to set
     */
    public void setPosicaoX(int posicaoX) {
        this.posicaoX = posicaoX;
    }

    /**
     * @return the posicaoY
     */
    public int getPosicaoY() {
        return posicaoY;
    }

    /**
     * @param posicaoY the posicaoY to set
     */
    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }

    /**
     * @return the largura
     */
    public int getLargura() {
        return largura;
    }

    /**
     * @param largura the largura to set
     */
    public void setLargura(int largura) {
        this.largura = largura;
    }

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    private String nomeTela;
    private Integer posicaoX;
    private Integer posicaoY;
    private Integer largura;
    private Integer altura;

    public void salvar() {

        ArquivoConfigTelas arqConf = new ArquivoConfigTelas();

        arqConf.setCaminho("C:\\Arquivo\\");
        arqConf.setNome(nomeTela);
        String[] texto = new String[4];

        texto[0] = this.posicaoX.toString();
        texto[1] = this.posicaoY.toString();
        texto[2] = this.largura.toString();
        texto[3] = this.altura.toString();

        arqConf.salvar(texto);

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

public class Configuracao {

    
    private String nomeTela;
    private int posicaoX;
    private int posicaoY;
    private int largura;
    private int altura;

    Configuracao(String nomeTela) {
        this.nomeTela = nomeTela;
        
        Arquivo arqConf = new Arquivo();
        
        arqConf.setCaminho("//Macbook//⁩");
        arqConf.setNome(nomeTela);
        arqConf.ler();
        String[] texto = arqConf.ler();
        
        this.posicaoX = Integer.valueOf(texto[0]);
        this.posicaoY = Integer.valueOf(texto[0]);
        this.largura = Integer.valueOf(texto[0]);
        this.altura = Integer.valueOf(texto[0]);
        
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
    
    
}

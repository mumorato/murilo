/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifprbiopark.pl10.singleton;

/**
 *
 * @author macbook
 */
public class Teste {
    public static void main(String[] args) {
        
       Conexao conexao1 = Conexao.getInstance(); //chama método que cria objeto
       Conexao a = Conexao.getInstance(); //teste de conexao
       Conexao b = Conexao.getInstance(); //teste de conexao
       // varias conexoes (botoes) chamando o getInstance (método de conectar).
       //Ele vai verificar se o atributo "instancia"tem valor nulo ou se já tem
       //endereçamento na memória. Se houver sai di IF e nao instancia uma nova conexao.
    }
}

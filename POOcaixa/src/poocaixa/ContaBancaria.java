/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poocaixa;

/**
 *
 * @author macbook
 */
public class ContaBancaria {
    int quantiaDinheiro;
    int numeroSaques;
    int numeroDepositos;
    
    void sacar(int vlinserido){
    quantiaDinheiro -=  vlinserido;
    numeroSaques ++; 
    }
    void depositar(int vlinserido){
    quantiaDinheiro +=  vlinserido;
    numeroDepositos ++;
    }
    
}

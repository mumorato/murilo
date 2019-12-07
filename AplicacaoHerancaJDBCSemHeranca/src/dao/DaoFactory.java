/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Cidade;
import modelo.Fornecedor;

/**
 *
 * @author macbook
 */
public class DaoFactory {

    public static Dao getDAO(Object obj) {
        if (obj instanceof Cidade) {
            return new CidadeDao();
        }
        
        if (obj instanceof Fornecedor) {
            return new FornecedorDao();
        }
        
        //se criar novas instancias, incluir aqui o return do DAO
        
        return null;
    }
}

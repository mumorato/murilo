/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Categoria;
import modelo.Pessoa;
import modelo.Subcategoria;

/**
 *
 * @author macbook
 */
public class DaoFactory {
    
    public static Dao getDAO(Object obj) {

        if (obj instanceof Categoria) {
            return new CategoriaDao();
        }
        if (obj instanceof Subcategoria) {
            return new SubcategoriaDao();
        }
        
        if (obj instanceof Pessoa) {
            return new PessoaDao();
        }
        
        
        //se criar novas instancias, incluir aqui o return do DAO
        return null;
    }

}
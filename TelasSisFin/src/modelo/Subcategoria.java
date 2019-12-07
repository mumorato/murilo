/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author macbook
 */
public class Subcategoria {

    private int idSubcategoria;
    private String nomeSubcategoria;
    private int categoriaId;

    private String nomeCategoriaSubcategoria;
    private String nomeTipoSubcategoria;

    public int getIdSubcategoria() {
        return idSubcategoria;
    }

    public void setIdSubcategoria(int idSubcategoria) {
        this.idSubcategoria = idSubcategoria;
    }

    public String getNomeSubcategoria() {
        return nomeSubcategoria;
    }

    public void setNomeSubcategoria(String nomeSubcategoria) {
        this.nomeSubcategoria = nomeSubcategoria;
    }

    public int getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(int categoriaId) {
        this.categoriaId = categoriaId;
    }

    public String getNomeCategoriaSubcategoria() {
        return nomeCategoriaSubcategoria;
    }

    public void setNomeCategoriaSubcategoria(String nomeCategoriaSubcategoria) {
        this.nomeCategoriaSubcategoria = nomeCategoriaSubcategoria;
    }

    public String getNomeTipoSubcategoria() {
        return nomeTipoSubcategoria;
    }

    public void setNomeTipoSubcategoria(String nomeTipoSubcategoria) {
        this.nomeTipoSubcategoria = nomeTipoSubcategoria;
    }

}

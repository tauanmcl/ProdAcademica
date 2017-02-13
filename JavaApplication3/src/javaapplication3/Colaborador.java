
package javaapplication3;

import java.util.ArrayList;

public class Colaborador {

    private int idColab;
    private String nome;
    private String email;
    private ArrayList <Projeto> listaProjetos = new ArrayList<>();
    private ArrayList <Publicacao> listaPublicacoes = new ArrayList <>();
       
    
    /**
     * @return the idColab
     */
    public int getIdColab() {
        return idColab;
    }

    /**
     * @param idColab the idColab to set
     */
    public void setIdColab(int idColab) {
        this.idColab = idColab;
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the listaProjetos
     */
    public ArrayList <Projeto> getListaProjetos() {
        return listaProjetos;
    }

    /**
     * @param projVinculado the listaProjetos to set
     */
    public void setListaProjetos(Projeto projVinculado) {
        this.listaProjetos.add(projVinculado);
    }

    /**
     * @return the listaPublicacoes
     */
    public ArrayList <Publicacao> getListaPublicacoes() {
        return listaPublicacoes;
    }

    /**
     * @param publiVinculada the listaPublicacoes to set
     */
    public void setListaPublicacoes(Publicacao publiVinculada) {
        this.listaPublicacoes.add (publiVinculada);
    }

}

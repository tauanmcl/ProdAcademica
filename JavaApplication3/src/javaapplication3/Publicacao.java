
package javaapplication3;

import java.util.ArrayList;

public class Publicacao {
    
    private ArrayList <Colaborador> listaColaboradores = new ArrayList <>();
    private ArrayList <Projeto> listaProjetos = new ArrayList <>();
    private String titulo;
    private String confOndeFoiPublicada;
    private int anoDePublicacao;

    /**
     * @return the listaColaboradores
     */
    public ArrayList <Colaborador> getListaColaboradores() {
        return listaColaboradores;
    }

    /**
     * @param colabVinculado the listaColaboradores to set
     */
    public void setListaColaboradores(Colaborador colabVinculado) {
        this.listaColaboradores.add(colabVinculado);
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
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the confOndeFoiPublicada
     */
    public String getConfOndeFoiPublicada() {
        return confOndeFoiPublicada;
    }

    /**
     * @param confOndeFoiPublicada the confOndeFoiPublicada to set
     */
    public void setConfOndeFoiPublicada(String confOndeFoiPublicada) {
        this.confOndeFoiPublicada = confOndeFoiPublicada;
    }

    /**
     * @return the anoDePublicacao
     */
    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    /**
     * @param anoDePublicacao the anoDePublicacao to set
     */
    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }
}

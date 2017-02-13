
package javaapplication3;

import java.util.ArrayList;

public class Projeto {

    private int idProj;
    private int status = 1;
    private String titulo;
    private int inicioDia;
    private int inicioMes;
    private int inicioAno;
    private int fimDia =-1;
    private int fimMes =-1;
    private int fimAno =-1;
    private String financiador;
    private int valorFinanciamento;
    private String objetivo;
    private String descricao;
    private ArrayList <Colaborador> listaColaboradores = new ArrayList <>();
    private ArrayList <Publicacao> listaPublicacoes = new ArrayList <>();
            
    /**
     * @return the idProj
     */
    public int getIdProj() {
        return idProj;
    }

    /**
     * @param idProj the idProj to set
     */
    public void setIdProj(int idProj) {
        this.idProj = idProj;
    }
    
    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
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
     * @return the inicioDia
     */
    public int getInicioDia() {
        return inicioDia;
    }

    /**
     * @param inicioDia the inicioDia to set
     */
    public void setInicioDia(int inicioDia) {
        this.inicioDia = inicioDia;
    }

    /**
     * @return the inicioMes
     */
    public int getInicioMes() {
        return inicioMes;
    }

    /**
     * @param inicioMes the inicioMes to set
     */
    public void setInicioMes(int inicioMes) {
        this.inicioMes = inicioMes;
    }

    /**
     * @return the iniciioAno
     */
    public int getInicioAno() {
        return inicioAno;
    }

    /**
     * @param iniciioAno the iniciioAno to set
     */
    public void setInicioAno(int iniciioAno) {
        this.inicioAno = iniciioAno;
    }

    /**
     * @return the fimDia
     */
    public int getFimDia() {
        return fimDia;
    }

    /**
     * @param fimDia the fimDia to set
     */
    public void setFimDia(int fimDia) {
        this.fimDia = fimDia;
    }

    /**
     * @return the fimMes
     */
    public int getFimMes() {
        return fimMes;
    }

    /**
     * @param fimMes the fimMes to set
     */
    public void setFimMes(int fimMes) {
        this.fimMes = fimMes;
    }

    /**
     * @return the fimAno
     */
    public int getFimAno() {
        return fimAno;
    }

    /**
     * @param fimAno the fimAno to set
     */
    public void setFimAno(int fimAno) {
        this.fimAno = fimAno;
    }

    /**
     * @return the financiador
     */
    public String getFinanciador() {
        return financiador;
    }

    /**
     * @param financiador the financiador to set
     */
    public void setFinanciador(String financiador) {
        this.financiador = financiador;
    }

    /**
     * @return the valorFinanciamento
     */
    public int getValorFinanciamento() {
        return valorFinanciamento;
    }

    /**
     * @param valorFinanciamento the valorFinanciamento to set
     */
    public void setValorFinanciamento(int valorFinanciamento) {
        this.valorFinanciamento = valorFinanciamento;
    }

    /**
     * @return the objetivo
     */
    public String getObjetivo() {
        return objetivo;
    }

    /**
     * @param objetivo the objetivo to set
     */
    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the listaColaboradores
     */
    public ArrayList <Colaborador> getListaColaboradores() {
        return this.listaColaboradores;
    }

    /**
     * @param colabVinculado the listaColaboradores to set
     */
    public void setListaColaboradores(Colaborador colabVinculado) {
        this.listaColaboradores.add(colabVinculado);
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
        this.listaPublicacoes.add(publiVinculada);
    }

}

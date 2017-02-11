
package produtividadeacademica;

import java.util.ArrayList;

public class Colaborador {
    private String nome;
    private String email;
    private ArrayList <Projeto> listaProjetos;
    
    public Colaborador(){
        listaProjetos = new ArrayList <Projeto>();
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
     * @param listaProjetos the listaProjetos to set
     */
    public void setListaProjetos(ArrayList <Projeto> listaProjetos) {
        this.listaProjetos = listaProjetos;
    }
}

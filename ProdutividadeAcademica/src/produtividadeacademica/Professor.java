
package produtividadeacademica;

import java.util.ArrayList;

public class Professor extends Colaborador{
    
    private ArrayList <Publicacao> listaPublicacoes;
    private ArrayList <Orientacao> listaOrientacoes;
    
    public Professor(){
        listaPublicacoes = new ArrayList <Publicacao>();
        listaOrientacoes = new ArrayList <Orientacao>();
    }
}

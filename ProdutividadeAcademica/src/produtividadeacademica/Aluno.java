
package produtividadeacademica;

public class Aluno extends Colaborador
{    
    private int tipoAluno;
    /*
        1- Graduando
        2- Mestrando
        3- Doutorando
    */

    /**
     * @return the tipoAluno
     */
    public int getTipoAluno() {
        return tipoAluno;
    }

    /**
     * @param tipoAluno the tipoAluno to set
     */
    public void setTipoAluno(int tipoAluno) {
        this.tipoAluno = tipoAluno;
    }
}

package Registro;
import Clases.*;


public class Registro_Candidatos {
    
    private Candidato[] candidatos;
    

    public Registro_Candidatos() {
        candidatos = new Candidato[0];
    }

    public Registro_Candidatos(Candidato[] candidatos) {
        this.candidatos = candidatos;
    }

    public Candidato[] getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(Candidato[] candidatos) {
        this.candidatos = candidatos;
    }

    
    
    
    
    
    
    
}

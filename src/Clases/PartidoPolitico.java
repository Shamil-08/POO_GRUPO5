package Clases;
public class PartidoPolitico {
    
    protected String nombrePartido;
    protected String nombresRepresentante;
    protected Candidato[] candidatos;

    public PartidoPolitico(){
        nombrePartido = "";
        nombresRepresentante = "";
        candidatos = new Candidato[0];
    }
    
    public PartidoPolitico(String nombrePartido, String nombresRepresentante, Candidato[] candidatos) {
        this.nombrePartido = nombrePartido;
        this.nombresRepresentante = nombresRepresentante;
        this.candidatos = candidatos;
    }

    public String getNombrePartido() {
        return nombrePartido;
    }

    public void setNombrePartido(String nombrePartido) {
        this.nombrePartido = nombrePartido;
    }

    public String getNombresRepresentante() {
        return nombresRepresentante;
    }

    public void setNombresRepresentante(String nombresRepresentante) {
        this.nombresRepresentante = nombresRepresentante;
    }

    public Candidato[] getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(Candidato[] candidatos) {
        this.candidatos = candidatos;
    }
    
    
    
    
}

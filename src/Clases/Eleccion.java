package Clases;
public class Eleccion {
    
    protected String tipoEleccion;
    protected String fecha;
    protected Candidato[] candidatos;
    protected PartidoPolitico[] partidos;
    protected MesaElectoral[] mesas;

    public Eleccion() {
        tipoEleccion = "";
        fecha = "";
        candidatos = new Candidato[0];
        partidos = new PartidoPolitico[0];
        mesas = new MesaElectoral[0];
    }

    public Eleccion(String tipoEleccion, String fecha, Candidato[] candidatos, PartidoPolitico[] partidos, MesaElectoral[] mesas) {
        this.tipoEleccion = tipoEleccion;
        this.fecha = fecha;
        this.candidatos = candidatos;
        this.partidos = partidos;
        this.mesas = mesas;
    }

    public String getTipoEleccion() {
        return tipoEleccion;
    }

    public void setTipoEleccion(String tipoEleccion) {
        this.tipoEleccion = tipoEleccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Candidato[] getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(Candidato[] candidatos) {
        this.candidatos = candidatos;
    }

    public PartidoPolitico[] getPartidos() {
        return partidos;
    }

    public void setPartidos(PartidoPolitico[] partidos) {
        this.partidos = partidos;
    }

    public MesaElectoral[] getMesas() {
        return mesas;
    }

    public void setMesas(MesaElectoral[] mesas) {
        this.mesas = mesas;
    }
    
    
    
    
}

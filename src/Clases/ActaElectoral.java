package Clases;
public class ActaElectoral {

    protected String titulo;
    protected int numeroActa;
    protected String fecha;
    protected String hora;
    protected int nroVotantes;
    protected int nroVotosValidos;
    protected int nroVotosNulos;
    protected int nroVotosBlanco;
    protected int[] nroVotoPorCandidato;
    protected String observacion;
    protected MiembroDeMesa[] miembros;

    public ActaElectoral() {
        titulo = "";
        numeroActa = 0;
        fecha = "";
        hora = "";
        nroVotantes = 0;
        nroVotosValidos = 0;
        nroVotosNulos = 0;
        nroVotosBlanco = 0;
        nroVotoPorCandidato = new int[0];
        observacion = "";
        miembros = new MiembroDeMesa[0];
    }

    public ActaElectoral(String titulo, int numeroActa, String fecha, String hora, int nroVotantes, int nroVotosValidos, int nroVotosNulos, int nroVotosBlanco, int[] nroVotoPorCandidato, String observacion, MiembroDeMesa[] miembros) {
        this.titulo = titulo;
        this.numeroActa = numeroActa;
        this.fecha = fecha;
        this.hora = hora;
        this.nroVotantes = nroVotantes;
        this.nroVotosValidos = nroVotosValidos;
        this.nroVotosNulos = nroVotosNulos;
        this.nroVotosBlanco = nroVotosBlanco;
        this.nroVotoPorCandidato = nroVotoPorCandidato;
        this.observacion = observacion;
        this.miembros = miembros;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroActa() {
        return numeroActa;
    }

    public void setNumeroActa(int numeroActa) {
        this.numeroActa = numeroActa;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getNroVotantes() {
        return nroVotantes;
    }

    public void setNroVotantes(int nroVotantes) {
        this.nroVotantes = nroVotantes;
    }

    public int getNroVotosValidos() {
        return nroVotosValidos;
    }

    public void setNroVotosValidos(int nroVotosValidos) {
        this.nroVotosValidos = nroVotosValidos;
    }

    public int getNroVotosNulos() {
        return nroVotosNulos;
    }

    public void setNroVotosNulos(int nroVotosNulos) {
        this.nroVotosNulos = nroVotosNulos;
    }

    public int getNroVotosBlanco() {
        return nroVotosBlanco;
    }

    public void setNroVotosBlanco(int nroVotosBlanco) {
        this.nroVotosBlanco = nroVotosBlanco;
    }

    public int[] getNroVotoPorCandidato() {
        return nroVotoPorCandidato;
    }

    public void setNroVotoPorCandidato(int[] nroVotoPorCandidato) {
        this.nroVotoPorCandidato = nroVotoPorCandidato;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public MiembroDeMesa[] getMiembros() {
        return miembros;
    }

    public void setMiembros(MiembroDeMesa[] miembros) {
        this.miembros = miembros;
    }
    
    
}

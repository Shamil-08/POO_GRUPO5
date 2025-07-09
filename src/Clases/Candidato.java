package Clases;
public class Candidato {
    
    protected String nombres;
    protected String apellidos;
    protected String partido;
    protected int DNI;
    
    public Candidato(){
        nombres = "";
        apellidos = "";
        partido = "";
        DNI = 0;
    }

    public Candidato(String nombres, String apellidos, String partido, int DNI) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.partido = partido;
        this.DNI = DNI;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    
    
    
}

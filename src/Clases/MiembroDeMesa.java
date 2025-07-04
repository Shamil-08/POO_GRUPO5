package Clases;
public class MiembroDeMesa {
    
    protected String nombres;
    protected String apellidos;
    protected String tipoMiembro;
    protected int DNI;
    

    public MiembroDeMesa() {
        nombres = "";
        apellidos = "";
        tipoMiembro = "";
        DNI = 0;
    }

    public MiembroDeMesa(String nombres, String apellidos, String tipoMiembro, int DNI) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoMiembro = tipoMiembro;
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

    public String getTipoMiembro() {
        return tipoMiembro;
    }

    public void setTipoMiembro(String tipoMiembro) {
        this.tipoMiembro = tipoMiembro;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    
    
    
    
    
}

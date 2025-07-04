package Clases;
public class Operador {

    protected String nombres;
    protected String apellidos;
    protected int DNI;
    protected String user;
    protected String password;

    public Operador() {
        nombres = "";
        apellidos = "";
        DNI = 0;
        user = "";
        password = "";
    }

    
    
    public Operador(String nombres, String apellidos, int DNI, String user, String password) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.user = user;
        this.password = password;
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

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    
}

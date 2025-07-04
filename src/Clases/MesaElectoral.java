package Clases;
public class MesaElectoral {
    
    protected String ubicacion;
    protected int indentificador;
    protected MiembroDeMesa[] miembros;

    public MesaElectoral(){
        ubicacion = "";
        indentificador = 0;
        miembros = new MiembroDeMesa[0];
    }
    
    public MesaElectoral(String ubicacion, int indentificador, MiembroDeMesa[] miembros) {
        this.ubicacion = ubicacion;
        this.indentificador = indentificador;
        this.miembros = miembros;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getIndentificador() {
        return indentificador;
    }

    public void setIndentificador(int indentificador) {
        this.indentificador = indentificador;
    }

    public MiembroDeMesa[] getMiembros() {
        return miembros;
    }

    public void setMiembros(MiembroDeMesa[] miembros) {
        this.miembros = miembros;
    }
    
    
}

package Registro;
import Clases.*;



public class Registro_Partidos {
        
    private PartidoPolitico[] partidos;
    
    
    public Registro_Partidos(){
        partidos = new PartidoPolitico[0];
        
    }

    public Registro_Partidos(PartidoPolitico[] partidos) {
        this.partidos = partidos;
    }

    public PartidoPolitico[] getPartidos() {
        return partidos;
    }

    public void setPartidos(PartidoPolitico[] partidos) {
        this.partidos = partidos;
    }
    
    
    
    
}

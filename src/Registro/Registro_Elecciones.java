package Registro;
import Clases.*;

public class Registro_Elecciones {
    private Eleccion[] elecciones;
    
    public Registro_Elecciones(){
        elecciones = new Eleccion[0];
    }

    public Registro_Elecciones(Eleccion[] elecciones) {
        this.elecciones = elecciones;
    }

    public Eleccion[] getElecciones() {
        return elecciones;
    }

    public void setElecciones(Eleccion[] elecciones) {
        this.elecciones = elecciones;
    }
    
    public void añadirEleccion(Eleccion eleccion){
        
        Eleccion[] aux = new Eleccion[longitud()+1];
        
        for (int i = 0; i < longitud(); i++) {
            aux[i] = elecciones[i];
        }
        
        aux[longitud()] = eleccion;
        
        this.elecciones = aux;
        
    }
    
    public void eliminarEleccion(int indice){
        
        Eleccion[] elec = new Eleccion[longitud() - 1];
        
        for (int i = indice; i < longitud() - 1; i++) {
            elecciones[i] = elecciones[indice + 1];
        }
        
        for (int i = 0; i < elec.length; i++) {
            elec[i] = elecciones[i];
        }
        
        this.elecciones = elec;
        
    }
    
    
    
    
    public int longitud(){
        int n;
        n = elecciones.length;
        //System.out.println(n);
        return n;
    }
    
    
    public void añadirCandidato(int indice, Candidato cand){
        Eleccion elec = elecciones[indice];
        
        elec.añadirCandidato(cand);
        elecciones[indice] = elec;

    }

    public void eliminarCandidato(int indice){
        Eleccion elec = elecciones[indice];
        elec.eliminarCandidato(indice);
        elecciones[indice] = elec;
    }
    
    
}

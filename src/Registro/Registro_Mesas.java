package Registro;
import Clases.*;



public class Registro_Mesas {
    
    private MesaElectoral[] mesas;
    
    
    public Registro_Mesas(){
        mesas = new MesaElectoral[0];
    }

    public Registro_Mesas(MesaElectoral[] mesas) {
        this.mesas = mesas;
    }
    
    
    

    public MesaElectoral[] getMesas() {
        return mesas;
    }

    public void setMesas(MesaElectoral[] mesas) {
        this.mesas = mesas;
    }
    
    
    
}

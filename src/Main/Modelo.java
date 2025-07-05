package Main;
import Igu.*;
import Clases.*;
public class Modelo {
    
    public static void main(String[] args) {
        
        //Crear objeto Operador
        Operador operador1 = new Operador("Angelo", "Gutierrez", 7654321, "admin", "1234");
        
        
        
        
        PantallaOperador panta = new PantallaOperador(operador1);
        
        panta.setVisible(true);
        panta.setLocationRelativeTo(null);
        
        
        
        
        
    }
    
    
}

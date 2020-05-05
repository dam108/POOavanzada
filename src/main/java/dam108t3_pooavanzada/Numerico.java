
package dam108t3_pooavanzada;

public class Numerico <T extends Number>{
    private T lado;
    
    Numerico(T lado){
        this.lado = lado;
    }
    
    public Number area(){
        return this.lado.doubleValue()*lado.doubleValue();
    }
}


package dam108t3_pooavanzada;

public enum Madera {
    ROBLE(40),
    SAPELLY(50), 
    NOGAL(60),
    CEREZO(70), 
    BAMBU(100);
    int precio;
    final static double TAMAÑO_CAJA = 2.5;
    Madera(int precio){this.precio= precio;}
    
    public int calcularCajas(double alto, double ancho){
    
        double metroCuadrado = alto * ancho;
        
        double cajas = metroCuadrado / TAMAÑO_CAJA;
        
        if( cajas %2 != 0){
           cajas = (int)cajas + 1;
        }
        
        return (int)cajas;
    }
    
    public int calcularPrecio(Madera m, int c){
        return m.precio * c;
    }
}

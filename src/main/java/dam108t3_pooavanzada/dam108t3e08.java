
package dam108t3_pooavanzada;

public class dam108t3e08 {

    public static void main(String[] args) {
        
        Numerico<Integer> cuadrado1 = new Numerico(10);
        Numerico<Long> cuadrado2 = new Numerico(852);
        Numerico<Double> cuadrado3 = new Numerico(12.5d);
        
        System.out.println("El area de Integer es: "+cuadrado1.area());
        System.out.println("El area de Long es: "+cuadrado2.area());
        System.out.println("El area de double es: "+cuadrado3.area());

        
    }
    
}

package dam108t3_pooavanzada;

import java.util.Scanner;
import java.util.regex.Pattern;

public class dam108t3e05a {
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Introduce una matricula de coche (1234ABC)");
        String matricula = teclado.nextLine();
        
        boolean validar = validarExp(matricula);
        
        if (validar)System.out.println("La matricula es correcta");
        else System.out.println("La matricula no es correcta");
        
    }
    
    public static boolean validarExp(String m){
        String rexexp = "\\d{4}[A-Z]{3}";
        
        return Pattern.matches(rexexp, m);
        
    }
    
}

package dam108t3_pooavanzada;

import java.util.Scanner;
import java.util.regex.Pattern;

public class dam108t3e05d {
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Introduce una fecha (YYY-MM-DD)");
        String fec = teclado.nextLine();
        
        boolean validar = validarExp(fec);
        
        if (validar)System.out.println("La fecha es correcta");
        else System.out.println("La fecha no es correcta");
        
    }
    
    public static boolean validarExp(String fec){
        String rexexp = "\\d{4}-\\d{2}-\\d{2}";
        
        return Pattern.matches(rexexp, fec);
        
    }
    
}

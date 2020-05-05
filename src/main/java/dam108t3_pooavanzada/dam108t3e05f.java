package dam108t3_pooavanzada;

import java.util.Scanner;
import java.util.regex.Pattern;

public class dam108t3e05f {
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Introduce un usuario de Twitter (@NomBre12-89_1a)");
        String fec = teclado.nextLine();
        
        boolean validar = validarExp(fec);
        
        if (validar)System.out.println("El usuario de Twitter es correcto");
        else System.out.println("El usuario de Twitter no es correcto");
        
    }
    
    public static boolean validarExp(String fec){
        String rexexp = "@([A-Za-z]+[A-Za-z0-9-_]+)";
        
        return Pattern.matches(rexexp, fec);
        
    }
    
}

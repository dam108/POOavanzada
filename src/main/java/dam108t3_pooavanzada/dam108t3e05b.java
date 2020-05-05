package dam108t3_pooavanzada;

import java.util.Scanner;
import java.util.regex.Pattern;

public class dam108t3e05b {
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Introduce un numero binario (0110)");
        String bin = teclado.nextLine();
        
        boolean validar = validarExp(bin);
        
        if (validar)System.out.println("El numero binario es correcto");
        else System.out.println("El numero binario no es correcto");
        
    }
    
    public static boolean validarExp(String b){
        String rexexp = "(0|1)*";
        
        return Pattern.matches(rexexp, b);
        
    }
    
}

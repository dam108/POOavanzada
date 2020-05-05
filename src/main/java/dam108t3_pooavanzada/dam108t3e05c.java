package dam108t3_pooavanzada;

import java.util.Scanner;
import java.util.regex.Pattern;

public class dam108t3e05c {
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Introduce un numero Hexadecimal");
        String hex = teclado.nextLine();
        
        boolean validar = validarExp(hex);
        
        if (validar)System.out.println("El numero Hexadecimal es correcto");
        else System.out.println("El numero Hexadecimal no es correcto");
        
    }
    
    public static boolean validarExp(String hex){
        String rexexp = "[0-9a-fA-F]+";
        
        return Pattern.matches(rexexp, hex);
        
    }
    
}

package dam108t3_pooavanzada;

import java.util.Scanner;

public class dam108t3e04 {
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        try{
            System.out.println("Introduce un valor entero");
            String sN = teclado.nextLine();

            Integer n = Integer.valueOf(sN);

            System.out.println(Integer.toHexString(n));
        } 
        catch (NumberFormatException ex){
            System.out.println("Valor no valido: "+ex.getMessage());
        }
    }
    
}

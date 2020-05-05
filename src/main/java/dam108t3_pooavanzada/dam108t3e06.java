package dam108t3_pooavanzada;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class dam108t3e06 {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduce un email (miemail@dominio.subdominio.com)");
        String email = teclado.nextLine();

        boolean validar = validarExp(email);

        if (validar) {
            System.out.println("El email introducido es correcto");
            String dominio = extraerDominio(email);
            System.out.println("El dominio es: "+dominio);
        } else {
            System.out.println("El email introducido no es correcto");
        }
    }

    public static boolean validarExp(String email) {
        String rexexp = "[^@]+@[^@]+\\.[a-zA-Z]{2,}";

        return Pattern.matches(rexexp, email);

    }
    
    public static String extraerDominio (String email){
        Pattern patron = Pattern.compile("([^@]+)@([^@]+)\\.([a-zA-Z]{2,})");
        Matcher matcher = patron.matcher(email);
        matcher.find();
//        System.out.println(matcher.group(1));
//        System.out.println(matcher.group(2));
//        System.out.println(matcher.group(3));
        return matcher.group(2);
        
    }

}



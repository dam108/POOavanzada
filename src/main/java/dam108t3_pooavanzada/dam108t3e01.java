package dam108t3_pooavanzada;

import java.util.HashSet;
import java.util.Scanner;

public class dam108t3e01 {
    public static HashSet<Persona> personas;
    public static Persona p;
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        personas = new HashSet<>();
        String nombre = null;
        do{
            System.out.println("Introduce El nombre de la persona");
            nombre = teclado.nextLine();
            
            if(!nombre.equals("Z")){
                pedirDatos(nombre);
            }
        }while(!nombre.equals("Z"));
        
        for (Persona x: personas) {
            System.out.println(x.toString());
        }
        
    }
    
    public static void pedirDatos(String n){
        String nombre = n, dni, email, fecha;
        int gen, tel;
        EnumGenero genero = EnumGenero.MASCULINO;
        System.out.println("introduce el dni de la persona");
        dni = teclado.nextLine();
        System.out.println("introduce el telefono de la persona");
        tel = teclado.nextInt();teclado.nextLine();
        System.out.println("introduce el email de la persona");
        email = teclado.nextLine();
        System.out.println("introduce el fecha de nacimiento de la persona");
        fecha = teclado.nextLine();
        System.out.println("Selecciona el genero de la persona\n1.Masculino\n2.Fenenimo");
        gen = teclado.nextInt();teclado.nextLine();
        if(gen == 1) genero = EnumGenero.MASCULINO;
        else if (gen == 2 ) genero = EnumGenero.FEMENINO;
        else System.out.println("No has seleccionado una opcion correcta, "
                + "se pondra por defecto genero Masculino");
        
        personas.add(new Persona(dni, nombre, tel, email, fecha, genero));

    }
    
}

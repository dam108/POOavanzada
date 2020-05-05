package dam108t3_pooavanzada;

public class OperadorString implements Operable<String>{
    
    public String suma(String n1, String n2){
        return n1 + n2;
    }
    public String resta(String n1, String n2){
        String cadena;
        cadena = n1.replaceAll(n2, "");
        
        return cadena;
    }  
}

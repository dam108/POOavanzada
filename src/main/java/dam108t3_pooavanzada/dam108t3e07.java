package dam108t3_pooavanzada;

import java.util.ArrayList;

public class dam108t3e07 {
    public static void main(String[] args) {
        ListaPequeña listape = new ListaPequeña(5);
        listape.añadi("Hola1");
        listape.añadi("Hola2");
        listape.añadi("Hola3");
        listape.añadi("Hola4");
        listape.añadi("Hola5");
        listape.añadi("Hola6");
        listape.añadi("Hola7");
        
        System.out.println(listape.getValores());
        
//        for (String s : (ArrayList<String>)listape.getValores()) {
//            System.out.println(s);
//        }
        
    }
    
}

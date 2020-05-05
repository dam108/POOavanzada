package dam108t3_pooavanzada;

import java.util.ArrayList;

public class Tablero {
    static ArrayList <ArrayList <Integer>> casillas = new ArrayList<>();
    private static Tablero instance = null;
    
    private Tablero (){
        iniciarTabler();
    }
    
    public static Tablero getInstance(){
        if ( instance == null) new Tablero();
        return instance;
    }
    
    public void iniciarTabler(){
        for (int i = 0; i < 20; i++) {
            casillas.add(new ArrayList<>());
            for (int j = 0; j < 20; j++) {
                casillas.get(i).add(0);
            }
        }
    }
    
    public static ArrayList getCasillas(){
        return casillas;
    }
}

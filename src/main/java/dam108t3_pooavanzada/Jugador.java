
package dam108t3_pooavanzada;

public class Jugador {
    int id;
    int fila;
    int columna;
    Tablero t1;
    
    Jugador(){
        this.id = 0;
        t1 = Tablero.getInstance();
    }
    
    public void altaJugador(){
        id++;
        do {
            fila = (int)(Math.random()*20);
            columna = (int)(Math.random()*20); 
        }while(t1.casillas.get(fila).get(columna) != 0);
        t1.casillas.get(fila).set(columna, id);
    }
}

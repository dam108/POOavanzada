
package dam108t3_pooavanzada;

public class dam108t3e13 {


    public static void main(String[] args) {
        Jugador j = new Jugador();
        
        j.altaJugador();
        j.altaJugador();
        j.altaJugador();
        j.altaJugador();
        j.altaJugador();
        j.altaJugador();
        j.altaJugador();
        j.altaJugador();
        j.altaJugador();
     

        for (int i = 0; i < Tablero.casillas.size(); i++) {
            for (int k = 0; k < Tablero.casillas.get(i).size(); k++) {
                System.out.print(Tablero.casillas.get(i).get(k));
            }
            System.out.println();
        }
    }
}

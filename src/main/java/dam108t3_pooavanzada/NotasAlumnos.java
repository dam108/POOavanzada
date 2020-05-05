
package dam108t3_pooavanzada;

import java.util.ArrayList;

public class NotasAlumnos {
    ArrayList <Float> notas;
    final float V_MAX;
    final float V_MIN;
    NivelEscuela n;
    char nivel;
    
    NotasAlumnos(float vMa, float vMi){
        notas = new ArrayList<>();
        this.V_MAX = vMa;
        this.V_MIN = vMi;
        n = new NivelEscuela();
    }
    
    public void AñadirNota(float nota){
        if (nota >= V_MIN && nota <= V_MAX) notas.add(nota);
        
        this.nivel = n.calcularNivel();
    }
    
    public char getNivel(){
        return nivel;
    }
    
    class NivelEscuela{
        float LimiteAprobado;

        NivelEscuela(){
            this.LimiteAprobado = (V_MAX + V_MIN)/2 ;
        }

        public char calcularNivel(){
            char A = 'A';
            char B = 'B';
            char C = 'C';
            int cont = 0;
            float porcentajeAprobados;
            float porcentajeSuspensos;
            for (Float x : notas) {
                if(x > this.LimiteAprobado) cont++;
            }
            
            porcentajeAprobados = (cont * 100)/notas.size();
            porcentajeSuspensos = notas.size() - porcentajeAprobados;
            
            if (porcentajeAprobados > 80) return A;
            else if ( porcentajeSuspensos > 50) return C;
            else return B;

        }
    }
}



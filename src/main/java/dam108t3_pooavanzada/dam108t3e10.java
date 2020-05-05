package dam108t3_pooavanzada;

public class dam108t3e10 {

    public static void main(String[] args) {
        NotasAlumnos nA = new NotasAlumnos(10, 0);
        
        nA.AñadirNota(5.9f);
        nA.AñadirNota(2.3f);
        nA.AñadirNota(7.8f);
        nA.AñadirNota(3.25f);
        nA.AñadirNota(9.1f);
        nA.AñadirNota(10.20f);
        
        System.out.println(nA.notas);
        
        System.out.println("Nivel: "+nA.getNivel());
        
        
    }
    
}

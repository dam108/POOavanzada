package dam108t3_pooavanzada;

import java.util.ArrayList;

public class ListaPequeña <T> {
    private final int tamañoMax;
    private ArrayList <T> valores;

   ListaPequeña(int tamaño){
       this.tamañoMax = tamaño;
       valores = new ArrayList<>();
       
   }

   public void añadi(T obj){
       if (valores.size() < this.tamañoMax) valores.add(obj);
       else valores.set((valores.size() - 1), obj);

   }

   public void clear(){
       valores.clear();
   }
   
   public ArrayList getValores(){return valores;}
}

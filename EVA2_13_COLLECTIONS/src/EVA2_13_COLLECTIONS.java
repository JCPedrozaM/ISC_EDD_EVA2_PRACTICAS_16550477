
import java.util.ArrayList;
import java.util.Iterator;

/*
    Practica de inttrodución a collections
 */

/**
 *
 * @author 16550477
 */
public class EVA2_13_COLLECTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Integer> alMiArrayList = new ArrayList();
        alMiArrayList.add(100);
        alMiArrayList.add(200);
        alMiArrayList.add(300);
        alMiArrayList.add(400);
        alMiArrayList.add(500);
        
        for (Integer integer : alMiArrayList) {
            System.out.print(integer + " - ");
        }
        alMiArrayList.add(2, 4); //Agrega en posición especifica
        System.out.println("");
        for (Integer integer : alMiArrayList) {
            System.out.print(integer + " - ");
        }
        //Recorrer un collection de iteradores
        System.out.println("\nIterator");
        Iterator itRecorreArreglo = alMiArrayList.iterator();
        while(itRecorreArreglo.hasNext()){//Si hay un nodo siguiente se sigue moviendo 
            System.out.print(itRecorreArreglo.next() +" - " );
        }
    }
    
}


import java.util.Collections;
import java.util.LinkedList;

/*
    Practica para metodo de ordenamiento sort
 */

/**
 *
 * @author 16550477
 */
public class EVA2_17_COLLECTION_SORT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList <String> llMiLista = new LinkedList();
        llMiLista.add("HOLA");
        llMiLista.add(" ");
        llMiLista.add("MUNDO");
        llMiLista.add(" ");
        llMiLista.add("CRUEL");
        llMiLista.add("!!!");
        for (String string : llMiLista) {
            System.out.print(string);
        }
        System.out.println("");
        Collections.sort(llMiLista); //Ordena (Espacios en blanco primero)
        
        for (String string : llMiLista) {
            System.out.print(string);
        }
    }
    
}

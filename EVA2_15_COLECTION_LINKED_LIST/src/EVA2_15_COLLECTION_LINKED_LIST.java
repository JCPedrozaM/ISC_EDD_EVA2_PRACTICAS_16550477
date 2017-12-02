
import java.util.LinkedList;

/*
    Practica para concer listas enlazadas de collections
 */

/**
 *
 * @author 16550477
 */
public class EVA2_15_COLLECTION_LINKED_LIST {

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
        llMiLista.add(" ");
        llMiLista.add("!!!");
        for (String string : llMiLista) {
            System.out.print(string);
        }
        llMiLista.remove(4); //Elimina la posición
        System.out.println("");
        System.out.println(llMiLista);
        llMiLista.add(4, "BELLO"); //Inserta en la posición asignada
        System.out.println(llMiLista);
    }
    
}

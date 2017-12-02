
package eva2_18_comparator;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author 16550477
 */
public class EVA2_18_COMPARATOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList <String> llMiLista = new LinkedList();
        llMiLista.add("HOLA");
        llMiLista.add(" ");
        llMiLista.add("MUNDO");
        llMiLista.add(" ");
        llMiLista.add("CRUEL!!");
        llMiLista.add(" ");
        llMiLista.add("COLLECTIONS");
        
        for (String llMiLista1 : llMiLista) {
            System.out.print(llMiLista1+ "  " );
        }
        System.out.println("");
        
        Collections.sort(llMiLista);
        
        for (String llMiLista1 : llMiLista) {
            System.out.print(llMiLista1+ "  " );
        }
        
    }
    
}

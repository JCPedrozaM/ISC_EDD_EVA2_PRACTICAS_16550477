
import java.util.Stack;

/*
    Practica para conocer la clase Stack de collections
 */

/**
 *
 * @author 16550477
 */
public class EVA2_16_COLLECTION_STACK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack <Double> stMiPila = new Stack();
        stMiPila.push(10.0);
        stMiPila.push(20.0);
        stMiPila.push(30.0);
        stMiPila.push(40.0);
        stMiPila.push(50.0);
        System.out.println(stMiPila.pop());//Lee y elimina
        System.out.println(stMiPila.pop());
        System.out.println(stMiPila.peek());//Lee y conserva
        System.out.println(stMiPila.pop());
        System.out.println(stMiPila.peek());
    }
    
}

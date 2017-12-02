/* 
 Practica para ver el funcionamiento del Stack (desbordamiento)
 */
package eva2_stack_overflow;

/**
 *
 * @author 16550477
 */
public class EVA2_1_STACK_OVERFLOW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        stackOverFlow();
    }
    
    public static void stackOverFlow(){
        System.out.println("Oups");
        stackOverFlow();
    }
    
}


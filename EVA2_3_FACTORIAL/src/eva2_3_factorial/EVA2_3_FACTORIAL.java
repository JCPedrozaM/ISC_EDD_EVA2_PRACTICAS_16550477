/*
    Factorial de un número de manera recursiva
 */
package eva2_3_factorial;

/**
 *
 * @author 16550477
 */
public class EVA2_3_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Factorial de 5 = " + factorial(5)); //Imprimir factorial
    }
    
    public static int factorial(int iVal){
        if(iVal>0){
            return iVal * factorial(iVal-1); //Mientras sea diferente de 0 se llama a si mismo
        }
        else{
            return 1; //Cuando es 0
        }
    }
    
}

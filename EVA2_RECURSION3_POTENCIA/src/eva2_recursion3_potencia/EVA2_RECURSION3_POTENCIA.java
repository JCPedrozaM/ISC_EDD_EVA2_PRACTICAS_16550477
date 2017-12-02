
package eva2_recursion3_potencia;

import java.util.Scanner;

/**
 *
 * @author 16550499
 */
public class EVA2_RECURSION3_POTENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingresa un número a elevar");
        Scanner dato = new Scanner(System.in);
        int iNum = dato.nextInt();
        System.out.println("Ingresa la potencia");
        int iPow = dato.nextInt();
        System.out.println(iNum + "^" + iPow + " = " + potencia(iNum,iPow));
    }
    
    public static int potencia(int iNum, int iPow){
        if(iPow==0){ 
            return 1; 
        }
        else{
            return iNum * potencia(iNum,iPow-1); 
        }
    }
}

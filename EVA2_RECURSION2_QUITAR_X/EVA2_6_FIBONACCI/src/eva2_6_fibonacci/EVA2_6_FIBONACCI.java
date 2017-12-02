/*
 Practica para determinación de serie fibonacci de manera recursiva
 */
package eva2_6_fibonacci;

import java.util.Scanner;

/**
 *
 * @author 16550477
 */
public class EVA2_6_FIBONACCI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingresa la posición");
        Scanner dato = new Scanner(System.in);
        int iPos = dato.nextInt(); //Posición máxima
        for (int i = 0; i <= iPos; i++) {
            System.out.print(fibo(i) + " ");
        }
    }
    
    public static int fibo(int iPos){
        if(iPos == 0){
            return 0; //Posición 0 = 0
            
        }
        else{
            if(iPos == 1 ){
                return 1; //Posición 1 = 1
            }
            else{
                return fibo(iPos-1) + fibo(iPos-2); //Posición n = suma de las 2 posiciones anteriores
            }
        }
    }
}

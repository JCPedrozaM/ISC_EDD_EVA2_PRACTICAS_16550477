/*
    Practica de recursividad, suma digitos de un número
 */
package eva2_recursion1_suma_digitos;

import java.util.Scanner;

/**
 *
 * @author 16550477
 */
public class EVA2_RECURSION1_SUMA_DIGITOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingresa el número");
        Scanner dato = new Scanner(System.in);
        int iNum = dato.nextInt();
        System.out.println("Suma de los digitos de " + iNum + " = " + sumaDigitos(iNum));
    }
    
    public static int sumaDigitos(int iNum){
       if(iNum<10){ //Verifica si es solo un digito
           return iNum;
       }
       else{
           return iNum%10 + sumaDigitos(iNum/10); //Regresa el residuo (último dígito)- se vuelve a llamar con un dígito menos
       }
    }
}

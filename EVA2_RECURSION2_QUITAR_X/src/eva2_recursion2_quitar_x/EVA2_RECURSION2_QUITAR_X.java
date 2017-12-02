/*
    Practica de recursividad, eliminar X de una cadena
 */
package eva2_recursion2_quitar_x;

import java.util.Scanner;

/**
 *
 * @author 16550477
 */
public class EVA2_RECURSION2_QUITAR_X {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingresa texto");
        System.out.println(quitarX(dato.next()));
    }
 public static String quitarX (String sCadena){
    if (sCadena.charAt(0) == 'x'){ //Verifica si el primer caracter es X
        if(sCadena.length()-1>0){ //Verifica si hay más de un caracter
            return quitarX(sCadena.substring(1)); //se vuelve a llamar pero sin el primer caracter (la x se pierde)
        }
        
    }
    else{
        if(sCadena.length()-1 > 0){ //Verifica si hay más de un caracter
            return sCadena.charAt(0) + quitarX(sCadena.substring(1)); //Regresa el primer caracter y se llama a la función a partir del segundo caracter
        }
        else{
            return sCadena; //Solo queda un caracter y no es X
        }
    }
        return "";
 }   
}

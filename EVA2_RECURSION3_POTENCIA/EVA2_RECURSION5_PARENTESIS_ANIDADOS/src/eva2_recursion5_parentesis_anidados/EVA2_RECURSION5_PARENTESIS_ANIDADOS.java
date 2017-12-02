/*
 Parentesis anidados. Regresar TRUE si tiene 0 o más parentesis anidados
 */
package eva2_recursion5_parentesis_anidados;

import java.util.Scanner;

/**
 *
 * @author 16550477
 */
public class EVA2_RECURSION5_PARENTESIS_ANIDADOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingresa tu cadena con parentesis anidados");
        Scanner dato = new Scanner (System.in);
        System.out.println("Parentesis anidados: " + parentesisAnidados(dato.next()));
    }
    
    public static boolean parentesisAnidados(String sCadena){
        if(sCadena.length()>0){//Verifica si la cedena tiene caracteres
            if(sCadena.charAt(0) == '(' && sCadena.charAt(sCadena.length()-1) == ')'){ //Compara los extremos
                return parentesisAnidados(sCadena.substring(1, sCadena.length()-1));//Se llama con la cadena sin extremos
            }else{
                return false; //No estan anidados
            }
        }
        return true; //Terminó de comparar
    }
}

/*
 Practica para la creación de texto recursivo
 */
package eva2_4_recursivo_texto;

/**
 *
 * @author 16550477
 */
public class EVA2_4_RECURSIVO_TEXTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*for (int i = 1; i <= 10; i++) {
            System.out.println(cadenaRecursiva(i));
        }
        for (int i = 9; i >= 1; i--) {
            System.out.println(cadenaRecursiva(i));
        }*/
        int i=1;
        while(i<=10){
            System.out.println(cadenaRecursiva(i));
            i++;
        }
        i=9;
        while(i>=1){
            System.out.println(cadenaRecursiva(i));
            i--;
        }
    }
    
    public static String cadenaRecursiva(int iNum){
        if(iNum > 1){
            return "*" + cadenaRecursiva(iNum-1); //Regresa un asterisco y vuelve a llamarse con el valor disminuído
        }
        else{
            return "*"; //Cuando es 1
        }
    }
}

/* PRACTICA SOBRE LOS PRINCIPIOS DE RECURSIVIDAD
    1. UN METODO SE LLAMA A SI MISMO
    2. DEBE DETENERSE EN ALGUN PUNTO
 */
package eva2_2_for_falso;

/**
 *
 * @author 16550477
 */
public class EVA2_2_FOR_FALSO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Imprimir los números del 5 al 1
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
        falsoFor(5);
        System.out.println("");
        falsoForUp(1,5);
    }
    
    public static void falsoFor(int iVal){
        System.out.print(iVal + "-"); //Accion
        if(iVal>1) falsoFor(iVal-1); //Condicion para terminar la recursión - llamada recursiva
    }
    
    public static void falsoForUp(int iIni, int iFin){
        System.out.print(iIni + "-");
        if(iIni<iFin) falsoForUp(iIni + 1, iFin);
    }
}

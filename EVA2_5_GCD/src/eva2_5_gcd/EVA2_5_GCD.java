/*
 Practica para determinar Gran Comun Denominador de manera recursiva
 */
package eva2_5_gcd;

/**
 *
 * @author 16550477
 */
public class EVA2_5_GCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(gcd(180,48));
    }
    
    public static int gcd(int iDivn, int iDiv){
        if(iDiv==0){
            return iDivn; // si ya no se puede dividir regresa el dividendo
        }
        else{
            return gcd(iDiv,iDivn%iDiv); //Se llama a si mismo con el divisor como divendo y el residuo de como divisor
        }
    }
}

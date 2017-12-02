/*
 Practica para ver el manejo de nodos (enlaces)
 */
package eva2_8_nodos;

/**
 *
 * @author 16550477
 */
public class EVA2_8_NODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nodo nObj1 = new Nodo();
        nObj1.iVal = 100;
        
        Nodo nObj2 = new Nodo();
        nObj2.iVal = 200;
        
        Nodo nObj3 = new Nodo();
        nObj3.iVal = 300;
        
        //Vincular
        //obj1 -> obj2 -> obj3
        nObj1.nSig = nObj2;
        nObj2.nSig = nObj3;
        
        Nodo nMover = nObj1;
        while(nMover != null){ //para imprimir crear nodo temporal. Se moverá mientras haya un nodo siguiente
            System.out.println(nMover.iVal);
            nMover = nMover.nSig;
        }
    }
    
    
}

class Nodo{
    public int iVal; //Valor del nodo
    public Nodo nSig; //Almacena la referencia a otro nodo (debe ser tipo nodo)
    
    public Nodo(){
        nSig = null;
    }
}
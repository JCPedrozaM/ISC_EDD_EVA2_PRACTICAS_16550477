
package eva2_11_queue;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 16550499
 */
public class EVA2_11_QUEUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue qFilaSuper = new Queue();
        System.out.println("Cola vacía: " + qFilaSuper.vacio());
        try {
            System.out.println(qFilaSuper.leerPrimerNodo());
        } catch (Exception ex) {
            Logger.getLogger(EVA2_11_QUEUE.class.getName()).log(Level.SEVERE, null, ex);
        }
        qFilaSuper.agregarNodo(new Nodo(100));
        qFilaSuper.agregarNodo(new Nodo(200));
        qFilaSuper.agregarNodo(new Nodo(300));
        qFilaSuper.agregarNodo(new Nodo(400));
        qFilaSuper.imprimir();
        System.out.println("");
        System.out.println("Cola vacía: " + qFilaSuper.vacio());
        try {
            System.out.println(qFilaSuper.leerPrimerNodo()); 
        } catch (Exception ex) {
            Logger.getLogger(EVA2_11_QUEUE.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.println(qFilaSuper.removerPrimerNodo()); 
        } catch (Exception ex) {
            Logger.getLogger(EVA2_11_QUEUE.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.println(qFilaSuper.removerPrimerNodo());
        } catch (Exception ex) {
            Logger.getLogger(EVA2_11_QUEUE.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.println(qFilaSuper.removerPrimerNodo());
        } catch (Exception ex) {
            Logger.getLogger(EVA2_11_QUEUE.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.println(qFilaSuper.removerPrimerNodo());
        } catch (Exception ex) {
            Logger.getLogger(EVA2_11_QUEUE.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.println(qFilaSuper.leerPrimerNodo());
        } catch (Exception ex) {
            Logger.getLogger(EVA2_11_QUEUE.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Llenamos cola");
        qFilaSuper.agregarNodo(new Nodo(100));
        qFilaSuper.agregarNodo(new Nodo(200));
        qFilaSuper.agregarNodo(new Nodo(300));
        qFilaSuper.agregarNodo(new Nodo(400));
        qFilaSuper.imprimir();
        System.out.println("");
        System.out.println("número de elementos: " + qFilaSuper.contarElementos());
        System.out.println("Cola vacía: " + qFilaSuper.vacio());
        System.out.println("Vaciamos cola");
        qFilaSuper.vaciar();
        System.out.println("número de elementos: " + qFilaSuper.contarElementos());
        System.out.println("Cola vacía: " + qFilaSuper.vacio());
    }

}

class Nodo {

    private int iVal;
    private Nodo nPrev;
    private Nodo nSig;

    public Nodo() {
        iVal = 0;
        nPrev = null;
        nSig = null;
    }

    public Nodo(int iVal) {
        this.iVal = iVal;
        nPrev = null;
        nSig = null;
    }

    public int getiVal() {
        return iVal;
    }

    public void setiVal(int iVal) {
        this.iVal = iVal;
    }

    public Nodo getnPrev() {
        return nPrev;
    }

    public void setnPrev(Nodo nPrev) {
        this.nPrev = nPrev;
    }

    public Nodo getnSig() {
        return nSig;
    }

    public void setnSig(Nodo nSig) {
        this.nSig = nSig;
    }

}

class Queue {

    Nodo nIni;
    Nodo nFin;

    public Queue() {
        nIni = null;
        nFin = null;
    }

    public Queue(Nodo nNodo) {
        nIni = nNodo;
        nFin = nNodo;
    }

    public void agregarNodo(Nodo nNodo) {
        if (nIni == null) {
            nIni = nNodo;
            nFin = nNodo;
        } else {
            nFin.setnSig(nNodo);
            nNodo.setnPrev(nFin);
            nFin = nNodo;
        }
    }

    public int leerPrimerNodo() throws Exception {
        int iVal = 0;
        if (nIni == null) {
            
            throw new Exception("No hay valores en la fila");
        } else {
            iVal = nIni.getiVal();
        }
        return iVal;
    }

    public int removerPrimerNodo() throws Exception {
        int iVal = 0;
        if (nIni == null) {
            
            throw new Exception ("No hay valores en fila");
        } else {
            iVal = nIni.getiVal();
            
            if (nIni.getnSig() == null) {
                nIni = null;
                nFin = null;
            } else {
                
                nIni = nIni.getnSig();
                nIni.setnPrev(null);
            }
        }
        return iVal;
    }
    
    public void imprimir(){
        if (nIni == null) {
            System.out.println("No hay elementos en la lista");
        } else {
            Nodo nTemp = nIni;
            while (nTemp != null) {
                System.out.print(nTemp.getiVal() + "-");
                nTemp = nTemp.getnSig();
            }
        }
    }
    
    public boolean vacio(){
        if(nIni == null)return true;
        else return false;
    }
    
    public void vaciar(){
        nIni = null;
    }
    
    public int contarElementos() {
        Nodo nTemp = nIni;
        if (nIni == null) {
            return 0;
        } else {
            int iCont = 0;
            while (nTemp != null) {
                iCont++;
                nTemp = nTemp.getnSig();
            }
            return iCont;
        }
    }
}

/*
    Practica conocer stack y defiir metodos
*/

package eva2_12_stack;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 16550477
 */
public class EVA2_12_STACK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack sStack = new Stack();
        try {
            System.out.println(sStack.leerUltimoNodo());
        } catch (Exception ex) {
            Logger.getLogger(EVA2_12_STACK.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("");
        sStack.push(new Nodo(1));
        sStack.push(new Nodo(2));
        try {
            sStack.push(new Nodo(3));
            sStack.push(new Nodo(4));
            sStack.push(new Nodo(5));
            System.out.println(sStack.leerUltimoNodo());
        } catch (Exception ex) {
            Logger.getLogger(EVA2_12_STACK.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.println(sStack.pop());
        } catch (Exception ex) {
            Logger.getLogger(EVA2_12_STACK.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.println(sStack.pop());
        } catch (Exception ex) {
            Logger.getLogger(EVA2_12_STACK.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.println(sStack.pop());
            System.out.println(sStack.pop());
            System.out.println(sStack.pop());
            System.out.println(sStack.leerUltimoNodo());
        } catch (Exception ex) {
            Logger.getLogger(EVA2_12_STACK.class.getName()).log(Level.SEVERE, null, ex);
        }

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

    public Nodo(int iNum) {
        iVal = iNum;
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

class Stack {

    Nodo nIni, nFin;

    public Stack() {
        nIni = null;
        nFin = null;
    }

    public Stack(Nodo nNodo) {
        nIni = nNodo;
        nFin = nNodo;
    }

    public void push(Nodo nNodo) {//Agregar al final de la pila
        if (nIni == null) {//Si la pila está vacía se agrega al principio
            nIni = nNodo;
            nFin = nNodo;
        } else {
            nFin.setnSig(nNodo);
            nNodo.setnPrev(nFin);
            nFin = nNodo;
        }
    }

    public int leerUltimoNodo() throws Exception { //Peek
        int iVal = 0;
        if (nIni == null) {
            //lanzar una execpción
            throw new Exception("No hay valores en la fila");
        } else {
            iVal = nFin.getiVal();
        }
        return iVal;
    }

    public int pop() throws Exception {
        int iVal = 0;
        if (nIni == null) {
            //lanzar una execpción
            throw new Exception("No hay valores en la fila");
        } else {
            iVal = nFin.getiVal();
            //Eliminar último nodo
            //Verificar cantidad de nodos
            if (nIni.getnSig() == null) {// Si hay un solo nodo nIni = null, nFin =null
                nIni = null;
                nFin = null;
            } else {//Si hay más de un nodo
                nFin = nFin.getnPrev();
                nFin.setnSig(null);
            }

        }
        return iVal;
    }
}

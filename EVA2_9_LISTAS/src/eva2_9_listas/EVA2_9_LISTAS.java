/*
    Practica creación de listas sencillas y sus metodos
 */
package eva2_9_listas;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 16550477
 */
public class EVA2_9_LISTAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista miLista = new Lista();
        miLista.imprimirNodos();
        System.out.println("");
        /*miLista.agregarNodo(new Nodo(15));
         miLista.imprimirNodos();
         System.out.println("");
         miLista.agregarNodo(new Nodo(24));
         miLista.imprimirNodos();
         System.out.println("");
         miLista.agregarNodo(new Nodo(11222));
         miLista.imprimirNodos();
         System.out.println("");
         miLista.agregarNodo(new Nodo(18));
         miLista.imprimirNodos();
         System.out.println("");
         miLista.vaciarLista();
         miLista.imprimirNodos();*/
        for (int i = 0; i < 10; i++) {
            miLista.agregarNodoMejorado(new Nodo((int) (Math.random() * 1000) + 1));
        }
        miLista.imprimirNodos();
        System.out.println("");
        System.out.println("Nodos en la lista: " + miLista.contarElementos());
        try {
            System.out.println("El elemento de la posición 5 es: " + miLista.valorEn(5));
        } catch (Exception ex) {
            Logger.getLogger(EVA2_9_LISTAS.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            miLista.insertarEn(0, new Nodo(9999));
        } catch (Exception ex) {
            Logger.getLogger(EVA2_9_LISTAS.class.getName()).log(Level.SEVERE, null, ex);
        }
        miLista.imprimirNodos();
        System.out.println("");
        try {
            miLista.insertarEn(5, new Nodo(9999));
        } catch (Exception ex) {
            Logger.getLogger(EVA2_9_LISTAS.class.getName()).log(Level.SEVERE, null, ex);
        }
        miLista.imprimirNodos();
        System.out.println("");
        try {
            miLista.borrar(0);
        } catch (Exception ex) {
            Logger.getLogger(EVA2_9_LISTAS.class.getName()).log(Level.SEVERE, null, ex);
        }
        miLista.imprimirNodos();
        System.out.println("");
        try {
            miLista.borrar(6);
        } catch (Exception ex) {
            Logger.getLogger(EVA2_9_LISTAS.class.getName()).log(Level.SEVERE, null, ex);
        }
        miLista.imprimirNodos();
        System.out.println("");
        System.out.println(miLista.vacio());
        System.out.println("Vaciamos lista");
        miLista.vaciarLista();
        miLista.imprimirNodos();
        System.out.println(miLista.vacio());
    }

}

class Nodo {

    private int iValor;
    private Nodo nSig;

    public Nodo() {
        iValor = 0;
        nSig = null;
    }

    public Nodo(int iValor) {
        this.iValor = iValor;
        nSig = null;
    }

    public Nodo(int iValor, Nodo nSig) {
        this.iValor = iValor;
        this.nSig = nSig;
    }

    public int getiValor() {
        return iValor;
    }

    public void setiValor(int iValor) {
        this.iValor = iValor;
    }

    public Nodo getnSig() {
        return nSig;
    }

    public void setnSig(Nodo nSig) {
        this.nSig = nSig;
    }

}

class Lista {

    private Nodo nIni;
    private Nodo nFin;

    public Lista() {
        nIni = null;
        nFin = null;
    }

    public Lista(Nodo nIni) {
        this.nIni = nIni;
        nFin = nIni;
    }

    public void agregarNodo(Nodo nNodo) { //NO USAR
        //agregar nodo los coloca al final
        //Movernos al final de la lista
        Nodo nTemp = nIni;
        if (nIni == null) {
            nIni = nNodo; //Cuando la lista está vacía
        } else {
            while (nTemp.getnSig() != null) {
                nTemp = nTemp.getnSig();
            }
            nTemp.setnSig(nNodo);
        }
    }

    public void agregarNodoMejorado(Nodo nNodo) {
        if (nIni == null) {
            nIni = nNodo; //Cuando la lista está vacía
            nFin = nNodo;
        } else {
            nFin.setnSig(nNodo);
            nFin = nNodo;
        }
    }

    public void imprimirNodos() {
        //Movernos al final de la lista
        Nodo nTemp = nIni;
        if (nIni == null) {
            System.out.println("La lista está vacía");
        } else {
            while (nTemp != null) {
                System.out.print(nTemp.getiValor() + " - ");
                nTemp = nTemp.getnSig();
            }
        }
    }

    public void vaciarLista() { //Al menos en java, simplemente nIni se asigna nulo
        nIni = null;
        nFin = null;
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

    public int valorEn(int iPos) throws Exception {
        //Verificar que la posiciòn sea menor al tamaño del arreglo
        int iVal = 0;
        if (iPos < contarElementos() && iPos >= 0) {
            Nodo nTemp = nIni;
            for (int i = 0; i < iPos; i++) {
                nTemp = nTemp.getnSig();
            }
            iVal = nTemp.getiValor();
        } else {
            throw new Exception("La posición no es válida");
        }
        return iVal;
    }
    
    public void insertarEn(int iPos, Nodo nNodo) throws Exception{
        //Verificar iPos >= 0, iPos < tamaño de la lista
        if (iPos < contarElementos() && iPos >= 0) {
        if(iPos==0){//Insertar al inicio de la lista:
            nNodo.setnSig(nIni);
            nIni = nNodo;
        }
        else{ //Insertar en cualquier posición (Excepto al final)
            Nodo nTemp = nIni;
            for (int i = 0; i < iPos-1; i++) {
                nTemp = nTemp.getnSig();
            }
            nNodo.setnSig(nTemp.getnSig());
            nTemp.setnSig(nNodo);
        }
        }else{
            throw new Exception("La posición no es válida");
        }
    }
    
    public void borrar(int iPos) throws Exception{
        if (iPos < contarElementos() && iPos >= 0){
            if(iPos == 0){
                nIni = nIni.getnSig();
            }
            else{
                Nodo nTemp = nIni;
                for (int i = 0; i < iPos-1; i++) {
                    nTemp = nTemp.getnSig();
                }
                nTemp.setnSig(nTemp.getnSig().getnSig()); //Se desconecta el nodo a elminar y el garbage collector lo borra
            }
        }else{
            throw new Exception("La posición no es válida");
        }
    }
    
    public boolean vacio(){
        if (nIni == null) return true;
        else return false;
    }
    
    public void buscar(int iValor){
        Nodo nTemp = nIni;
        boolean ban=false;
        for (int i = 0; i < contarElementos(); i++) {
            if(nTemp.getiValor() == iValor){
                System.out.println("El valor se encuentra en la posición: " + i);
                ban=true;
                break;
            }
            nTemp = nTemp.getnSig();
        }
        if(ban==false) System.out.println("El valor no se encuentra en la listaS");
    }
}

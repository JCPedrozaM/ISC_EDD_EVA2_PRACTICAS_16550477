/*
    Practica listas doble enlace y metodos
 */
package eva2_10_listas_dob_enl;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 16550477
 */
public class EVA2_10_LISTAS_DOB_ENL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaDE ldeMiLista = new ListaDE();
        ldeMiLista.imprimirElementos();
        ldeMiLista.imprimirElementosInv();
        for (int i = 0; i < 10; i++) {
            ldeMiLista.agregarNodo(new Nodo((int)(Math.random() * 100) + 1));
        }
        ldeMiLista.imprimirElementos();
        System.out.println("");
        ldeMiLista.imprimirElementosInv();
        try {
            ldeMiLista.insertarEn(0, new Nodo(12));
        } catch (Exception ex) {
            Logger.getLogger(EVA2_10_LISTAS_DOB_ENL.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("");
        ldeMiLista.imprimirElementos();
        System.out.println("");
        try {
            ldeMiLista.insertarEn(5, new Nodo(4));
        } catch (Exception ex) {
            Logger.getLogger(EVA2_10_LISTAS_DOB_ENL.class.getName()).log(Level.SEVERE, null, ex);
        }
        ldeMiLista.imprimirElementos();
        try {
            ldeMiLista.borrar(0);
        } catch (Exception ex) {
            Logger.getLogger(EVA2_10_LISTAS_DOB_ENL.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("");
        ldeMiLista.imprimirElementos();
        System.out.println("");
        ldeMiLista.buscar(4);
        try {
            System.out.println(ldeMiLista.valorEn(4));
        } catch (Exception ex) {
            Logger.getLogger(EVA2_10_LISTAS_DOB_ENL.class.getName()).log(Level.SEVERE, null, ex);
        }
        ldeMiLista.vaciarLista();
        ldeMiLista.imprimirElementos();
        System.out.println(ldeMiLista.vacio());
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

class ListaDE {

    Nodo nIni;
    Nodo nFin;

    public ListaDE() {
        nIni = null;
        nFin = null;
    }

    public ListaDE(Nodo nNodo) {
        nIni = nNodo;
        nFin = nNodo;
    }

    public void agregarNodo(Nodo nNodo) {//Agregar nodo al final
        if (nIni == null) {
            nIni = nNodo;
            nFin = nNodo;
        } else {
            nFin.setnSig(nNodo);
            nNodo.setnPrev(nFin);
            nFin = nNodo;
        }
    }

    public void imprimirElementos() {
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

    public void imprimirElementosInv() {
        if (nIni == null) {
            System.out.println("No hay elementos en la lista");
        } else {
            Nodo nTemp = nFin;
            while (nTemp != null) {
                System.out.print(nTemp.getiVal() + "-");
                nTemp = nTemp.getnPrev();
            }
        }
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
    
    public void vaciarLista() { //Al menos en java, simplemente nIni se asigna nulo
        nIni = null;
        nFin = null;
    }
    
    public int valorEn(int iPos) throws Exception {
        //Verificar que la posiciòn sea menor al tamaño del arreglo
        int iVal = 0;
        if (iPos < contarElementos() && iPos >= 0) {
            Nodo nTemp = nIni;
            for (int i = 0; i < iPos; i++) {
                nTemp = nTemp.getnSig();
            }
            iVal = nTemp.getiVal();
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
            nIni.setnPrev(nNodo);
            nIni = nNodo;
        }
        else{ //Insertar en cualquier posición (Excepto al final)
            Nodo nTemp = nIni;
            for (int i = 0; i < iPos; i++) {
                nTemp = nTemp.getnSig();
            }
            nNodo.setnPrev(nTemp.getnPrev());
            nNodo.setnSig(nTemp);
            nTemp.getnPrev().setnSig(nNodo);
            nTemp.setnPrev(nNodo);
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
            if(nTemp.getiVal() == iValor){
                System.out.println("El valor se encuentra en la posición: " + i);
                ban=true;
                break;
            }
            nTemp = nTemp.getnSig();
        }
        if(ban==false) System.out.println("El valor no se encuentra en la lista");
    }
}

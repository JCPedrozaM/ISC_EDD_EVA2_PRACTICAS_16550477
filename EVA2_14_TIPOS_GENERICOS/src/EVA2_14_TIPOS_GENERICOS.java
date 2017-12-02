/*
    Pracitca para conocer el funcionamiento de datos tipo genericos
 */

/**
 *
 * @author 16550477
 */
public class EVA2_14_TIPOS_GENERICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nodo <Double> nMiNodo = new Nodo(4.18); //T se define com Double
        nMiNodo.setValor(24.04);
        System.out.println(nMiNodo.getValor());
    }
    
}
class Nodo <T>{ //T puede definirse como cualquier tipo de valor
    private T valor;
    private Nodo nSig;
    private Nodo nPrev;
    Nodo(T nuevoValor){
        nSig = null;
        nPrev = null;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Nodo getnSig() {
        return nSig;
    }

    public void setnSig(Nodo nSig) {
        this.nSig = nSig;
    }

    public Nodo getnPrev() {
        return nPrev;
    }

    public void setnPrev(Nodo nPrev) {
        this.nPrev = nPrev;
    }
    
}
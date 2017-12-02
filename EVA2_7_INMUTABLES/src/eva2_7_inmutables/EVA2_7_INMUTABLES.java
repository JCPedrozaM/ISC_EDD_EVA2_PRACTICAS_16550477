/*
 Practica para ver la inmutabilidad de los arreglos
 */
package eva2_7_inmutables;

/**
 *
 * @author 16550477
 */
public class EVA2_7_INMUTABLES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] aiDatos = new int[3];
        aiDatos[0] = 100;
        aiDatos[1] = 300;
        aiDatos[2] = 400;
        int[] aiBackUp = new int[3]; //Crear arreglo para copia(mismo tamaño)
        int i=0;
        for (int aiDato : aiDatos) { //Recorre el arreglo
            System.out.println(aiDato);
            aiBackUp[i] = aiDato; //Realiza la copia de los datos
            i++;
        }
        
        
        aiDatos = new int[4]; //Redimensionamos el arreglo (pierde sus valores)
        for (int j = 0; j < aiBackUp.length; j++) {
            aiDatos[j] = aiBackUp[j]; //Recuperamos los valores a través de la copia
        }
        for (int aiDato : aiDatos) {
            System.out.println(aiDato); //Imprimir
        }
    }
    
}

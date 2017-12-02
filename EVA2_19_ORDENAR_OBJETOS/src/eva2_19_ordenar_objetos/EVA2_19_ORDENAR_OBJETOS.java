/*
    Practica para crear metodos de ordenamiento con Comparator
 */
package eva2_19_ordenar_objetos;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author 16550477
 */
public class EVA2_19_ORDENAR_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Persona> llMiLista = new LinkedList();
        llMiLista.add(new Persona("José", "Pedroza", 19, true, 10000.00));
        llMiLista.add(new Persona("Erick", "Zuany", 20, false, 40000.00));
        llMiLista.add(new Persona("Iram", "Navarrete", 23, true, 50000.00));
        llMiLista.add(new Persona("Daniela", "Martinez", 24, false, 4000.00));
        llMiLista.add(new Persona("Rubén", "Hernandez", 30, true, 30000.00));
        for (Persona llMiLista1 : llMiLista) {
            System.out.println("Nombre: " + llMiLista1.getsNombre() + "\n"
                    + "Apellido: " + llMiLista1.getsApellido() + "\n"
                    + "Edad: " + llMiLista1.getiEdad() + "\n"
                    + "Sexo: " + llMiLista1.isbSexo() + "\n"
                    + "Salario: " + llMiLista1.getdSalario() + "\n");
        }
        Comparator cmCriterioOrden = new Comparator() {//Clase anonima

            @Override
            public int compare(Object o1, Object o2) {
                Persona p1 = (Persona) o1;
                Persona p2 = (Persona) o2;
                String sApe1, sApe2;
                sApe1 = p1.getsApellido();
                sApe2 = p2.getsApellido();
                char c1,c2;
                c1 = sApe1.charAt(0); //Arreglo
                c2 = sApe2.charAt(0);
                return c1-c2;
            }

        };
        Collections.sort(llMiLista,cmCriterioOrden);
        System.out.println("ORDENADA" + "\n");
        for (Persona llMiLista1 : llMiLista) {
            System.out.println("Nombre: " + llMiLista1.getsNombre() + "\n"
                    + "Apellido: " + llMiLista1.getsApellido() + "\n"
                    + "Edad: " + llMiLista1.getiEdad() + "\n"
                    + "Sexo: " + llMiLista1.isbSexo() + "\n"
                    + "Salario: " + llMiLista1.getdSalario() + "\n");
        }
        
        Comparator cmCriterioEdad = new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                Persona p1 = (Persona) o1;
                Persona p2 = (Persona) o2;
                int iEdad1, iEdad2;
                iEdad1 = p1.getiEdad();
                iEdad2 = p2.getiEdad();
                return iEdad1 - iEdad2;
            }
            
        };
        
        Collections.sort(llMiLista,cmCriterioEdad);
        System.out.println("ORDENADA POR EDAD" + "\n");
        for (Persona llMiLista1 : llMiLista) {
            System.out.println("Nombre: " + llMiLista1.getsNombre() + "\n"
                    + "Apellido: " + llMiLista1.getsApellido() + "\n"
                    + "Edad: " + llMiLista1.getiEdad() + "\n"
                    + "Sexo: " + llMiLista1.isbSexo() + "\n"
                    + "Salario: " + llMiLista1.getdSalario() + "\n");
        }
        
        Comparator cmCriterioSalario = new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                Persona p1 = (Persona) o1;
                Persona p2 = (Persona) o2;
                double d1, d2;
                d1 = p1.getdSalario();
                d2 = p2.getdSalario();
                return (int)(d1-d2);
            }
            
        };
        
        Collections.sort(llMiLista,cmCriterioSalario);
        System.out.println("ORDENADA POR SALARIO" + "\n");
        for (Persona llMiLista1 : llMiLista) {
            System.out.println("Nombre: " + llMiLista1.getsNombre() + "\n"
                    + "Apellido: " + llMiLista1.getsApellido() + "\n"
                    + "Edad: " + llMiLista1.getiEdad() + "\n"
                    + "Sexo: " + llMiLista1.isbSexo() + "\n"
                    + "Salario: " + llMiLista1.getdSalario() + "\n");
        }
        
        Comparator cmCriterioSexo = new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                Persona p1 = (Persona) o1;
                Persona p2 = (Persona) o2;
                int b1,b2;
                if(p1.isbSexo()==true)b1=1; //True = 1  False = 0
                else b1=0;
                if(p2.isbSexo()==true)b2=1;
                else b2=0;
                return b1-b2; //False primero
            }
            
        };
        Collections.sort(llMiLista,cmCriterioSexo);
        System.out.println("ORDENADA POR SEXO" + "\n");
        for (Persona llMiLista1 : llMiLista) {
            System.out.println("Nombre: " + llMiLista1.getsNombre() + "\n"
                    + "Apellido: " + llMiLista1.getsApellido() + "\n"
                    + "Edad: " + llMiLista1.getiEdad() + "\n"
                    + "Sexo: " + llMiLista1.isbSexo() + "\n"
                    + "Salario: " + llMiLista1.getdSalario() + "\n");
        }
    }

}

class Persona {

    private String sNombre;
    private String sApellido;
    private int iEdad;
    private boolean bSexo;
    private double dSalario;

    public Persona(String sNombre, String sApellido, int iEdad, boolean bSexo, double dSalario) {
        this.sNombre = sNombre;
        this.sApellido = sApellido;
        this.iEdad = iEdad;
        this.bSexo = bSexo;
        this.dSalario = dSalario;
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getsApellido() {
        return sApellido;
    }

    public void setsApellido(String sApellido) {
        this.sApellido = sApellido;
    }

    public int getiEdad() {
        return iEdad;
    }

    public void setiEdad(int iEdad) {
        this.iEdad = iEdad;
    }

    public boolean isbSexo() {
        return bSexo;
    }

    public void setbSexo(boolean bSexo) {
        this.bSexo = bSexo;
    }

    public double getdSalario() {
        return dSalario;
    }

    public void setdSalario(double dSalario) {
        this.dSalario = dSalario;
    }

}

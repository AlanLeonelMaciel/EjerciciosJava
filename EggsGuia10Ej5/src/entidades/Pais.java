/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package entidades;

import java.util.Objects;

public class Pais implements Comparable<Pais>{
    
    private String nombrePais;
    private int habitantes;

    public Pais(String nombrePais, int habitantes) {
        this.nombrePais = nombrePais;
        this.habitantes = habitantes;
    }

    public Pais() {
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

 
    @Override
    public String toString() {
        return "Pais{" + "nombrePais=" + nombrePais + ", habitantes=" + habitantes + '}';
    }

    @Override
    public int compareTo(Pais t) {
        return this.nombrePais.compareTo(t.getNombrePais()); //To change body of generated methods, choose Tools | Templates.
    }

}//Fin clase pais

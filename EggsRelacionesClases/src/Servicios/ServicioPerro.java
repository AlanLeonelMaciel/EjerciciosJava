/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package Servicios;

import entidades.Perro;
import java.util.Scanner;

/**
 *
 * @author alanl
 */
public class ServicioPerro {
    Scanner leer=new Scanner(System.in);
    
    public void CrearPerro( Perro perro) {
        System.out.println("Ingrese el nombre del perro: ");
        perro.setNombreString(leer.next());
        System.out.println("Ingrese la raza del perro: ");
        perro.setRazaString(leer.next());
        System.out.println("Ingrese la edad del perro: ");
        perro.setEdad(leer.nextInt());
        System.out.println("Ingrese el tamaño del perro: ");
        perro.setTamanio(leer.nextInt());
    }
    
}

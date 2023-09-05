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
import entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author alanl
 */
public class ServicioPersona {
    Scanner leer = new Scanner(System.in);
    public void CrearPersona(Persona persona) {
        
        System.out.println("Ingrese nombre de la persona: ");
        persona.setNombre(leer.next());
        System.out.println("Ingrese el apellido de la persona: ");
        persona.setApellidoString(leer.next());
        System.out.println("Ingrese el documento de la persona: ");   
        persona.setDocumento(leer.nextInt());
        System.out.println("Ingrese la edad de la persona: ");
        persona.setEdad(leer.nextInt());
    }
    public void AsignarPerro(Persona persona, Perro perro){
        persona.setPerro(perro);
    }
}

/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package eggsrelacionesclases;

import Servicios.ServicioPerro;
import Servicios.ServicioPersona;
import entidades.Perro;
import entidades.Persona;

/**
 *
 * @author alanl
 */
public class EggsRelacionesClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona1= new Persona();
        Persona persona2= new Persona();
        Perro perro1 = new Perro();
        Perro perro2= new Perro();
        ServicioPersona personaServicio = new ServicioPersona();
        ServicioPerro perroServicio = new ServicioPerro();
        
        personaServicio.CrearPersona(persona1);
        personaServicio.CrearPersona(persona2);
        
        perroServicio.CrearPerro(perro1);
        perroServicio.CrearPerro(perro2);
        
        personaServicio.AsignarPerro(persona1, perro1);
        personaServicio.AsignarPerro(persona2, perro2);
        
        System.out.println(persona1);
        System.out.println("");
        System.out.println(persona2);
        
    }
    
}

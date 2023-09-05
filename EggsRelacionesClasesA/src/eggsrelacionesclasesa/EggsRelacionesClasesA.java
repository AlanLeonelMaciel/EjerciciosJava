/*
EJERCICIO PERSONA
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package eggsrelacionesclasesa;

import entidad.Persona;
import servicios.PersonaServicio;

/**
 *
 * @author alanl
 */
public class EggsRelacionesClasesA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona1=new Persona();
        PersonaServicio Ps1= new PersonaServicio();
        Ps1.CrearPersona(persona1);
        System.out.println(persona1);
       
        
    }
    
}

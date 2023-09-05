/*
Crea un método void que reciba un objeto tipo persona como parámetro y
utilice el get para mostrar sus atributos. Llama ese método desde el main.
 */
package personaapp;

import entidad.Persona;
import servicios.ServicioPersona;

/**
 *
 * @author alanl
 */
public class PersonaApp {

   
    public static void main(String[] args) {
        ServicioPersona sp= new ServicioPersona();
        Persona p=sp.crearPersona();
        sp.mostrarPersona(p);
        
        
        
        
    }
    
}

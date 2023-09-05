/*
EJERCICIO PERSONA
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package entidad;

/**
 *
 * @author alanl
 */
public class Persona {
    private String nombre;
    private String apellido;
    private Dni documentoDni;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Dni documentoDni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documentoDni = documentoDni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Dni getDocumentoDni() {
        return documentoDni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDocumentoDni(Dni documentoDni) {
        this.documentoDni = documentoDni;
    }
    
    @Override
 public String toString(){
     
    return "Nombre: " + nombre + ", Apellido: " + apellido + ", DNI: " + documentoDni.toString();
     
 } 

   
}

/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package entidades;



/**
 *
 * @author alanl
 */
public class Persona {
    private String nombre,apellidoString;
    private int edad,documento;
    Perro perro; 
    

    public Persona() {
      
    }
    
    
    public Persona(String nombre, String apellidoString, int edad, int documento, Perro perro) {
        this.nombre = nombre;
        this.apellidoString = apellidoString;
        this.edad = edad;
        this.documento = documento;
        this.perro = perro;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoString() {
        return apellidoString;
    }

    public void setApellidoString(String apellidoString) {
        this.apellidoString = apellidoString;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidoString=" + apellidoString + ", edad=" + edad + ", documento=" + documento + ", perro=" + perro + '}';
    }
    
}

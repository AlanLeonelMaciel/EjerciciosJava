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
public class Perro {
    private String nombreString,razaString;
    private int edad,tamanio;

    public Perro() {
    }
    
    
    public Perro(String nombreString, String razaString, int edad, int tamanio) {
        this.nombreString = nombreString;
        this.razaString = razaString;
        this.edad = edad;
        this.tamanio = tamanio;
    }
    
    
    public String getNombreString() {
        return nombreString;
    }

    public void setNombreString(String nombreString) {
        this.nombreString = nombreString;
    }

    public String getRazaString() {
        return razaString;
    }

    public void setRazaString(String razaString) {
        this.razaString = razaString;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombreString=" + nombreString + ", razaString=" + razaString + ", edad=" + edad + ", tamanio=" + tamanio + '}';
    }
    
    
}

/*

 */
package entidades;

public class Alumno {

    private String nombre;
    private int nota;

    public Alumno() {
    }

    public String getNombre() {
        return nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno: " + nombre + ", Nota: " + nota;
    }

}

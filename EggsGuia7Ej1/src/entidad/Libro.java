/**
 *
 * Crear una clase llamada Libro que contenga los siguientes atributos:
 * ISBN, Título, Autor, Número de páginas,
 * y un constructor con todos los atributos pasados por parámetro
 * y un constructor vacío.
 * Crear un método para cargar un libro pidiendo
 * los datos al usuario y luego informar mediante otro método
 * el número de ISBN, el título, el autor del libro y el número de páginas.

 */
package entidad;

import java.util.Scanner;

/**
 *
 * 
 */
public class Libro {
    Scanner leer= new Scanner(System.in);
    int isbn;
    String tituloString,autorString;
    int numeroPaginas;

    public Libro(int isbn, String tituloString, String autorString, int numeroPaginas) {
        this.isbn = isbn;
        this.tituloString = tituloString;
        this.autorString = autorString;
        this.numeroPaginas = numeroPaginas;
    }

    public Libro() {
    }
    
    public void CargarLibro () {
        System.out.println("Por favor ingrese el ISBN");
        isbn= leer.nextInt();
        
    }
}

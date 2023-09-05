/*
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.

Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package eggsguia10ej3;

import servicio.ServAlumno;

/**
 *
 * @author alanl
 */
public class EggsGuia10Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServAlumno s1= new ServAlumno();
        s1.fabricarAlumnosEnLista();
        s1.mostrarListaAlumnos();
        System.out.println("");
        if (s1.notaFinal()!=-1) {
            System.out.println("la nota final es: "+s1.notaFinal());
        }
        else{
            System.out.println("No se encontro al alumno..");
        }
    }
    
}

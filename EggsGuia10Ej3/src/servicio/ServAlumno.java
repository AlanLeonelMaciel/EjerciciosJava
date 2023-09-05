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
package servicio;

import entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alanl
 */
public class ServAlumno {

    Scanner leer = new Scanner(System.in);

    ArrayList<Alumno> ListaAlumnos = new ArrayList<>();

    public Alumno crearAlumno() {
        Alumno m = new Alumno();
        return m;
    }

    public ArrayList<Alumno> fabricarAlumnosEnLista() {
        char continuar = 's';
        String nombre;

        while (continuar == 's') {
            Alumno a = crearAlumno();
            System.out.println("Ingrese el nombre del alumno: ");
            nombre = leer.next();
            a.setNombre(nombre);
            System.out.println("Ingrese la nota1 del alumno: ");
            a.setNotas(leer.nextInt());
            System.out.println("Ingrese la nota2 del alumno: ");
            a.setNotas(leer.nextInt());
            System.out.println("Ingrese la nota3 del alumno: ");
            a.setNotas(leer.nextInt());
            ListaAlumnos.add(a);
            System.out.println("Desea crear otro alumno? S/N");
            continuar = leer.next().toLowerCase().charAt(0);
        }
        return ListaAlumnos;
    }

    public double notaFinal() {
        double notaFinal = -1;
        double acumNotas = 0;
        int cont = 0;
        String nombreString;
        System.out.println("Ingrese el nombre del alumno para calcular su nota final: ");
        nombreString = leer.next();
        for (Alumno alum : ListaAlumnos) {
            if (alum.getNombre().equals(nombreString)) {
                for (Integer nota : alum.getNotas()) {
                    acumNotas += nota;
                    cont++;
                }
                notaFinal = acumNotas / (double) cont;
            }
        }

        return notaFinal;
    }

    public void mostrarListaAlumnos() {
        ListaAlumnos.forEach((alumno) -> {
            System.out.println(alumno);
        });
    }
}

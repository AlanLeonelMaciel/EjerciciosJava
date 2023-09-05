/*
 Calcular y mostrar el promedio de notas de todo el curso
Retornar otro arreglo con los nombre de los alumnos que recibieron una nota mayor al promedio del curso
Por último, deberemos mostrar todos los estudiantes con una nota mayor al promedio.

 */
package servicios;

import entidades.Alumno;

public class servicioAlumno {

    static int contAlumnos = 0;

    public static Alumno crearAlumno() {
        Alumno alumn = new Alumno();
        contAlumnos++;
        return alumn;
    }

    public static int cantidadAlumnos() {

        return contAlumnos;
    }

    //Calcular y mostrar el promedio de notas de todo el curso
    public static double promedioNotas(Alumno[] vectorAlumnos) {
        double promedio;
        int contNotas;
        double acumNotas = 0;
        contNotas = vectorAlumnos.length;
        for (Alumno alumnos : vectorAlumnos) {
            acumNotas = acumNotas + alumnos.getNota();
        }
        promedio = acumNotas / contNotas;
        return promedio;
    }

    //Retornar otro arreglo con los nombre de los alumnos que recibieron una nota mayor al promedio del curso
    public static String[] nombreAlumnosMayorAlPromedio(Alumno[] vectorAlumnos) {

        int contMayorPromedio = 0;
        int cont = 0;
        for (Alumno alumno : vectorAlumnos) {
            if (alumno.getNota() > promedioNotas(vectorAlumnos)) {
                contMayorPromedio++;
            }
        }
        String[] vectorNombreAlumnosMayorAlPromedio = new String[contMayorPromedio];
        for (Alumno alumno : vectorAlumnos) {
            if (alumno.getNota() > promedioNotas(vectorAlumnos)) {
                vectorNombreAlumnosMayorAlPromedio[cont] = alumno.getNombre();
                cont++;
            }
        }
        return vectorNombreAlumnosMayorAlPromedio;
    }

}

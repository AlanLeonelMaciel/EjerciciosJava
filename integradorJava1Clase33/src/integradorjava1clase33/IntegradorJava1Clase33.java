/*

 */
package integradorjava1clase33;

import entidades.Alumno;
import java.util.Arrays;
import java.util.Random;

public class IntegradorJava1Clase33 {

    public static void main(String[] args) {
        Random random = new Random(); // se llama para poder crear el aleatorio.
        int numeroAleatorio;
        Alumno[] arrayAlumnos = new Alumno[8]; // se crea array alumnos
        //Se crea el array de alumnos:
        for (int i = 0; i < arrayAlumnos.length; i++) {

            arrayAlumnos[i] = servicios.servicioAlumno.crearAlumno();
        }
        //Se rellena a cada alumno con una nota aleatoria entre 1 y 10 y ademas un nombre:
        for (int i = 0; i < arrayAlumnos.length; i++) {
            numeroAleatorio = random.nextInt(10) + 1;//se crea nota aleatoria entre 1 y 10 para cada alumno.
            arrayAlumnos[i].setNombre("Alumno" + (i + 1));
            arrayAlumnos[i].setNota(numeroAleatorio);
        }
        //Se imprime a cada alumno (nombre y nota);
        for (Alumno arrayAlumno : arrayAlumnos) {
            System.out.println(arrayAlumno.toString() + "\n");
        }
        //promedio notas
        System.out.println("El promedio total de las notas es: " + servicios.servicioAlumno.promedioNotas(arrayAlumnos));
        //Alumnos que superan el promedio:
        System.out.println("Los alumnos que superan el promedio son: " + Arrays.toString(servicios.servicioAlumno.nombreAlumnosMayorAlPromedio(arrayAlumnos)) + "\n");
        System.out.println(arrayAlumnos[0].getNombre());
    }//Fin main

}

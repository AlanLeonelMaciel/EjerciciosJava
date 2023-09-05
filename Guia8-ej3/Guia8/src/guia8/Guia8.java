package guia8;

import Entidades.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author mer22
 */
public class Guia8 {

    public static void main(String[] args) {
        int[] arrayImc = new int[4];
        Persona[] personas = new Persona[4];
        boolean[] arrayEdad = new boolean[4];

        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();
        PersonaServicio ps1 = new PersonaServicio();
        System.out.println("Cargar persona 1" + "\n");
        ps1.crearPersona(p1);
        System.out.println("Cargar persona 2" + "\n");
        ps1.crearPersona(p2);
        System.out.println("Cargar persona 3" + "\n");
        ps1.crearPersona(p3);
        System.out.println("Cargar persona 4" + "\n");
        ps1.crearPersona(p4);

        System.out.println("Calculando IMC de: " + p1.getNombre() + "\n");

        ps1.leerImc(ps1.calcularIMC(p1));
        System.out.println("Calculando IMC de: " + p2.getNombre() + "\n");
        ps1.leerImc(ps1.calcularIMC(p2));
        System.out.println("Calculando IMC de: " + p3.getNombre() + "\n");
        ps1.leerImc(ps1.calcularIMC(p3));
        System.out.println("Calculando IMC de: " + p4.getNombre() + "\n");
        ps1.leerImc(ps1.calcularIMC(p4));

        System.out.println(p1.getNombre() + " es mayor de edad: " + ps1.esMayorDeEdad(p1) + "\n");
        System.out.println(p2.getNombre() + " es mayor de edad: " + ps1.esMayorDeEdad(p2) + "\n");
        System.out.println(p3.getNombre() + " es mayor de edad: " + ps1.esMayorDeEdad(p3) + "\n");
        System.out.println(p4.getNombre() + " es mayor de edad: " + ps1.esMayorDeEdad(p4) + "\n");

        // Se asigna al array de tipo personas, las personas ya creadas anteriormente
        personas[0] = p1;
        personas[1] = p2;
        personas[2] = p3;
        personas[3] = p4;
        //luego aqui debajo se llena el array de tipo entero que obtiene el calculo del imc de cada persona del array de tipo persona
        for (int i = 0; i < personas.length; i++) {

            arrayImc[i] = ps1.calcularIMC(personas[i]);
        }
        // Ahora lo mismo pero con edad
        for (int i = 0; i < personas.length; i++) {

            arrayEdad[i] = ps1.esMayorDeEdad(personas[i]);
        }
        System.out.println("El porcentaje segun los pesos : " + "\n");
        ps1.PorcentajePesos(arrayImc);
        System.out.println("El porcentaje segun la edad: " + "\n");
        ps1.PorcentajeEdad(arrayEdad);
    }//Fin del main

}

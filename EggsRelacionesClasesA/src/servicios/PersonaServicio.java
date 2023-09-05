/*
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package servicios;

import entidad.Dni;
import entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author alanl
 */
public class PersonaServicio {

    private Scanner leer = new Scanner(System.in);

    public void CrearPersona(Persona p) {
        String nombre,apellido;
        int numeroDni;
        char serie;
        Dni documentoDni=new Dni();
        System.out.println("Ingrese el nombre: ");
        nombre = leer.next();
        p.setNombre(nombre);
        System.out.println("Ingrese el apellido: ");
        apellido = leer.next();
        p.setApellido(apellido);
        
        System.out.println("Ingrese el numero de dni: ");
        numeroDni=leer.nextInt();
        documentoDni.setNumero(numeroDni);
        System.out.println("Ingrese el caracter de la serie que corresponde su dni: ");
        serie=leer.next().charAt(0);
        documentoDni.setSerie(serie);
        p.setDocumentoDni(documentoDni);

    }
}

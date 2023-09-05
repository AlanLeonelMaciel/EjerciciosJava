/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggsguia3;

import com.sun.org.apache.xpath.internal.operations.Equals;
import java.util.Scanner;

/**
 *
 * @author alanl
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” 
 * el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
 * Nota: investigar la función equals() en Java.

 */
public class ej2 {

    public static void main(String[] args) {
        Scanner leerScanner = new Scanner(System.in);
        String fraseString;
        boolean esIgual;
        System.out.println("Escriba una frase: ");
        fraseString = leerScanner.nextLine();
        if (esIgual = fraseString.equals("eureka")) {
            System.out.println("La frase eureka ha sido comprobada: Correcto");

        } else {
            System.out.println("La frase eureka ha sido desestimada: Incorrecto");
        }

    }

}

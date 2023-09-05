/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggsguia2;

import java.util.Scanner;

/**
 *
 * @author alanl Escribir un programa que pida tu nombre, lo guarde en una
 * variable y lo muestre por pantalla.
 */
public class ej2 {

    public static void main(String[] args) {

        String nombreString;
        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor ingrese su nombre: ");
        nombreString = leer.nextLine();
        System.out.println("Su nombre es: " + nombreString);

    }

}

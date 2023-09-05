/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggsguia2;

import java.util.Scanner;

/**
 *
 * @author alanl Escribir un programa que pida una frase y la muestre toda en
 * mayúsculas y después toda en minúsculas.  *
 * Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 *
 */
public class ej3 {

    public static void main(String[] args) {
        String frase;
        String fraseMayusculas;
        String fraseMinusculas;
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor escriba una frase: ");
        frase = leer.nextLine();
        fraseMayusculas = frase.toUpperCase();
        fraseMinusculas = frase.toLowerCase();
        System.out.println("La Frase en mayusculas es: " + fraseMayusculas);
        System.out.println("La Frase en minusculas es: " + fraseMinusculas);
    }

}

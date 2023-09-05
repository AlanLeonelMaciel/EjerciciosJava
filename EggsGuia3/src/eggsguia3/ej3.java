/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggsguia3;

import java.util.Scanner;

/**
 *
 * @author alanl
 * Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo.
 * Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
 * un mensaje por pantalla que diga “CORRECTO”,
 * en caso contrario, se deberá imprimir “INCORRECTO”.
 * Nota: investigar la función Lenght() en Java.

 */
public class ej3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        int lenghtFrase;
        System.out.println("Ingrese una frase o una palabra: ");
        frase = leer.nextLine();
        lenghtFrase = frase.length();
        if (lenghtFrase == 8) {
            System.out.println("La frase tiene 8 letras: Correcto");

        } else {
            System.out.println("La frase no tiene 8 letras: Incorrecto");
        }

    }
    
}

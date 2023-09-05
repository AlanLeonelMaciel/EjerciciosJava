/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggsguia2;

import java.util.Scanner;

/**
 *
 * @author alanl Escribir un programa que lea un número entero por teclado y
 * muestre por pantalla el doble, el triple y la raíz cuadrada de ese número.
 * Nota: investigar la función Math.sqrt().
 */
public class ej5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        double raizDeNumero;
        System.out.println("Ingrese un numero entero: ");
        numero = leer.nextInt();
        raizDeNumero = Math.sqrt(numero);
        System.out.println("Su doble: " + numero * 2);
        System.out.println("Su triple: " + numero * 3);
        System.out.println("Su raiz cuadrada: " + raizDeNumero);
    }

}

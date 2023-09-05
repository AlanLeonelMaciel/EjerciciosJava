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
 */
public class Ej1 {

    /**
     * @param args the command line arguments Crear un programa que dado un
     * número determine si es par o impar.
     *
     */
    public static void main(String[] args) {
        int numero;
        boolean esPar;
        Scanner leer = new Scanner(System.in);
        esPar = false;
        System.out.println("Por favor ingrese un numero: ");
        numero = leer.nextInt();
        if (numero % 2 == 0) {
            esPar = true;

        }
        System.out.println("El numero es par: " + esPar);
    }

}

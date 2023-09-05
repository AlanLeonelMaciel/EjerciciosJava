/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggsguia2;

import java.util.Scanner;

/**
 *
 * @author alanl Dada una cantidad de grados centígrados se debe mostrar su
 * equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9
 * * C / 5).
 *
 */
public class ej4 {

    public static void main(String[] args) {
        float f, c;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de grados centrigrados: ");
        c = leer.nextFloat();
        f = 32 + (9 * c / 5);
        System.out.println("Su equivalente en Fahrenheit es: " + f);
    }
}

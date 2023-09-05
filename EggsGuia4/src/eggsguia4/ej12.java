/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggsguia4;

import java.util.Scanner;

/**
 *
 * Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
 * usuario, validando que el primer número múltiplo del segundo e imprima si el
 * primer número es múltiplo del segundo, sino informe que no lo son.
 *
 */
public class ej12 {

    public static void main(String[] args) {
        Scanner leerScanner = new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.println("Ingrese un numero: ");
        numero1 = leerScanner.nextInt();
        System.out.println("Ingrese otro numero: ");
        numero2 = leerScanner.nextInt();
        EsMultiplo(numero1, numero2);
    }

    public static void EsMultiplo(int numero1, int numero2) {
        if (numero1%numero2==0) {
            System.out.println("El numero "+numero1+" es multiplo de: "+numero2);
        } else {
            System.out.println("El numero "+numero1+" no es multiplo de: "+numero2);
        }

    }
}

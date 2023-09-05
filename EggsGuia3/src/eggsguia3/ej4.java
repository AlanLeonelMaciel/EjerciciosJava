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
 * Escriba un programa que pida una frase o palabra y valide
 * si la primera letra de esa frase es una ‘A’.
 * Si la primera letra es una ‘A’,
 * se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,
 * en caso contrario, se deberá imprimir “INCORRECTO”.
 * Nota: investigar la función Substring y equals() de Java.

 */
public class ej4 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        String palabraString;
        String primerLetra;
        System.out.println("Ingrese una palabra: ");
        palabraString=leer.nextLine();
        primerLetra=palabraString.substring(0,1);
       // System.out.println("La primer letra es: "+primerLetra); Si se quiere probar
        if (primerLetra.equals("A")) {
            System.out.println("La primer letra es A: Correcto");
            
        }
        else 
        {
            System.out.println("Incorrecto. La primer letra no es A");
        }
        
    }
    
}

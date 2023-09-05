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
 * Escriba un programa en el cual se ingrese un valor límite positivo,
 * y a continuación solicite números al usuario
 * hasta que la suma de los números introducidos supere el límite inicial.

 */
public class ej5 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int numero;
        int limitePositivo;
        int acumulador=0;
        limitePositivo=500;
        do {
        System.out.println("Ingrese un numero: ");
        numero=leer.nextInt();
        acumulador=acumulador+numero;
            
        } while (acumulador<=limitePositivo);
        
    }
    
}

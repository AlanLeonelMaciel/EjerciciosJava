/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggsguia2;
import java.util.Scanner; // Este es el importe de la clase Scanner
/**
 *
 * @author alanl
 * Escribir un programa que pida dos números enteros por teclado y 
 * calcule la suma de los dos. 
 * El programa deberá después mostrar el resultado de la suma
 */
public class ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int suma;
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese un numero por teclado: ");
        numero1= leer.nextInt();
        System.out.println("Ingrese otro numero por teclado: ");
        numero2= leer.nextInt();
        suma=numero1+numero2;
        System.out.println("La suma de ambos numeros es: "+suma);
        
       
    }
    
}

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
 * Realizar un programa que pida dos números enteros positivos por teclado
 * y muestre por pantalla el siguiente menú:
 * El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
 * y luego volver al menú.
 * El programa deberá ejecutarse hasta que se elija la opción 5.
 * Tener en cuenta que, si el usuario selecciona la opción 5,
 * en vez de salir del programa directamente,
 * se debe mostrar el siguiente mensaje de confirmación:
 * ¿Está seguro que desea salir del programa (S/N)?
 * Si el usuario selecciona el carácter ‘S’ se sale del programa,
 * caso contrario se vuelve a mostrar el menú.

 */
public class ej6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        char continuar = 'S';
        int menu;
        System.out.println("Ingrese un numero: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro numero: ");
        num2 = leer.nextInt();
        while (Character.compare(continuar, 'S') == 0) {
            System.out.println("MENU\n1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n5.Salir");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("La suma es: "+(num1+num2));

                    break;
                case 2:
                    System.out.println("La resta es: "+(num1-num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion es: "+(num1*num2));

                    break;
                case 4:
                    System.out.println("La division es: "+(num1/num2));
                    break;
                case 5:
                    System.out.println("Desea continuar?\nS/N");
                    continuar=leer.next().charAt(0);
                    continuar = Character.toUpperCase(continuar);
                    break;
                default:
                    System.out.println("No ha seleccionado una opcion correcta.\nOprima enter para continuar..");
                   new Scanner(System.in).nextLine();
            }
        }

    }

}

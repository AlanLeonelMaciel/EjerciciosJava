/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggsguia4;

import java.util.Scanner;

/**
 *
 * Escribir un programa que procese una secuencia de caracteres ingresada por teclado 
 * y terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: 
 * cada vocal se reemplaza por el carácter que se indica en la tabla y
 * el resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
a
e
i
o
u
//@
#
$
%
*
Realice un subprograma que reciba una secuencia de caracteres y retorne la 
* codificación correspondiente. Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

 */
public class ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String fraseString;
        String nuevaFraseString;
        System.out.println("Ingrese una frase con un punto al final: ");
        fraseString=leer.nextLine();
        nuevaFraseString=codificacion(fraseString);
        System.out.println("La frase codificada es: "+nuevaFraseString);
        
        
    }
    public static String codificacion(String frase) {
        String nuevaFrase;
        nuevaFrase="";
        char letra;
        for (int i = 0; i < frase.length(); i++) {
            letra = frase.charAt(i);
            letra = Character.toUpperCase(letra);
            switch (letra) {
                case 'A':
                    nuevaFrase=nuevaFrase.concat("@");
                    break;
                case 'E':
                    nuevaFrase=nuevaFrase.concat("#");
                    break;
                case 'I':
                    nuevaFrase=nuevaFrase.concat("$");
                    break;
                case 'O':
                    nuevaFrase=nuevaFrase.concat("%");
                    break;
                case 'U':
                    nuevaFrase=nuevaFrase.concat("*");
                    break;
                    default: 
                        nuevaFrase=nuevaFrase.concat(Character.toString(letra));
                        break;

            }
        }
        return nuevaFrase;
}
    
}

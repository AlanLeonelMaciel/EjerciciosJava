/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package eggsguia10ej1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alanl
 */
public class EggsGuia10Ej1 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        char continuar='s';
        ArrayList<String> razas= new ArrayList<>();
        
        while (continuar=='s') {            
            System.out.println("Ingrese la raza del perro: ");
            razas.add(leer.next());
            System.out.println("Desea continuar? S/N");
            continuar=leer.next().toLowerCase().charAt(0);
        }
        
        razas.forEach((raza) -> {
            System.out.println(raza);
        });
    }
    
}

/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package eggsguia10ej2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EggsGuia10Ej2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String razaString;
        char continuar = 's';
        int remove = 0;
        List<String> razas = new ArrayList();

        while (continuar == 's') {
            System.out.println("Ingrese la raza del perro: ");
            razas.add(leer.next());
            System.out.println("Desea continuar? S/N");
            continuar = leer.next().toLowerCase().charAt(0);
        }

        razas.forEach((raza) -> {
            System.out.println(raza);
        });
        System.out.println("Ingrese una Raza: ");
        razaString = leer.next();
        Iterator<String> it = razas.iterator();

        while (it.hasNext()) {
            if (it.next().equals(razaString)) {
                it.remove();
                remove++;
            }
        }
        if (remove != 0) {
            System.out.println("Felicidades, la lista con la raza eliminada: " + razaString + " es: ");
            Collections.sort(razas);
            razas.forEach((raza) -> {
                System.out.println(raza);
            });
        } else {
            System.out.println("La raza: " + razaString + " no se ha encontrado.");
            Collections.sort(razas);
            razas.forEach((raza) -> {
                System.out.println(raza);
            });
        }
        
    }//Fin main



}

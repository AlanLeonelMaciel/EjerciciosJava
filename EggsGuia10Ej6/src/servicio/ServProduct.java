/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.

Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package servicio;

import entidades.Producto;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author alanl
 */
public class ServProduct {

    Scanner leer;
    Producto p;
    HashMap<String, Integer> productosMap;

    public ServProduct() {
        leer = new Scanner(System.in);
        productosMap = new HashMap();
        p = new Producto();
    }

    public void IntroducirProducto() {
        System.out.println("Por favor introduzca el nombre del producto: ");
        p.setNombre(leer.next());
        System.out.println("Introduzca su precio: ");
        p.setPrecio(leer.nextInt());
        productosMap.put(p.getNombre(), p.getPrecio());
    }

    public void ModificarPrecio() {
        String nombreMod;
        int modifico = 0;
        System.out.println("Por favor ingrese el nombre del producto para modificar su precio: ");
        nombreMod = leer.next();
        for (Map.Entry<String, Integer> aux : productosMap.entrySet()) {
            String key = aux.getKey();
            Integer value = aux.getValue();
            if (nombreMod.equals(key)) {
                System.out.println("Ingrese el nuevo precio: ");
                aux.setValue(leer.nextInt());
                modifico = 1;
                break;
            }

        }
        if (modifico == 0) {
            System.out.println("No se ha encontrado el producto..");
        }
    }

    public void MostrarProductos() {
        for (Map.Entry<String, Integer> entry : productosMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Nombre del producto: " + key +" ||"+ " Precio: " + value);
        }
    }

    public void EliminarProductos() {
        String nombreDel;
        System.out.println("Ingrese el nombre del producto que desea eliminar: ");
        nombreDel = leer.next();
        Iterator<Map.Entry<String, Integer>> iterator = productosMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            String nombre = entry.getKey();

            // Lógica para determinar si el producto debe ser eliminado
            if (nombre.equals(nombreDel)) {
                iterator.remove(); // Elimina el producto del HashMap
            }
        }
    }
}//Fin servicio

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggsguia10ej6;

import java.util.Scanner;
import servicio.ServProduct;

/**
 *
 * @author alanl
 */
public class EggsGuia10Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char continuarString = 's';
        int opcion;
        ServProduct servProduct1=new ServProduct();
        
        do { 
            System.out.println("=== Menú ===");
            System.out.println("1. Introducir");
            System.out.println("2. Modificar precio");
            System.out.println
        ("3. Eliminar");
            System.out.println("4. Mostrar");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            Scanner leer=new Scanner(System.in); 
            opcion=leer.nextInt();
            switch(opcion){
                case 1: servProduct1.IntroducirProducto();
                break;
                case 2: servProduct1.ModificarPrecio();
                break;
                case 3: servProduct1.EliminarProductos();
                break;
                case 4: servProduct1.MostrarProductos();
                break;
                case 5: //System.out.println("Esta seguro de salir? S/N");
                continuarString='n';
                break;
                default:System.out.println("No ha seleccionado una opcion correcta.");
                break;
            }
        } while (continuarString=='s');
    }
    
}

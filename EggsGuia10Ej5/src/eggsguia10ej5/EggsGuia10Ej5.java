/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggsguia10ej5;

import entidades.Pais;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import servicioPaises.PaisesServicio;

/**
 *
 * @author alanl
 */
public class EggsGuia10Ej5 {

    public static void main(String[] args) {
        String nombreString;
        Scanner leer=new Scanner(System.in);
        PaisesServicio paisesServ=new PaisesServicio();
        Set<Pais> paises=new TreeSet<>();
        paises=paisesServ.FabricaPaises();
        System.out.println(paises);
        System.out.println("Ingrese el nombre del pais que desea eliminar: ");
        nombreString=leer.next();
        paisesServ.BajaPais(paises, nombreString);
        paisesServ.MostrarConjunto(paises);
        
        
    }//Fin main
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.Persona;
import java.util.Scanner;

/*
Crea un método void que reciba un objeto tipo persona como parámetro y
utilice el get para mostrar sus atributos. Llama ese método desde el main.
*/
 
public class ServicioPersona {

    private Scanner leerScanner = new Scanner (System.in).useDelimiter("\n");

    public ServicioPersona() {
    }
    

    public Persona crearPersona() {
        String nombreString, apellidoString;
        int dni;
        System.out.println("Ingrese nombre: ");
        nombreString = leerScanner.next();
        System.out.println("Ingrese apellido: ");
        apellidoString = leerScanner.next();
        System.out.println("Ingrese dni: ");
        dni = leerScanner.nextInt();
        return new Persona(dni,nombreString,apellidoString);
    }
    
    public void mostrarPersona(Persona p) {
        System.out.println("El nombre es: "+p.getNombreString()+" Su apellido es: "+p.getApellidoString()+" Su dni es: "+p.getDni());
        
        
        
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggsguia7;


import entidad.Persona;

/**
 *
 *   /**
     * Volveremos a usar la clase Persona y vamos a crear objetos
     * en tu Main utilizando los constructores.

     */
 
public class EggsGuia7 {

  
    public static void main(String[] args) {
         Persona pers1 = new Persona ("Alan Maciel", 38950, 1995);
         
         pers1.setNombreString("Alan Leonel");
         System.out.println("El nombre del objeto es: "+pers1.getNombreString()); 
    }
    
}

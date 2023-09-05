/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Jugador;
import java.util.Scanner;

/**
 *
 * @author alanl
 */
public class ServicioJugador {
    Scanner leer = new Scanner(System.in);
     private static int ultimoId = 0;
    
    public  void CrearJugador(Jugador jugador){
        
        System.out.println("Ingrese el nombre:"+" su id sera: "+(ultimoId+1));
        jugador.setNombre(leer.next());
        ultimoId++;
        jugador.setId(ultimoId);
        
    }
}

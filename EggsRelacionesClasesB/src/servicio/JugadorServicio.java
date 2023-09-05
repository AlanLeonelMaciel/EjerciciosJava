/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package servicio;

import entidades.Jugador;
import java.util.Scanner;

/**
 *
 * @author alanl
 */
public class JugadorServicio {
    Scanner leer=new Scanner(System.in);
    public void CrearJugador(Jugador jugador){
        System.out.println("Ingrese nombre del jugador: ");
        jugador.setNombre(leer.next());
        System.out.println("Ingrese el apellido del jugador: ");
        jugador.setApellido(leer.next());
        System.out.println("Ingrese el numero que identifica al jugador: ");
        jugador.setNumero(leer.nextInt());
        System.out.println("Ingrese la posicion del jugador: ");
        jugador.setPosicion(leer.nextInt());
    }
}

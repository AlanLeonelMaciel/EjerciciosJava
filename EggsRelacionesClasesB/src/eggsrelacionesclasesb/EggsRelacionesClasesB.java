/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package eggsrelacionesclasesb;

import entidades.Equipo;
import entidades.Jugador;
import java.util.ArrayList;
import servicio.JugadorServicio;

/**
 *
 * @author alanl
 */
public class EggsRelacionesClasesB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();
        Jugador jugador3 = new Jugador();
        Equipo equipo1=new Equipo();

        JugadorServicio jugadorServicio = new JugadorServicio();
        
        ArrayList jugadores=new ArrayList();
        System.out.println("Creacion jugador 1 : ");
        jugadorServicio.CrearJugador(jugador1);
        System.out.println("Creacion jugador 2: ");
        jugadorServicio.CrearJugador(jugador2);
        System.out.println("Creacion jugador 3: ");
        jugadorServicio.CrearJugador(jugador3);
        jugadores.add(jugador1);
        jugadores.add(jugador2);
        jugadores.add(jugador3);
        equipo1.setJugadores(jugadores);
        System.out.println(equipo1.getJugadores());
        
    }

}

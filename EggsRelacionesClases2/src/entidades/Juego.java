/*
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

10
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alanl
 */
public class Juego {

    ArrayList<Jugador> jugadores;
    revolver arma;

    public void llenarJuego(ArrayList<Jugador> jugadores, revolver arma) {
        this.jugadores = jugadores;
        this.arma = arma;
    }

    public void ronda() {
        Boolean muertoBoolean = false;
        int i = 1;

        do {
            System.out.println("Ronda " + i);
            i++;
            for (Jugador auxJugador : jugadores) {
                // Aquí puedes realizar las acciones que quieras con cada jugador
                if (auxJugador.disparo(arma)) {
                    System.out.println("Fuiste ejecutado pa. Jugador: " + auxJugador.getNombre() + " ID: " + auxJugador.getId());
                    System.out.println(auxJugador);
                    System.out.println("");
                    System.out.println("Datos del arma: ");
                    System.out.println(arma);
                    muertoBoolean = true;
                    break;
                } else {
                    System.out.println("Safaste. Jugador: " + auxJugador.getNombre() + " ID: " + auxJugador.getId());
                    System.out.println("");
                    /*System.out.println(auxJugador);
                    System.out.println(arma);
                    System.out.println("");*/
                }
            System.out.println("Presiona Enter para continuar...");
            Scanner leerScanner= new Scanner(System.in);
            leerScanner.nextLine();
            }
        } while (!(muertoBoolean));

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggsguia10ej4;

import servicio.peliculaServicio;

/**
 *
 * @author alanl
 */
public class EggsGuia10Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        peliculaServicio peliS1= new peliculaServicio();
        
        peliS1.fabricaPeliculas();
        System.out.println("Todas las pelis: ");
        peliS1.MostrarPelis();
        System.out.println("Todas las pelis mayor a una hora:");
        peliS1.MostrarPelisMayorUnaHora();
        System.out.println("Pelis de acuerdo a su duracion Descendente: ");
        peliS1.OrdenarDuracionDescendente();
        peliS1.MostrarPelis();
        System.out.println("Pelis de acuerdo a su duracion Ascendente: ");
        peliS1.OrdenarDuracionAscendente();
        peliS1.MostrarPelis();
        System.out.println("Pelis ordenasdas por director alfabeticamente: ");
        peliS1.OrdenarDirectorAlfabeticamente();
        peliS1.MostrarPelis();
        System.out.println("Pelis ordenasdas por titulo alfabeticamente: ");
        peliS1.OrdenarTituloAlfabeticamente();
        peliS1.MostrarPelis();
        
    }//fin main
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import utilidades.Comparadores;

/**
 *
 * @author alanl
 */
public class peliculaServicio {

    ArrayList<Pelicula> listaPelis;
    Scanner leer;

    public ArrayList<Pelicula> getListaPelis() {
        return listaPelis;
    }

    public peliculaServicio() {
        this.listaPelis = new ArrayList<>();
        this.leer = new Scanner(System.in);
    }

    public void fabricaPeliculas() {
        char continuar = 's';

        do {
            Pelicula a = new Pelicula();
            System.out.println("Ingrese el titulo de la pelicula: ");
            a.setTitulo(leer.next());
            System.out.println("Ingrese el director de la pelicula: ");
            a.setDirector(leer.next());
            System.out.println("Ingrese la duracion de la pelicula: ");
            a.setDuracion(leer.nextInt());
            this.listaPelis.add(a);
            System.out.println("Desea ingresar otra pelicula? S/N?");
            continuar = leer.next().toLowerCase().charAt(0);

        } while (continuar == 's');
    }

    public void MostrarPelis() {
        this.listaPelis.forEach((aux) -> {
            System.out.println(aux);
        });
    }

    public void MostrarPelisMayorUnaHora() {
        this.listaPelis.forEach((aux) -> {
            if (aux.getDuracion() > 1) {
                System.out.println(aux);
            }
        });
    }

    public void OrdenarDuracionDescendente() {
        this.listaPelis.sort(Comparadores.OrdenarDuracionDesc);
    }

    public void OrdenarDuracionAscendente() {
        this.listaPelis.sort(Comparadores.OrdenarDuracionAscendente);
    }

    public void OrdenarTituloAlfabeticamente() {
        this.listaPelis.sort(Comparadores.OrdenarTituloAlfabeticamente);
    }

    public void OrdenarDirectorAlfabeticamente() {
        this.listaPelis.sort(Comparadores.OrdenarDirectorAlfabeticamente);
    }

}//Fin servicio

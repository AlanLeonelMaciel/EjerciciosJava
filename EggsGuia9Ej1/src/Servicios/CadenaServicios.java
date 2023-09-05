/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author alanl
 */
public class CadenaServicios {

    Scanner leer = new Scanner(System.in);

    public void mostrarVocales(Cadena c1) {
        int cont;

        String vocalesString;
        vocalesString = "aeiou";
        cont = 0;
        for (int i = 0; i < c1.getLongitud(); i++) {
            if (vocalesString.contains(c1.getFrase().substring(i, i + 1))) {
                cont++;
            }

        }
        System.out.println("La cantidad de vocales es : " + cont);
    }

    public void invertirFrase(Cadena c1) {

        for (int i = c1.getLongitud() - 1; i >= 0; i--) {
            System.out.print(c1.getFrase().substring(i, i + 1));

        }
        System.out.println("\n");
    }

    public void vecesRepetido(Cadena c1) {
        String letra;
        int contador;
        contador = 0;
        System.out.println("Ingrese la letra a contabilizar: ");
        letra = leer.next();
        for (int i = 0; i < c1.getLongitud(); i++) {
            if (letra.equals(c1.getFrase().substring(i, i + 1))) {
                contador++;
            }

        }
        System.out.println("El caracter " + letra + " se repite: " + contador + " veces.");
    }

    public void compararLongitud(Cadena c1) {
        String fraseNueva;
        System.out.println("Ingrese la frase a comparar: ");
        fraseNueva = leer.nextLine();

        if (c1.getLongitud() == fraseNueva.length()) {

            System.out.println("Ambas frases tienen la misma longitud.");
        } else {
            if (c1.getLongitud() > fraseNueva.length()) {

                System.out.println("La frase original es mas larga.");
            } else {
                System.out.println("La frase original es mas corta.");
            }
        }

    }

    public void unirFrases(Cadena c1) {
        String fraseNueva;
        String fraseResultante;
        System.out.println("Ingrese Frase a concatenar: ");
        fraseNueva = leer.nextLine();
        fraseResultante = c1.getFrase() + " " + fraseNueva;
        System.out.println("Frase concatenada: " + fraseResultante);
    }

    public void reemplazar(Cadena c1) {
        String caracter;
        String fraseResultante;
        System.out.println("Ingrese caracter para reemplazar: ");
        caracter = leer.next();
        fraseResultante = c1.getFrase().replace("a", caracter);
        System.out.println("La frase resultante: " + fraseResultante);
    }

    public boolean contiene(Cadena c1) {
        String caracter;
        boolean contiene;
        int numero;
        System.out.println("Ingrese caracter para verificar si esta contenida en la frase: ");
        caracter = leer.next();
        contiene = c1.getFrase().contains(caracter);
        return contiene;
    }

}

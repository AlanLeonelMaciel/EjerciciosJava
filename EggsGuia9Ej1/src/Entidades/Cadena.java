/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author alanl
 */
public class Cadena {

    private String Frase;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String Frase) {
        this.Frase = Frase;
        longitud = Frase.length();
    }

    public String getFrase() {
        return Frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setFrase(String Frase) {
        this.Frase = Frase;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

}

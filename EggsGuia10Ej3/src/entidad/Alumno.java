/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.ArrayList;

/**
 *
 * @author alanl
 */
public class Alumno {
    private String nombre;
    private ArrayList<Integer>notas;

    public Alumno() {
        this.notas = new ArrayList<>(3);
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotas(int nota) {
        notas.add(nota);
    }
   
    

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    @Override
    public String toString() {
        
        return this.nombre+this.notas;
    }

    
}

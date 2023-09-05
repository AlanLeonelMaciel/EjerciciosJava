/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author alanl
 */
public class Persona {
    int dni;
    String nombreString;
    String apellidoString;

    public Persona(int dni, String nombreString, String apellidoString) {
        this.dni = dni;
        this.nombreString = nombreString;
        this.apellidoString = apellidoString;
    }

    public Persona() {
    }

    public int getDni() {
        return dni;
    }

    public String getNombreString() {
        return nombreString;
    }

    public String getApellidoString() {
        return apellidoString;
    }
    
}

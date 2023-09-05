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
    //atributos
    public String nombreString;
    public int id;
    public int fechaNac;
    
    //constructor
    public Persona (String nombreString, int id, int fechaNac) {
        this.nombreString=nombreString;
        this.id=id;
        this.fechaNac=fechaNac;
    }
    // Metodos GET

    public String getNombreString() {
        return nombreString;
    }

    public int getId() {
        return id;
    }

    public int getFechaNac() {
        return fechaNac;
    }
     // Metodos SET

    public void setNombreString(String nombreString) {
        this.nombreString = nombreString;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFechaNac(int fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    
}

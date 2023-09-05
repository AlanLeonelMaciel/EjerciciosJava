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
public class Pelicula {
    private Integer duracion;
    private String titulo;
    private String director;

    public Pelicula() {
    }

    public Pelicula(Integer duracion, String titulo, String director) {
        this.duracion = duracion;
        this.titulo = titulo;
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
    @Override
    public String toString(){
        return this.titulo+" director: "+this.director+" duracion: "+this.duracion;
    }
    
}

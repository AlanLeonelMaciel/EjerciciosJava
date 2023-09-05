/*

Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)

 */
package entidades;

import java.util.Random;

/**
 *
 * @author alanl
 */
public class revolver {
    int posicionActual,posicionAgua;
    Random random= new Random();
    

    public revolver() {

    }
    
    public void llenarRevolver(){
        posicionActual=random.nextInt(6)+1;
        posicionAgua=random.nextInt(6)+1;
    }
    public Boolean Mojar() {
        Boolean mojar=true;
        if (posicionActual!=posicionAgua) {
            mojar=false;
        }
        return mojar;
    }
    public void SiguienteChorro(){
        posicionActual=posicionActual+1;
        if (posicionActual>6) {
            posicionActual=1;
        }
        
    }
    
    @Override
    public String toString() {
        return "revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
    
    
    
    
    
    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    
    
}

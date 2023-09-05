/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggsguia5;

/**
 *
 * Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
 * de equipo y define su tipo de dato de tal manera que te permita alojar
 * sus nombres más adelante.
 * Utilizando un Bucle for, aloja en el vector Equipo,
 * los nombres de tus compañeros de equipo

 */
public class ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] Equipo=new String[5];
        for (int i = 0; i < 5; i++) {
            Equipo[i]="alan";
            switch (i) {
                case 0:
                   Equipo[i]="alan";
                    break;
                case 1:
                  Equipo[i]="pepe";
                    break;
                case 2:
                   Equipo[i]="mujica";
                    break;
                case 3:
                   Equipo[i]="alberto";
                    break;
                case 4:
                  Equipo[i]="milei";
                    break;
                   

            }
            
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Los nombres son: "+Equipo[i]);
            
        }
    }
    
}

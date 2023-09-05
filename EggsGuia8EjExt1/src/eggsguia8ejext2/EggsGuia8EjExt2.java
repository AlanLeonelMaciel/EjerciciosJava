/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggsguia8ejext2;

import Entidades.Raices2;
import Servicio.ServicioRaices2;

/**
 *
 * @author alanl
 */
public class EggsGuia8EjExt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        ServicioRaices2 sr2 = new ServicioRaices2();
        
        Raices2 r3 = new Raices2(2, -10, 12);
        
        sr2.calcular(r3);
        
    
    
}
    }

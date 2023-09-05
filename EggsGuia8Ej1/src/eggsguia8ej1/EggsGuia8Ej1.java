/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggsguia8ej1;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;

/**
 *
 * @author alanl
 */
public class EggsGuia8Ej1 {

  
    public static void main(String[] args) {
        CuentaBancariaServicio cs=new CuentaBancariaServicio();
        CuentaBancaria cb=cs.crearCuenta();
       
        
        
        CuentaBancaria cb1=cs.crearCuenta();
        System.out.println("cb:");
        cs.consultarDatos(cb);
        System.out.println("cb1");
        cs.consultarDatos(cb1);
       
        
        
        
    }
    
}

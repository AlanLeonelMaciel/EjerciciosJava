/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioPaises;

import entidades.Pais;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author alanl
 */
public class PaisesServicio {
    Scanner leer;
    Set<Pais> paises= new TreeSet<>();
    Pais pais;

    public PaisesServicio() {
        this.leer=new Scanner(System.in);
    }
    
    public Set FabricaPaises(){
        char continuar='s';
        do {            
        pais=new Pais();
        System.out.println("Ingrese el nombre del pais: ");
        pais.setNombrePais(leer.next());
        System.out.println("Ingrese la cantidad de habitantes: ");
        pais.setHabitantes(leer.nextInt());
        paises.add(pais);
            System.out.println("Desea continuar? S/N");
            continuar=leer.next().toLowerCase().charAt(0);
        } while (continuar=='s');
        return this.paises;
    }
    public void BajaPais (Set<Pais> n,String nombre) {
        int bandera=0;
        Set<Pais>PaisesAuxiliar=new TreeSet<>();
        for (Pais pais1 : n) {
            if(!pais1.getNombrePais().equals(nombre)) {
                PaisesAuxiliar.add(pais1);
                
            }
            else{
                bandera=1;//En caso de que encuentre un nomnre igual dentro del conjunto.
            }
        }
        
        n.clear();
        n.addAll(PaisesAuxiliar);
        if(bandera==0){
            System.out.println("No se tiene registro de ese nombre.");
        }
    }
    public void MostrarConjunto(Set<Pais>miSet){
        for (Pais aux : miSet) {
            System.out.println(aux);
        }
    }
}//Fin servicio

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7.ejercicio4;

import java.util.Scanner;

/**Crea una clase "Juego" que tenga un método "iniciar_juego" que permita
a dos jugadores jugar un juego de adivinanza de números. El primer
jugador elige un número y el segundo jugador intenta adivinarlo. El
segundo jugador tiene un número limitado de intentos y recibe una pista
de "más alto" o "más bajo" después de cada intento. El juego termina
cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el número y el
número de veces que cada jugador ha ganado.
 *
 * @author Maty
 */
public class juego {
    
    private int num1;
    private int num2;
    
    Scanner input = new Scanner(System.in);

    public juego(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public juego() {
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    //metodos
    public void iniciarJuego(){
        System.out.println("Jugador uno Ingrese un numero");
        num1 = input.nextInt();
        int cont = 1;
        boolean rta=false;
        do{
        System.out.println("Jugador dos Adivine el nnumero");
          num2 = input.nextInt();
           if(num2<num1){
               System.out.println("No, El numero es Mayor"); 
           } 
           else if(num2>num1){
               System.out.println(" No, El numero es menor"); 
           }else{
               System.out.println("SIII, adivino el numero");
           }
          
           cont++;
           
        }while(rta==false && cont<=3);
    
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author mer22
 */
public class PersonaServicio {

    public boolean esMayorDeEdad(Persona persona1) {
        boolean esMayor = false;
        if (persona1.getEdad() >= 18) {
            esMayor = true;
        }
        return esMayor;
    }
    private Scanner leerserv = new Scanner(System.in).useDelimiter("\n");

    public void crearPersona(Persona persona1) {
        System.out.println("Ingrese su nombre");
        persona1.setNombre(leerserv.next());
        System.out.println("Ingrese su edad");
        persona1.setEdad(leerserv.nextInt());
        System.out.println("Ingrese su sexo: M - H - O");
        do {
            persona1.setSexo(leerserv.next());

            if ((!(persona1.getSexo().equalsIgnoreCase("m"))) && (!(persona1.getSexo().equalsIgnoreCase("h"))) && (!(persona1.getSexo().equalsIgnoreCase("o")))) {
                System.out.println("Incorrecto. Ingrese un caracter correcto: h - m - o");
            }
        } while ((!(persona1.getSexo().equalsIgnoreCase("m"))) && (!(persona1.getSexo().equalsIgnoreCase("h"))) && (!(persona1.getSexo().equalsIgnoreCase("o"))));

        System.out.println("Ingrese su altura");
        persona1.setAltura(leerserv.nextDouble());
        System.out.println("Ingrese su peso");
        persona1.setPeso(leerserv.nextDouble());

    }

    public int calcularIMC(Persona persona1) {
        //(peso en kg/(altura^2 en mt2))
        int pesoIdeal = 0;
        double IMC = persona1.getPeso() / (Math.pow(persona1.getAltura(), 2));
        // System.out.println(IMC);
        if (IMC < 20) {
            pesoIdeal = -1;
        } else {
            if (IMC > 25) {
                pesoIdeal = 1;

            }

        }

        return pesoIdeal;
    }

    public void leerImc(int pesoIdeal) {
        if (pesoIdeal == 0) {
            System.out.println("Usted está en su peso ideal" + "\n");
        } else if (pesoIdeal == 1) {
            System.out.println("Usted tiene sobrepeso" + "\n");
        } else {
            System.out.println("Usted está por debajo de su peso ideal" + "\n");
        }
    }

    public void PorcentajePesos(int[] algo) {
        int ideal = 0;
        int sobrepeso = 0;
        int bajoPeso = 0;
        float porcentajeIdeal = 0;
        float porcentajeSobrepeso = 0;
        float porcentajeBajopeso = 0;
        for (int i = 0; i < algo.length; i++) {
            if (algo[i] == 0) {
                //  System.out.println("Usted está en su peso ideal");
                ideal++;
            } else if (algo[i] == 1) {
                //System.out.println("Usted tiene sobrepeso");
                sobrepeso++;
            } else {
                //  System.out.println("Ustede está por debajo de su peso ideal");
                bajoPeso++;
            }

        }
        if (ideal > 0) {
            porcentajeIdeal = (ideal * 100) / 4;
        }
        if (sobrepeso > 0) {
            porcentajeSobrepeso = (sobrepeso * 100) / 4;
        }
        if (bajoPeso > 0) {
            porcentajeBajopeso = (bajoPeso * 100) / 4;
        }

        System.out.println("El porcentaje de pesos ideales: " + porcentajeIdeal + "\n");
        System.out.println("El porcentaje de sobre pesos: " + porcentajeSobrepeso + "\n");
        System.out.println("El porcentaje de bajo peso: " + porcentajeBajopeso + "\n");
    }

    public void PorcentajeEdad(boolean[] algo) {
        int mayor = 0;
        int menor = 0;

        float porcentajeMayor = 0;
        float porcentajeMenor = 0;

        for (int i = 0; i < algo.length; i++) {
            if (algo[i]) {
                //  System.out.println("Usted está en su peso ideal");
                mayor++;
            } else {
                //System.out.println("Usted tiene sobrepeso");
                menor++;
            }

        }
        if (mayor > 0) {
            porcentajeMayor = (mayor * 100) / 4;
        }
        if (menor > 0) {
            porcentajeMenor = (menor * 100) / 4;
        }

        System.out.println("El porcentaje de mayores: " + porcentajeMayor + "\n");
        System.out.println("El porcentaje de menores: " + porcentajeMenor + "\n");

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;


/**
 *
 * @author alanl
 */
public class Puntos {
    Scanner leer= new Scanner(System.in);
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    public Puntos() {
    }

    public Puntos(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    
   //Get y Set     
    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getY1() {
        return y1;
    }

    public double getY2() {
        return y2;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
    //Metodos   
    public void crearPuntos(){
        System.out.println("Ingrese x1: ");
        this.x1=leer.nextDouble();
        System.out.println("Ingrese y1: ");
        this.y1=leer.nextDouble();
        System.out.println("Ingrese x2: ");
        this.x2=leer.nextDouble();
        System.out.println("Ingrese y2: ");
        this.y2=leer.nextDouble();
    }
    //otro metodo
    public double calcular(){
        double resultado;
        //x1-x2 al cuadrado + y1-y2 al cuadrado. Todo raiz cuadrada
        resultado=Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y2-y1, 2));
        
        return resultado;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author alanl
 */
public class CuentaBancariaServicio {

    Scanner leer = new Scanner(System.in);

    public CuentaBancaria crearCuenta() {
        int numeroCuenta;
        long dni;
        double saldoActual;
        System.out.println("Ingrese su numero de cuenta: ");
        numeroCuenta = leer.nextInt();
        System.out.println("Ingrese su dni: ");
        dni = leer.nextLong();
        return new CuentaBancaria(numeroCuenta,dni,0);
        
    }
    public void IngresarDinero(CuentaBancaria c) {
        double dineroActual;
        System.out.println("Ingresar la cantidad de dinero a ingresar: ");
        double dineroIngresar=leer.nextDouble();
        dineroActual=c.getSaldoActual();
        dineroActual=dineroActual+dineroIngresar;
        c.setSaldoActual(dineroActual);
    }

    public void retirarDinero(CuentaBancaria c) {
        double dineroActual;
        System.out.println("Ingrese la cantidad de dinero para retirar: ");
        double dineroRetirar = leer.nextDouble();
        dineroActual = c.getSaldoActual();
        if (dineroRetirar > dineroActual) {
            dineroRetirar = dineroActual;
            dineroActual = dineroActual - dineroRetirar;
            c.setSaldoActual(dineroActual);
            System.out.println("Usted no dispone de ese dinero. Retirando el maximo de su saldo: "+dineroRetirar);

        } else {
            dineroActual = dineroActual - dineroRetirar;
            c.setSaldoActual(dineroActual);
        }

    }
    public void consultarSaldo(CuentaBancaria c) {
        System.out.println("Su saldo actual es: "+c.getSaldoActual());
    }
        public void consultarDatos(CuentaBancaria c) {
        System.out.println("Dni: "+c.getDniCliente()+ "\n Numero de cuenta: "+c.getNumeroCuenta()+"\n  Su saldo actual es: "+c.getSaldoActual());
    }
}

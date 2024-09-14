/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.practica1;
import java.util.ArrayList;

/**
 *
 * @author Jose
 */

import java.util.Collections;

public class main {
    public static void main(String[] args) {
        // Crear un domicilio para el banco
         Domicilio bancoDomicilio = new Domicilio("Centro", 6547, "SUR", "Bogota", 7412589);
        
        // Crear el banco
        Banco banco = new Banco("Banco Mundial", bancoDomicilio, "AAA111", "32015489");
       
       
        // Crear domicilios y clientes
        Domicilio domicilioCliente1 = new Domicilio("Calle 20", 15, "Barrio Suba", "Bogota", 123456);
        Domicilio domicilioCliente2 = new Domicilio("Calle 40", 30, "Barrio Colina", "Bogota", 654321);

        
        Cliente cliente1 = new Cliente.Builder()
                .numero(3)
                .nombre("Jony sanchez")
                .domicilio(domicilioCliente1)
                .rfc("Jony12345RFC")
                .telefono("3250125551")
                .fechaNacimiento("05/08/1990")
                .build();
        
        Cliente cliente2 = new Cliente.Builder()
                .numero(1)
                .nombre("Marcela mora")
                .domicilio(domicilioCliente2)
                .rfc("Marcela123467RFC")
                .telefono("3052222255")
                .fechaNacimiento("07/03/1995")
                .build();
        
         Cliente cliente3 = new Cliente.Builder()
                .numero(2)
                .nombre("evan rosales")
                .domicilio(domicilioCliente1)
                .rfc("Evan54321RFC")
                .telefono("3105233534")
                .fechaNacimiento("03/09/2000")
                .build();
        

        // Agregar clientes al banco
        banco.agregarCliente(cliente1);
        banco.agregarCliente(cliente2);
        banco.agregarCliente(cliente3);

        // Crear cuentas para los clientes
        CuentaDeAhorros cuentaAhorros1 = new CuentaDeAhorros(1234, "08/07/2019", 7000.0, 0.05);
        CuentaDeCheque cuentaCheque1 = new CuentaDeCheque(4321, "01/09/2024", 4000.0, 60.0);
        cliente1.agregarCuenta(cuentaAhorros1);
        cliente1.agregarCuenta(cuentaCheque1);

        CuentaDeAhorros cuentaAhorros2 = new CuentaDeAhorros(12342, "08/05/2020", 20000.0, 0.08);
        CuentaDeCheque cuentaCheque2 = new CuentaDeCheque(43212, "01/07/2024", 6000.0, 85.0);
        cliente2.agregarCuenta(cuentaAhorros2);
        cliente2.agregarCuenta(cuentaCheque2);

        // Ordenar clientes por número
        ArrayList<Cliente> clientes = new ArrayList<>(banco.getClientes());
        Collections.sort(clientes);
        System.out.println("Clientes ordenados por numero:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

       System.out.println("Clientes ordenados con metodo Builder:");
        // Ordenar cuentas de un cliente por saldo
      //  ArrayList<Cuenta> cuentasCliente1 = new ArrayList<>(cliente1.obtenerCuentas());
      //  Collections.sort(cuentasCliente1);
      //  System.out.println("Cuentas de Pedro Loaisa ordenadas por saldo:");
      //  for (Cuenta cuenta : cuentasCliente1) {
       //     System.out.println(cuenta);
       // }
        //Imprimir clientes
        for (Cliente cliente : banco.getClientes()) {
            System.out.println(cliente);
        }
    }
}

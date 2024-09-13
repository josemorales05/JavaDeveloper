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

        Cliente cliente1 = new Cliente(1, "Jose Morales", domicilioCliente1, "Jose555RFC", "123456", "09/09/1993");
        Cliente cliente2 = new Cliente(2, "Angie Garcia", domicilioCliente2, "Angie4444RFC", "654321", "04/04/1995");
        Cliente cliente3 = new Cliente(3, "Pedro Loaisa", domicilioCliente1, "Pedro7890RFC", "541875", "11/11/1999");

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
        System.out.println("Clientes ordenados por número:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

        // Ordenar cuentas de un cliente por saldo
        ArrayList<Cuenta> cuentasCliente1 = new ArrayList<>(cliente1.obtenerCuentas());
        Collections.sort(cuentasCliente1);
        System.out.println("Cuentas de Pedro Loaisa ordenadas por saldo:");
        for (Cuenta cuenta : cuentasCliente1) {
            System.out.println(cuenta);
        }
    }
}

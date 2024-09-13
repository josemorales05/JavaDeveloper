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
        Cliente cliente2 = new Cliente(2, "Angie García", domicilioCliente2, "Angie4444RFC", "654321", "04/04/1995");

        // Agregar clientes al banco
        banco.agregarCliente(cliente1);
        banco.agregarCliente(cliente2);

        // Crear cuentas para los clientes
        CuentaDeAhorros cuentaAhorros1 = new CuentaDeAhorros(1234, "08/07/2019", 7000.0, 0.05);
        CuentaDeCheque cuentaCheque1 = new CuentaDeCheque(4321, "01/09/2024", 4000.0, 60.0);
        cliente1.agregarCuenta(cuentaAhorros1);
        cliente1.agregarCuenta(cuentaCheque1);

        // Operaciones con cuentas
        cliente1.abonarCuenta(1234, 2000.0); // Abonar a la cuenta de ahorros
        cliente1.retirar(4321, 500.0); // Retirar de la cuenta de cheques

        // Consultar información de los clientes
        Cliente clienteConsultado = banco.consultaCliente(1);
        System.out.println("Cliente consultado: " + clienteConsultado);

        // Mostrar cuentas después de las operaciones
        for (Cuenta cuenta : cliente1.obtenerCuentas()) {
            System.out.println(cuenta);
        }

        // Eliminar cliente
        banco.eliminarCliente(2);
        System.out.println("Clientes despues de eliminar a Angie Garcia: ");
        for (Cliente cliente : banco.obtenerClientes()) {
            System.out.println(cliente);
        }
    }
}

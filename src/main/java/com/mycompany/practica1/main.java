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
        
        // Crear domicilios para los clientes
        Domicilio domicilioCliente1 = new Domicilio("Calle 20", 15, "Barrio Suba", "Bogota", 123456);
        Domicilio domicilioCliente2 = new Domicilio("Calle 40", 30, "Barrio Colina", "Bogota", 654321);

        // Crear clientes
        Cliente cliente1 = new Cliente(1, "Jose Morales", domicilioCliente1, "Jose555RFC", "123456", "09/09/1993");
        Cliente cliente2 = new Cliente(2, "Angie García", domicilioCliente2, "Angie4444RFC", "654321", "04/04/1995");

        // Crear cuentas para los clientes
        CuentaDeAhorros cuentaAhorros1 = new CuentaDeAhorros(1234, "08/07/2019", 7000.0, 0.05);
        CuentaDeCheque cuentaCheque1 = new CuentaDeCheque(4321, "01/09/2024", 4000.0, 60.0);

        CuentaDeAhorros cuentaAhorros2 = new CuentaDeAhorros(1245, "01/05/2010", 30000.0, 0.07);
        CuentaDeCheque cuentaCheque2 = new CuentaDeCheque(6521, "01/04/2024", 9000.0, 45.0);

        // Asignar cuentas a los clientes
        cliente1.getCuentas().add(cuentaAhorros1);
        cliente1.getCuentas().add(cuentaCheque1);

        cliente2.getCuentas().add(cuentaAhorros2);
        cliente2.getCuentas().add(cuentaCheque2);

        // Agregar clientes al banco
        banco.getClientes().add(cliente1);
        banco.getClientes().add(cliente2);

        // Mostrar la información del banco, clientes y cuentas
        System.out.println(banco);

        for (Cliente cliente : banco.getClientes()) {
            System.out.println(cliente);
            for (Cuenta cuenta : cliente.getCuentas()) {
                System.out.println(cuenta);
            }
        }
    }
}


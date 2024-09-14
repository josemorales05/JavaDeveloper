/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.practica1;
import com.mycompany.practica1.InterfacesFuncionales.Interfaz1;
import com.mycompany.practica1.InterfacesFuncionales.Interfaz2;
import com.mycompany.practica1.InterfacesFuncionales.Interfaz3;
import com.mycompany.practica1.InterfacesFuncionales.Interfaz4;
import com.mycompany.practica1.InterfacesFuncionales.Interfaz5;
import com.mycompany.practica1.InterfacesFuncionales.Interfaz6;
import com.mycompany.practica1.InterfacesFuncionales.Interfaz7;
import com.mycompany.practica1.InterfacesFuncionales.Interfaz8;
import com.mycompany.practica1.InterfacesFuncionales.Interfaz9;
import com.mycompany.practica1.InterfacesFuncionales.Interfaz10;
import java.util.ArrayList;

/**
 *
 * @author Jose
 */

import java.util.Collections;

public class main {
    public static void main(String[] args) {
        // Crear un domicilio para el banco
   /*      Domicilio bancoDomicilio = new Domicilio("Centro", 6547, "SUR", "Bogota", 7412589);
        
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
        } */
    
      
        // 1. Interfaz1: Lambda que imprime los valores.
        Interfaz1 interfaz1 = (int a, String b, float c) -> {
            System.out.println("Interfaz1 - int: " + a + ", String: " + b + ", float: " + c);
        };
        interfaz1.metodo(5, "Hola Jose", 5.50f);
        
        // 2. Interfaz2: Lambda que retorna un objeto de tipo D (aquí usaremos Integer).
        Interfaz2<Integer, Integer, Integer, Integer> interfaz2 = (a, b, c) -> a + b + c;
        Integer resultado2 = interfaz2.metodo(2, 4, 6);
        System.out.println("Interfaz2 - Resultado: " + resultado2);
        
        // 3. Interfaz3: Lambda que concatena dos strings.
        Interfaz3 interfaz3 = (a, b) -> a + " " + b;
        String resultado3 = interfaz3.metodo("Adios", "Mundo");
        System.out.println("Interfaz3 - Resultado: " + resultado3);
        
        // 4. Interfaz4: Lambda sin parámetros ni retorno, solo imprime un mensaje.
        Interfaz4 interfaz4 = () -> System.out.println("Interfaz4 - No hay entrada ni salida.");
        interfaz4.metodo();
        
        // 5. Interfaz5: Lambda que multiplica dos enteros y retorna un Long.
        Interfaz5 interfaz5 = (a, b) -> (long) a * b;
        Long resultado5 = interfaz5.metodo(6, 10);
        System.out.println("Interfaz5 - Resultado: " + resultado5);
        
        // 6. Interfaz6: Lambda que suma Integer y Long, y retorna un Number.
        Interfaz6 interfaz6 = (a, b) -> a + b;
        Number resultado6 = interfaz6.metodo(5, 100L);
        System.out.println("Interfaz6 - Resultado: " + resultado6);
        
        // 7. Interfaz7: Lambda que concatena String con StringBuilder y retorna CharSequence.
        Interfaz7 interfaz7 = (a, b) -> a + b.toString();
        CharSequence resultado7 = interfaz7.metodo("Como Estas", new StringBuilder(" Mundo"));
        System.out.println("Interfaz7 - Resultado: " + resultado7);
        
        // 8. Interfaz8: Lambda sin entrada que retorna un Object (aquí retornaremos una cadena).
        Interfaz8 interfaz8 = () -> "Objeto retornado";
        Object resultado8 = interfaz8.metodo();
        System.out.println("Interfaz8 - Resultado: " + resultado8);
        
        // 9. Interfaz9: Lambda que compara dos objetos y retorna una cadena.
        Interfaz9 interfaz9 = (a, b) -> a.toString() + " y " + b.toString();
        String resultado9 = interfaz9.metodo("manzana", "Pera");
        System.out.println("Interfaz9 - Resultado: " + resultado9);
        
        // 10. Interfaz10: Lambda que construye una cadena a partir de int, char y float.
        Interfaz10 interfaz10 = (a, b, c) -> "Entero: " + a + ", Char: " + b + ", Float: " + c;
        String resultado10 = interfaz10.metodo(100, 'J', 10.0f);
        System.out.println("Interfaz10 - Resultado: " + resultado10);
    }
}

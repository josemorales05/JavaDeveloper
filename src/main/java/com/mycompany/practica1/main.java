/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.practica1;

/*import com.mycompany.practica1.InterfacesFuncionales.Interfaz1;
import com.mycompany.practica1.InterfacesFuncionales.Interfaz2;
import com.mycompany.practica1.InterfacesFuncionales.Interfaz3;
import com.mycompany.practica1.InterfacesFuncionales.Interfaz4;
import com.mycompany.practica1.InterfacesFuncionales.Interfaz5;
import com.mycompany.practica1.InterfacesFuncionales.Interfaz6;
import com.mycompany.practica1.InterfacesFuncionales.Interfaz7;
import com.mycompany.practica1.InterfacesFuncionales.Interfaz8;
import com.mycompany.practica1.InterfacesFuncionales.Interfaz9;
import com.mycompany.practica1.InterfacesFuncionales.Interfaz10;*/
import java.util.Collections;
import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author Jose
 */
public class main {

    public static void main(String[] args) {

         // Crear clientes
        Cliente cliente1 = new Cliente(1,"cliente 1",new Domicilio("calle 30",100,"bogota","estado 1",2133),"RFC2","554545",null,LocalDate.of(1991,6,21));
        Cliente cliente2 = new Cliente(2, "Cliente 2", new Domicilio("Calle 40", 200, "medellin", "Estado 2", 23456), "RFC2", "0987654321",null, LocalDate.of(1990, 6, 20));
        Cliente cliente3 = new Cliente(3, "Cliente 3", new Domicilio("Calle 50", 300, "Cali", "Estado 3", 34567), "RFC3", "1122334455",null, LocalDate.of(1975, 7, 25));

        // Leer cuentas desde el archivo y asignarlas a los clientes (simulado)
        List<Cuenta> cuentas = leerCuentasDesdeArchivo(); // Implementar método para leer cuentas como en el ejemplo anterior

        // Asignar cuentas a los clientes
        cliente1.getCuentas().add(cuentas.get(0)); // Ejemplo de asignación
        cliente2.getCuentas().add(cuentas.get(1)); // Asignar más cuentas a cada cliente
        cliente3.getCuentas().add(cuentas.get(2));

        // Mostrar clientes y cuentas
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
    }

  
    
     // Paso 2: Método para leer el archivo de cuentas y convertir fechas a LocalDate
    public static List<Cuenta> leerCuentasDesdeArchivo() {
        List<Cuenta> cuentas = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try (BufferedReader br = new BufferedReader(new FileReader("src\\main\\java\\Resource\\cuentas.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Asumimos que la línea está separada por comas
                String[] partes = linea.split(",");
                
                String tipoCuenta = partes[0];
                int numero = Integer.parseInt(partes[1]);
                LocalDate fechaApertura = LocalDate.parse(partes[2], formatter);
                double saldo = Double.parseDouble(partes[3]);

                // Si es Cuenta de Ahorros
                if (tipoCuenta.equals("CA")) {
                    double tasaInteresMensual = Double.parseDouble(partes[4]);
                    CuentaDeAhorros cuenta = new CuentaDeAhorros(numero, fechaApertura, saldo, null, tasaInteresMensual);
                    cuentas.add(cuenta);
                } 
                // Si es Cuenta de Cheque
                else if (tipoCuenta.equals("CC")) {
                    double costoManejoMensual = Double.parseDouble(partes[4]);
                    CuentaDeCheque cuenta = new CuentaDeCheque(numero, fechaApertura, saldo, null, costoManejoMensual);
                    cuentas.add(cuenta);
                }
            }
        } catch (IOException e) {
            System.out.println("Error leyendo el archivo de cuentas: " + e.getMessage());
        }

        return cuentas;
    }
}


/*      String tipoCuenta = datosCuenta[0];
                int numeroCuenta = Integer.parseInt(datosCuenta[1]);
                String fechaApertura = datosCuenta[2];
                double saldo = Double.parseDouble(datosCuenta[3]);
                double tasaOCosto = Double.parseDouble(datosCuenta[4]);
                int numeroCliente = Integer.parseInt(datosCuenta[5]);


                // Buscar el cliente por número
                Cliente cliente = clientes.stream()
                        .filter(c -> c.getNumero() == numeroCliente)
                        .findFirst()
                        .orElse(null);

                if (cliente != null) {
                    // Crear la cuenta correspondiente
                    Cuenta cuenta;
                    if (tipoCuenta.equals("CA")) {
                        cuenta = new CuentaDeAhorros(numeroCuenta, fechaApertura, saldo, tasaOCosto);
                    } else {
                        cuenta = new CuentaDeCheque(numeroCuenta, fechaApertura, saldo, tasaOCosto);
                    }

                    // Asignar la cuenta al cliente
                    cliente.agregarCuenta(cuenta);
                }
            }
        } catch (IOException e) {
            System.out.println("Error leyendo el archivo de cuentas: " + e.getMessage());
        }

        // Validar que cada cliente tenga las cuentas correctas
        System.out.println("Cuentas del cliente 1: " + cliente1.obtenerCuentas().length);
        System.out.println("Cuentas del cliente 2: " + cliente2.obtenerCuentas().length);
        System.out.println("Cuentas del cliente 3: " + cliente3.obtenerCuentas().length);

        // Imprimir las cuentas de cada cliente
        imprimirCuentasCliente(cliente1);
        imprimirCuentasCliente(cliente2);
        imprimirCuentasCliente(cliente3);
    }

    // Método para imprimir las cuentas de un cliente
    public static void imprimirCuentasCliente(Cliente cliente) {
        System.out.println("Cuentas del cliente " + cliente.getNombre() + ":");
        for (Cuenta cuenta : cliente.obtenerCuentas()) {
            System.out.println(cuenta.toString());
        }
    }   */
 /*   // Crear un domicilio para el banco
        Domicilio bancoDomicilio = new Domicilio("Centro", 6547, "SUR", "Bogota", 7412589);

        // Crear el banco
        Banco banco = new Banco("Banco Mundial", bancoDomicilio, "AAA111", "32015489");

        // Crear domicilios y clientes
        Domicilio domicilioCliente1 = new Domicilio("Calle 50", 15, "Barrio Suba", "Bogota", 123456);
        Domicilio domicilioCliente2 = new Domicilio("Calle 80", 30, "Barrio Colina", "Bogota", 654321);

        //Agregar Clientes
        Cliente cliente1 = new Cliente(1, "Jose Morales", domicilioCliente1, "JOSE321RFC", "32154", new ArrayList<>(), "08/09/2000");
        Cliente cliente2 = new Cliente(2, "Angie Montoya", domicilioCliente2, "ANGIE987RFC", "31245", new ArrayList<>(), "02/10/2002");

        // Agregar clientes al banco
        banco.agregarCliente(cliente1);
        banco.agregarCliente(cliente2);

        // Agregar cuentas a los clientes
        cliente1.agregarCuenta(new CuentaDeAhorros(123, "02/07/2020", 5000, 0.08));
        cliente2.agregarCuenta(new CuentaDeCheque(321, "05/08/2022", 1000, 10.0));

        // Probar consulta de cliente por número usando Stream
        Cliente clienteConsultado = banco.consultaCliente(1);
        System.out.println("Cliente consultado: " + clienteConsultado.getNombre());

        // Probar abonar en una cuenta usando Stream
        cliente1.abonarCuenta(123, 2000);
        System.out.println("Nuevo saldo cuenta 123: " + cliente1.obtenerCuentas()[0].getSaldo());

        // Probar retiro en una cuenta usando Stream
        cliente2.retirar(321, 800);
        System.out.println("Nuevo saldo cuenta 321: " + cliente2.obtenerCuentas()[0].getSaldo());

        // Buscar cliente por RFC usando Stream
        Cliente clientePorRFC = banco.buscarClientePorRFC("JOSE321RFC");
        System.out.println("Cliente encontrado por RFC: " + clientePorRFC.getNombre());
    }
}

// 1. Interfaz1: Lambda que imprime los valores.
/*   Interfaz1 interfaz1 = (int a, String b, float c) -> {
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
}*/

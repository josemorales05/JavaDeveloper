/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
/**
 *
 * @author Jose
 */



public class CuentasArchivoCallable implements Callable<List<Cuenta>> {

    @Override
    public List<Cuenta> call() throws Exception {
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

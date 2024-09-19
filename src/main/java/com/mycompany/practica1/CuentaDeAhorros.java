/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Jose
 */
public class CuentaDeAhorros extends Cuenta {

    private double tasaInteresMensual;

    public CuentaDeAhorros(int numero, LocalDate fechaApertura, double saldo, LocalDate fechaCancelacion,double tasaInteresMensual) {
        super(numero, fechaApertura, saldo, fechaCancelacion);
        this.tasaInteresMensual = tasaInteresMensual;
    }

    public double getTasaInteresMensual() {
        return tasaInteresMensual;
    }

    public void setTasaInteresMensual(double tasaInteresMensual) {
        this.tasaInteresMensual = tasaInteresMensual;
    }

  


    public double calcularInteres() {
        return saldo * tasaInteresMensual;
    }

    @Override
    public String toString() {
        return "CuentaDeAhorros{" + "tasaInteresMensual=" + tasaInteresMensual + '}';
    }

   

   

}

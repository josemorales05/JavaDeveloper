/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuentas;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author Jose
 */
public abstract class Cuenta {

    protected int numero;
    protected LocalDate fechaApertura;
    protected double saldo;
    protected LocalDate fechaCancelacion;

    public Cuenta(int numero, LocalDate fechaApertura, double saldo, LocalDate fechaCancelacion) {
        this.numero = numero;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
        this.fechaCancelacion = fechaCancelacion;
    }

   
     // Implementación de compareTo para ordenar por saldo
    public int compareTo(Cuenta otraCuenta) {
        return Double.compare(this.saldo, otraCuenta.getSaldo());
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public LocalDate getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(LocalDate fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numero=" + numero +
                ", fechaApertura=" + fechaApertura +
                ", saldo=" + saldo +
                ", fechaCancelacion=" + fechaCancelacion +
                '}';
    } 

}
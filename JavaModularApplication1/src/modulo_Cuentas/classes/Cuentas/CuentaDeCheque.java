/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuentas;
import Cuentas.Cuenta;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author Jose
 */
public class CuentaDeCheque extends Cuenta {
    private double costoManejoMensual;

    public CuentaDeCheque(int numero, LocalDate fechaApertura, double saldo, LocalDate fechaCancelacion,double costoManejoMensual) {
        super(numero, fechaApertura, saldo, null);
        this.costoManejoMensual = costoManejoMensual;
    }

    public double getCostoManejoMensual() {
        return costoManejoMensual;
    }

    public void setCostoManejoMensual(double costoManejoMensual) {
        this.costoManejoMensual = costoManejoMensual;
    }

    @Override
    public String toString() {
        return "CuentaDeCheque{" +
                "numero=" + getNumero() + // Llamada al método heredado para obtener el número
                ", fechaApertura=" + getFechaApertura() + // Llamada al método heredado para obtener la fecha de apertura
                ", saldo=" + getSaldo() + // Llamada al método heredado para obtener el saldo
                ", costoManejoMensual=" + costoManejoMensual +
                '}';
    } 
}


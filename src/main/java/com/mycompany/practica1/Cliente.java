/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1;

import java.util.ArrayList;

/**
 *
 * @author Jose
 */
public class Cliente implements Comparable<Cliente> {

    private int numero;
    private String nombre;
    private Domicilio domicilio;
    private String rfc;
    private String telefono;
    private ArrayList<Cuenta> cuentas;
    private String fechaNacimiento;

    public Cliente(int numero, String nombre, Domicilio domicilio, String rfc, String telefono, String fechaNacimiento) {
        this.numero = numero;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.rfc = rfc;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.cuentas = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Cliente{"
                + "numero=" + numero
                + ", nombre='" + nombre + '\''
                + ", domicilio=" + domicilio
                + ", rfc='" + rfc + '\''
                + ", telefono='" + telefono + '\''
                + ", fechaNacimiento='" + fechaNacimiento + '\''
                + '}';
    }

    public boolean agregarCuenta(Cuenta cuenta) {
        return cuentas.add(cuenta);
    }

   
    public boolean cancelarCuenta(int numero) {
        return cuentas.removeIf(cuenta -> cuenta.getNumero() == numero);
    }

    
    public void abonarCuenta(int numero, double abono) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumero() == numero) {
                cuenta.setSaldo(cuenta.getSaldo() + abono);
                return;
            }
        }
    }

   
    public void retirar(int numero, double retiro) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumero() == numero) {
                cuenta.setSaldo(cuenta.getSaldo() - retiro);
                return;
            }
        }
    }

    
    public ArrayList<Cuenta> obtenerCuentas() {
        return cuentas;
    }

    // Implementación de compareTo para ordenar por número de cliente
    @Override
    public int compareTo(Cliente otroCliente) {
        return Integer.compare(this.numero, otroCliente.getNumero());
    }
}

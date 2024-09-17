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
public class Cliente implements ServicioCuentas {

    private int numero;
    private String nombre;
    private Domicilio domicilio;
    private String rfc;
    private String telefono;
    private ArrayList<Cuenta> cuentas;
    private String fechaNacimiento;

    public Cliente(int numero, String nombre, Domicilio domicilio, String rfc, String telefono, ArrayList<Cuenta> cuentas, String fechaNacimiento) {
        this.numero = numero;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.rfc = rfc;
        this.telefono = telefono;
        this.cuentas = cuentas;
        this.fechaNacimiento = fechaNacimiento;
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

        @Override
        public boolean agregarCuenta(Cuenta cuenta) {
        return cuentas.add(cuenta);
        }

        @Override
        public boolean cancelarCuenta(int numero) {
        return cuentas.removeIf(cuenta -> cuenta.getNumero() == numero);
        }

        @Override
        public void abonarCuenta(int numero, double abono) {
        cuentas.stream()
                    .filter(cuenta -> cuenta.getNumero() == numero)
                    .findFirst()
                    .ifPresent(cuenta -> cuenta.setSaldo(cuenta.getSaldo() + abono));
        }

        @Override
        public void retirar(int numero, double retiro) {
        cuentas.stream()
                    .filter(cuenta -> cuenta.getNumero() == numero)
                    .findFirst()
                    .ifPresent(cuenta -> cuenta.setSaldo(cuenta.getSaldo() - retiro));
        }

        @Override
        public Cuenta[] obtenerCuentas() {
        return cuentas.toArray(new Cuenta[0]);
        }
}



        // Constructor privado para obligar a usar el patrón Builder
        /*   private Cliente(Builder builder) {
        this.numero = builder.numero;
        this.nombre = builder.nombre;
        this.domicilio = builder.domicilio;
        this.rfc = builder.rfc;
        this.telefono = builder.telefono;
        this.fechaNacimiento = builder.fechaNacimiento;
        this.cuentas = new ArrayList<>();

    }
    
    //Metodo Getter para numero
    public int getNumero(){
        return numero;
    }
    public String getRfc() {
        return rfc;
    }
    
    // Método para obtener las cuentas del cliente
    public ArrayList<Cuenta> obtenerCuentas() {
        return cuentas;
    }

    // Método para agregar una cuenta al cliente
    public void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    // Implementación de compareTo para ordenar por número de cliente
    @Override
    public int compareTo(Cliente otroCliente) {
        return Integer.compare(this.numero, otroCliente.getNumero());
    }

    // Clase interna estática Builder
    public static class Builder {
        private int numero;
        private String nombre;
        private Domicilio domicilio;
        private String rfc;
        private String telefono;
        private String fechaNacimiento;

        
        
        // Métodos que devuelven el Builder con los atributos configurados

        public Builder numero(int numero) {
            this.numero = numero;
            return this;
        }

        public Builder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder domicilio(Domicilio domicilio) {
            this.domicilio = domicilio;
            return this;
        }

        public Builder rfc(String rfc) {
            this.rfc = rfc;
            return this;
        }

        public Builder telefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public Builder fechaNacimiento(String fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
            return this;
        }

        // Método final que crea y retorna un objeto Cliente
        public Cliente build() {
            return new Cliente(this);
        }
    }
}*/

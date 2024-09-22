package Cliente;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import Cuentas.Cuenta;
import ServicioCuentas.ServicioCuentas;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
    private LocalDate fechaNacimiento;

    public Cliente(int numero, String nombre, Domicilio domicilio, String rfc, String telefono, ArrayList<Cuenta> cuentas, LocalDate fechaNacimiento) {
        this.numero = numero;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.rfc = rfc;
        this.telefono = telefono;
        this.cuentas = new ArrayList<>();
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Cliente{" + "numero=" + numero + ", nombre=" + nombre + ", domicilio=" + domicilio + ", rfc=" + rfc + ", telefono=" + telefono + ", cuentas=" + cuentas + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

    @Override
    public boolean agregarCuenta(Cuenta cuenta) {
        return cuentas.add(cuenta);
    }

    @Override
    public boolean cancelarCuenta(int numero) {
        return cuentas.parallelStream() // Usando un Stream paralelo
                .filter(c -> c.getNumero() == numero)
                .findFirst()
                .map(cuentas::remove)
                .orElse(false);
    }

    @Override
    public void abonarCuenta(int numero, double abono) {
        cuentas.parallelStream() // Usando un Stream paralelo
                .filter(c -> c.getNumero() == numero)
                .findFirst()
                .ifPresent(c -> c.setSaldo(c.getSaldo() + abono));
    }

    @Override
    public void retirar(int numero, double retiro) {
        cuentas.parallelStream() // Usando un Stream paralelo
                .filter(c -> c.getNumero() == numero)
                .findFirst()
                .ifPresent(c -> c.setSaldo(c.getSaldo() - retiro));
    }

    @Override
    public Cuenta[] obtenerCuentas() {
        return cuentas.parallelStream() // Usando un Stream paralelo
                .toArray(Cuenta[]::new);
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

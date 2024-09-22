

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;


import Cliente.Cliente;
import Cliente.Domicilio;
import Cliente.ServicioClientes;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Jose
 */


public class Banco implements ServicioClientes {

    private String nombre;
    private Domicilio domicilio;
    private String rfc;
    private String telefono;
    private ArrayList<Cliente> clientes;

    public Banco(String nombre, Domicilio domicilio, String rfc, String telefono) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.rfc = rfc;
        this.telefono = telefono;
        this.clientes = new ArrayList<>();
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

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Banco{"
                + "nombre='" + nombre + '\''
                + ", domicilio=" + domicilio
                + ", rfc='" + rfc + '\''
                + ", telefono='" + telefono + '\''
                + '}';
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        return clientes.add(cliente);
    }

    @Override
    public boolean eliminarCliente(int numero) {
        return clientes.parallelStream() // Usando un Stream paralelo
                .filter(c -> c.getNumero() == numero)
                .findFirst()
                .map(clientes::remove)
                .orElse(false);
    }

    @Override
    public Cliente consultaCliente(int numero) {
        return clientes.parallelStream() // Usando un Stream paralelo
                .filter(c -> c.getNumero() == numero)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Cliente[] obtenerClientes() {
        return clientes.parallelStream() // Usando un Stream paralelo
                .toArray(Cliente[]::new);
    }
        
    @Override
    public Cliente buscarClientePorRFC(String rfc) {
        return clientes.parallelStream() // Usando un Stream paralelo
                .filter(c -> c.getRfc().equals(rfc))
                .findFirst()
                .orElse(null);
    }

}

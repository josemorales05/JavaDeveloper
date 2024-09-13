/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.practica1;

/**
 *
 * @author Jose
 */
public interface ServicioClientes {
    boolean agregarCliente(Cliente cliente);
    boolean eliminarCliente(int numero);
    Cliente consultaCliente(int numero);
    Cliente[] obtenerClientes();
    Cliente buscarClientePorRFC(String rfc);
}

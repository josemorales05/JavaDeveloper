/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ServicioCuentas;

import Cuentas.Cuenta;

/**
 *
 * @author Jose
 */
public interface ServicioCuentas {
    boolean agregarCuenta(Cuenta cuenta);
    boolean cancelarCuenta(int numero);
    void abonarCuenta(int numero, double abono);
    void retirar(int numero, double retiro);
    Cuenta[] obtenerCuentas();
}


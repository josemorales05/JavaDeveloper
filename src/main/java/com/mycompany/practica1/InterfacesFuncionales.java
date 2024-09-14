/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.practica1;

/**
 *
 * @author Jose
 */
public interface InterfacesFuncionales {
    
    // 1. Interfaz1: Entrada int a, String b, float c. Salida: void.
@FunctionalInterface
interface Interfaz1 {
    void metodo(int a, String b, float c);
}

// 2. Interfaz2: Entrada A a, B b, C c. Salida: D.
@FunctionalInterface
interface Interfaz2<A, B, C, D> {
    D metodo(A a, B b, C c);
}

// 3. Interfaz3: Entrada String a, String b. Salida: String.
@FunctionalInterface
interface Interfaz3 {
    String metodo(String a, String b);
}

// 4. Interfaz4: Sin entrada. Salida: void.
@FunctionalInterface
interface Interfaz4 {
    void metodo();
}

// 5. Interfaz5: Entrada int a, int b. Salida: Long.
@FunctionalInterface
interface Interfaz5 {
    Long metodo(int a, int b);
}

// 6. Interfaz6: Entrada Integer a, Long b. Salida: Number.
@FunctionalInterface
interface Interfaz6 {
    Number metodo(Integer a, Long b);
}

// 7. Interfaz7: Entrada String a, StringBuilder b. Salida: CharSequence.
@FunctionalInterface
interface Interfaz7 {
    CharSequence metodo(String a, StringBuilder b);
}

// 8. Interfaz8: Sin entrada. Salida: Object.
@FunctionalInterface
interface Interfaz8 {
    Object metodo();
}

// 9. Interfaz9: Entrada Object a, Object b. Salida: String.
@FunctionalInterface
interface Interfaz9 {
    String metodo(Object a, Object b);
}

// 10. Interfaz10: Entrada int a, char b, float c. Salida: String.
@FunctionalInterface
interface Interfaz10 {
    String metodo(int a, char b, float c);
}

}

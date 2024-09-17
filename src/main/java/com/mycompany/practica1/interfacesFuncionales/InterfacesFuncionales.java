/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1.interfacesFuncionales;
import java.util.function.*;
import java.util.concurrent.Callable;

/**
 *
 * @author Jose
 */
public class InterfacesFuncionales {
    
    public static void main(String[] args) throws Exception {
        
        // 1. Predicate: acepta un argumento y devuelve un booleano
        Predicate<Integer> esMayorQueCuatro = x -> x > 4;
        System.out.println("10 es mayor que 4? " + esMayorQueCuatro.test(10));

        // 2. Function: acepta un argumento y devuelve un valor de otro tipo
        Function<String, Integer> longitudCadena = s -> s.length();
        System.out.println("Longitud de 'Jose': " + longitudCadena.apply("Jose"));

        // 3. Consumer: acepta un argumento pero no devuelve nada
        Consumer<String> imprimirMensaje = mensaje -> System.out.println("Mensaje: " + mensaje);
        imprimirMensaje.accept("Curso, Java");

        // 4. Supplier: no acepta argumentos y devuelve un valor
        Supplier<Double> generarAleatorio = () -> Math.random();
        System.out.println("Numero aleatorio: " + generarAleatorio.get());

        // 5. BiFunction: acepta dos argumentos y devuelve un valor
        BiFunction<Integer, Integer, Integer> sumar = (a, b) -> a + b;
        System.out.println("Suma de 12 y 8: " + sumar.apply(12, 8));

        // 6. BiConsumer: acepta dos argumentos y no devuelve valor
        BiConsumer<String, Integer> mostrarNombreYEdad = (nombre, edad) -> 
            System.out.println(nombre + " tiene " + edad + " años.");
        mostrarNombreYEdad.accept("Jose", 31);

        // 7. UnaryOperator: acepta un argumento y devuelve un valor del mismo tipo
        UnaryOperator<Integer> duplicar = n -> n * 2;
        System.out.println("El doble de 12 es: " + duplicar.apply(12));

        // 8. BinaryOperator: acepta dos argumentos del mismo tipo y devuelve un valor del mismo tipo
        BinaryOperator<Integer> multiplicar = (a, b) -> a * b;
        System.out.println("Multiplicacion de 9 por 9: " + multiplicar.apply(9, 9));

        // 9. Runnable: no acepta argumentos ni devuelve un valor
        Runnable imprimirMensajeRunnable = () -> System.out.println("Esto es un Runnable ejecutandose");
        imprimirMensajeRunnable.run();

        // 10. Callable: no acepta argumentos pero devuelve un valor
        Callable<Integer> devolverNumero = () -> 50;
        System.out.println("Esto devuelve: " + devolverNumero.call());
    }
}


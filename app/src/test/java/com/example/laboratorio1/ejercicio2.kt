package com.example.laboratorio1

import org.junit.Test

// Ejercicio 2:
data class Calculadora(val marca: String, val anios: Int, val precio: Double){
    fun sumar(a: Double, b: Double): Double{
        return a+b
    }

    fun restar(a: Double, b: Double): Double{
        return a-b
    }

    fun multiplicar(a: Double, b: Double): Double{
        return a*b
    }

    fun division(a: Double, b: Double): Unit{
        if(b==0.0){
            println("Debes introducir un numero distinto de cero. ")
        } else {
            println("El resultado de la division es: " + a/b)
        }
    }
}

class ejercicio2 {
    @Test
    fun main() {
        val calculadora = Calculadora("Samsung", 2, 500.0)
        //dejar estatico todo colocando los datos de forma directa
        println("Datos de la calculadora a venderse: \n" +
                "Marca: " + calculadora.marca + "\n" +
                "Anios de vida: " + calculadora.anios + "\n" +
                "Precio: " + calculadora.precio + "\n")

        println("Utilizando las funcionalidades de la calculadora: ")

        println("Sumatoria: " + calculadora.sumar(5.5, 1.0) + "\n")
        println("Diferencia: " + calculadora.restar(4.0, 9.5)+ "\n")
        println("Multiplicacion: " + calculadora.multiplicar(5.0, 10.0) + "\n")
        calculadora.division(5.0, 10.0)
        calculadora.division(2.0, 0.0)
    }
}

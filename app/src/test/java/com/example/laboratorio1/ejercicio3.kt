package com.example.laboratorio1

import org.junit.Test

//EJERCICIO 3:
data class Estudiante(val nombre: String,
                      val carnet: String,
                      val asignatura: String)

class ejercicio3 {
    @Test
    fun listaEstudiantes() {
        val Ciclo01 = listOf(
            Estudiante("Juan Pérez", "00826523", "Programacion de Dispositivos Moviles"),
            Estudiante("María García", "2000628", "Programacion de Dispositivos Moviles"),
            Estudiante("Carlos López", "0266561312", "Programacion de Dispositivos Moviles"),
            Estudiante("Ana Rodríguez", "2135123", "Analisis numerico"),
            Estudiante("Pedro Martínez", "00005625", "Analisis numerico"),
            Estudiante("Laura Sánchez", "005354121", "Analisis numerico"),
            Estudiante("Miguel Torres", "002335121", "Analisis numerico")
        )

        val estudiantesMoviles = Ciclo01.filter { it.asignatura == "Programacion de Dispositivos Moviles" }

        println("Estudiantes en Programacion de Dispositivos Moviles:")
        estudiantesMoviles.forEach { println("${it.nombre} - ${it.carnet}") }
    }
}
package com.example.laboratorio1

import org.junit.Test

//Ejercicio 1:

data class Computadora(var ram: Int = 0,
                       var memoria: Int = 0,
                       var sistemaOperativo: String = "",
                       var encendido: Boolean = true){

        fun encender() {
            if (!encendido) {
                encendido = true
                println("Iniciando sistema, la computadora está encendida.\n")
            } else {
                println("La computadora ya estaba encendida.\n")
            }
        }

        fun apagar() {
            if (encendido) {
                encendido = false
                println("Cerrando sesion, la computadora se ha apagado.\n")
            } else {
                println("La computadora ya estaba apagada.\n")
            }
        }

    fun actualizarCampos(ramNueva: Int, memoriaNueva: Int, sistemaOperativoNuevo: String){
        ram = ramNueva;
        memoria = memoriaNueva;
        sistemaOperativo = sistemaOperativoNuevo;

        println("Los campos han sido actualizados con exito!")
        println("Ram: $ram \nMemoria: $memoria \nSistema operativo: $sistemaOperativo \n")
    }
}


class ejercicio1{
    @Test
    fun main(){

        val compu = Computadora(16, 512, "Windows 10")

        println("Ram:" + compu.ram + "\nMemoria:" + compu.memoria + "\nSistema operativo:" + compu.sistemaOperativo + "\n")

        compu.encender()
        compu.apagar()
        compu.actualizarCampos(8, 256, "Windows 11")
        val programasInstalados = listOf(
            "Notion 2026",
            "VS Code 2026",
            "Spotify 2023",
            "Facebook 2024",
            "Photoshop 2025",
            "Zoom 2026",
            "Excel 2021")

        val añoActual = programasInstalados.filter{it.contains("2026")}

        println("Aplicaciones del anio 2026" + añoActual)
    }
}
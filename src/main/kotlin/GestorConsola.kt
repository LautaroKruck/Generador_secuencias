package org.example

class GestorConsola : IEntradaSalida {
    override fun mostrar(msj: String) {
        println(msj)
    }

    override fun recibir(msj: String): Int {
        println(msj)
        while (true) {
            val num = readLine()?.toIntOrNull()
            if (num != null) {
                return num
            } else {
                println("¡Eso no es un número entero! Inténtalo de nuevo:")
            }
        }
    }
}
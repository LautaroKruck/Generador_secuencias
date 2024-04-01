package org.example

abstract class GestorConsola : IEntradaSalida{
    override fun mostrar(msj: String) {
        println(msj)
    }

    override fun recibir(msj: String): Int {
        val num: Int?
        print("Introduce un número entero: ")
        num = readLine()?.toIntOrNull()
        if (num != null) {
            return $num
        } else {
            println("¡Eso no es un número entero!")
        }
    }
}
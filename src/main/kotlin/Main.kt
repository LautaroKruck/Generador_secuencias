package org.example

fun main() {
    val consola = GestorConsola()
    val genSecuencias = GeneradorSecuencias(consola)

    consola.mostrar("Introduce el número de líneas para la secuencia incremental:")
    val nIncremental = consola.recibir("")

    consola.mostrar("Generando secuencia incremental:")
    genSecuencias.fraseIncremental(nIncremental)

    consola.mostrar("Introduce el número de líneas para la secuencia final:")
    val nFinal = consola.recibir("")

    consola.mostrar("Generando secuencia final:")
    genSecuencias.fraseFinal(nFinal)
}

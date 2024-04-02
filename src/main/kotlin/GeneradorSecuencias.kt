package org.example

class GeneradorSecuencias (private val info: IEntradaSalida){
    private lateinit var sec : Sequence<String>

    private fun lineSequence(limit: Int = Int.MAX_VALUE) =
        generateSequence { readLine() }.constrainOnce().take(limit)

    fun fraseIncremental(n: Int) {
        sec = lineSequence(n)
        sec.forEach { linea ->
            info.mostrar(linea)
        }
    }

    fun fraseFinal(n: Int) {
        sec = lineSequence(n)
        info.mostrar(sec.joinToString(" "))
    }

    private fun getSec(): String {
        if (::sec.isInitialized) {
            return sec.joinToString(" ")
        } else {
            throw UninitializedPropertyAccessException("La secuencia 'sec' no ha sido inicializada.")
        }
    }

    private fun mostrarSec() {
        info.mostrar(getSec())
    }

}
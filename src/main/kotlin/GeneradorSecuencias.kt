package org.example

class GeneradorSecuencias (private val info: IEntradaSalida){
    private lateinit var sec : Sequence<String>

    private fun lineSequence(limit: Int = Int.MAX_VALUE) =
        generateSequence { readLine() }.constrainOnce().take(limit)

    private fun fraseIncremental() {
        sec = (lineSequence(info.recibir()))
    }

    private fun fraseFinal() {

    }

    private fun getSec() {

    }

    private fun mostrarSec() {

    }

}
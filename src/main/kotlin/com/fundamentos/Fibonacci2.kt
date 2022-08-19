package com.fundamentos

class Fibonacci2() {

    fun calculaSeq(termo: Int): Int{
        var termoA = 0
        var termoB = 1
        var resultado = 0
        var indice = 0

        while (indice < termo){
            resultado = termoA + termoB
            termoA = termoB
            termoB = resultado
            indice++

        }
        return resultado
    }
}
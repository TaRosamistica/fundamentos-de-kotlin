package fundamentos

class Carro(var cor: String, val anoDeFabricacao: String, val proprietario: Proprietario){
}

data class Proprietario(var nome: String, var idade: Int){

}

fun main(){
    var carro = Carro("branco", "2021", Proprietario("Gustavo", 26))
    println(carro.cor)

    carro.cor = "preto"
    println(carro.cor)

    println(carro.proprietario.nome)

    carro.proprietario.nome = "Talita"
    println(carro.proprietario)
}
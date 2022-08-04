package fundamentos

class Pessoa (var nome: String, var idade: Int) {
    override fun toString(): String {
        return "Classe: Pessoa, Nome: ${nome}, idade:  ${idade} "
    }
}

fun main (){
    var talita = Pessoa("Talita", 33)
    println(talita)
}
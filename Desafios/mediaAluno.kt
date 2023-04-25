fun main() {
    val nota = 6.5 //Nota do Aluno
    val bomComportamento = false //Comportamento do Aluno
    val passouPorMedia = nota >= 7 //Guarda o resultado da verificação se a Nota do Aluno é maior ou igual a 7

    val s = if (bomComportamento) "Sim" else "Não" //Converte o valor da variável "bomComportamento" em String

    val n = if (passouPorMedia) "Sim" else "Não" //Converte o valor da variável "passouPorMedia" em String

    println("Tem bom comportamento? $s")
    println("Qual foi sua nota? $nota")
    println("A média para passar é = 7")
    println("O aluno passou? $n")
}

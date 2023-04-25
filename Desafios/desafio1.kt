import kotlin.math.pow

fun main() {
    val numB = (1 - 5) * (2 - 7)
    val resultB = numB.toDouble().pow(2)
    val denB = 2
    val rdenB = denB.toDouble().pow(2)

    val numA = 6 * (3 + 2)
    val denA = 3 * 2

    val superiorA = numA / denA
    val superiorB = numB.toDouble().pow(2) / denB

    val superior = (superiorA - superiorB).pow(3)
    val inferior = 10.toDouble().pow(3)

    // Formula
    println("( ${numA}² - (${numB})² )³")
    println("  _____________   ____________")
    println("        $denA                $denB")
    println("____________________________________________")
    println("                 "+"10³")
    println("\n")

    // Resolução part1
    println("(    $numA      - (${numB})²)³")
    println("  ____________   ____________")
    println("        $denA                $denB")
    println("  __________________________")
    println("               "+"10³")
    println("\n")

    // Resolução part2
    println("(    $numA      -  $resultB   )³")
    println("  ____________   ____________")
    println("        $denA                $rdenB")
    println("  __________________________")
    println("               "+"10³")
    println("\n")

    // Resolução part3
    println("( $superiorA - $superiorB )³")
    println("  _____________")
    println("      $inferior")
    println("\n")

    // Resolução part4
    val resultado = superior / inferior
    println("    $superior")
    println("  _____________")
    println("      $inferior")
    println("\n")

    // Resultado
    println("O resultado é: $resultado")
}

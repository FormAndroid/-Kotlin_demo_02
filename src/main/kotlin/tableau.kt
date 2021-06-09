fun main(args: Array<String>) {

    val tableau: Array<String> = arrayOf("Riri", "Fifi", "Loulou")

    // Operation de lecture
    val val1: String = tableau[1]
    println(val1)

    // Operation d'ecriture
    tableau[2] = "Zaza"
    tableau.set(2, "Zaza")

    // Le toString d'un tableau -> "[Ljava.lang.String;@610455d6"
    println(tableau)

    // Affichage à l'aide d'un boucle
    for(indice: Int in 0 until tableau.size) {
        print("$indice: ${tableau[indice]} > ")
    }
    println()

    for(indice: Int in tableau.indices) {
        val element: String = tableau[indice]
        print("$element > ")
    }
    println()

    for(element: String in tableau) {
        print("$element > ")
    }
    println()

    println(tableau.joinToString(" > "))
}
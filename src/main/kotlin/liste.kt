fun main() {

    val maList: MutableList<Int> = mutableListOf(5, 2, 3, 4, 1)
    maList.add(4)
    maList.add(2)

    maList.removeAt(2)
    println(maList)             // -> [5, 2, 4, 1, 4, 2]

    maList.remove(4)
    println(maList)             // -> [5, 2, 1 , 4, 2]

    maList.removeIf { v -> v == 2 }
    println(maList)             // -> [5, 1 , 4]


    // Création d'une liste non mutable sur base de la liste
    val copy = listOf(maList)
}
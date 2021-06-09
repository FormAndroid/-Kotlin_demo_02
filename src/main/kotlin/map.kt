fun main() {

    val dico: Map<String, String> = mapOf(
        "za" to "Zaza Vanderquack",
        "ri" to "Riri Duck",
        "fi" to "Fifi Duck",
        "ri" to "Marie"     // En cas de valeur dupliqué => La derniere est prise
    )

    // Récuperer une valeur
    val name1 = dico["za"]
    println(name1)

    val name2 = dico["ri"]
    println(name2)


    // Afficher les valeurs
    println(dico)

    // Savoir qu'une clef est présente
    val hasZaza = dico.containsKey("za")

    // Créer une liste sur base des valeurs
    val mesValeurs: List<String> = dico.values.toList()
    println(mesValeurs)


    //------------------------------------------------------------


    val mutableMap: MutableMap<String, String> = mutableMapOf(
        "za" to "Zaza Vanderquack",
        "ri" to "Riri Duck",
        "fi" to "Fifi Duck",
        "ma" to "Marie"
    )

    // Ajouter un element
    mutableMap.put("to", "Toto")
    mutableMap["to"] = "Toto"

    mutableMap.putIfAbsent("ma", "Test")


    // Affichage de la map
    println(mutableMap)
    println()


    // Obtenir une valeur
    val v1: String? = mutableMap.get("za")
    val v2: String? = mutableMap["za"]

    val v3: String = mutableMap.getOrDefault("te", "Test")

    if (mutableMap.containsKey("te")) {
        val v4: String = mutableMap["te"]!!
    }


    // Ajouter une valeur sur clef existante
    println(mutableMap)
    mutableMap["to"] = "Gabriel"    // Change la valeur de force
    println(mutableMap)


    // Met a jours une valeur (si la clef exist)
    mutableMap.replace("si",  "Hello")

    // Met a jours une valeur (si la clef exist et que la valeur est correct)
    mutableMap.replace("ma", "Pomme", "Hello")


    println(mutableMap)
}
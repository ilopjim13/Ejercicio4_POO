
fun main() {
    val coche1 = Coche("Rojo","audi","R8",300,3,"1234567")
    println(coche1)

    try {
        val coche2 = Coche("azul", "hola", null, 469, 5, "HolaJ65")
    } catch (e: Exception) {
        println(e.message)
    }

    try {
        val coche3 = Coche("Blanco", "BWM", "308", 50, 3, "NoCe780")
    } catch (e: Exception) {
        println(e.message)
    }

    try {
        val coche4 = Coche("Negro", "BWM", "309", 550, 1, "XD433XD")
    } catch (e: Exception) {
        println(e.message)
    }

    try {
        val coche5 = Coche("Amarillo", "BWM", "209", 550, 4, "TAMAL")
    } catch (e: Exception) {
        println(e.message)
    }

    try {
        val coche6 = Coche("", "BWM", "209", null, null, "1234567")
    } catch (e: Exception) {
        println(e.message)
    }

}
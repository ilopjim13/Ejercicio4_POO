
fun main() {
    val coche1 = Coche("","","",300,3,"")

    try {
        print("Introduce el color del coche: ")
        coche1.setColor(readln())
        print("Introduce la marca del coche: ")
        coche1.setMarca(readln())
        print("Introduce el modelo del coche: ")
        coche1.setModelo(readln())
        print("Introduce los caballos del coche: ")
        coche1.setCaballos(readln())
        print("Introduce las puertas del coche: ")
        coche1.setPuertas(readln())
        print("Introduce la matrícula del coche: ")
        coche1.setMatricula(readln())

        println(coche1.toString())

    } catch (e: Exception) {
        println("")
    }
}
/**
 * Clase coche con todos
 * @param color :String? color del coche
 * @param marca :String? marca del coche
 * @param modelo :String? modelo del coche
 * @param caballos :String? numero de caballos que tiene el coche
 * @param puertas :string? numero de puertas que tiene el coche
 * @param matricula :String matricula del coche
 */
class Coche(color:String?, marca: String?, modelo: String?, caballos: Int?, puertas: Int?, matricula: String) {
     var color:String? = color
        set(value) {
            require(!value.isNullOrBlank()) { "Color no puede ser nulo ni estar vacio." }
            field = value
        }
    var marca:String? = marca
        get() = field?.replaceFirstChar { it.uppercase() }
        set(value) {
            require(!value.isNullOrBlank()) { "La marca no pueden ser un nulo o estar vacío." }
            field = value
        }
    var modelo: String? = modelo
        set(value) {
            require(!this.modelo.isNullOrBlank()) { "El modelo no pueden ser un nulo o estar vacío." }
            field = value
        }
    val caballos:Int? = caballos
    val puertas:Int? = puertas
    val matricula:String = matricula

    init {
        require(this.matricula.length == 7) {"La matricula debe constar de 7 caracteres."}
        require(this.caballos in 70..700) {"El número de caballos debe estar entre 70 y 700"}
        require(this.puertas in 3..5) {"El número de puertas debe estar entre 3 y 5"}
        require(!this.marca.isNullOrBlank() || !this.modelo.isNullOrBlank()) {"La marca o el modelo no pueden ser un nulo o estar vacío."}
    }


    fun setCaballos(caballos:Int) {
        require(caballos in 70..700) { "El número de caballos debe estar entre 70 y 700" }
    }


    fun setPuertas(puertas:String) {
        require(puertas.toInt() in 3..5) {"Las puertas no puede ser inferior a 3 ni mayor a 5."}
    }


    fun setMatricula(matricula:String) {
        require(matricula.length != 7) {"La matricula debe constar de 7 caracteres."}
    }

    override fun toString() = "Este coche es un ${this.marca} ${this.modelo} de color ${this.color}, con ${this.caballos} caballos de potencia, ${this.puertas} puertas y con mátricula ${this.matricula}"

}
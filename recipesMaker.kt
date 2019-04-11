fun main(args: Array<String>) {

    Bienvenido()
    var opcion: String?

    do {
        menu()
        opcion = dato()

        when (opcion) {
            "1" -> crearReceta()
            "2" -> verRecetas()
            "3" -> salir()
            else -> "No es una opcion valida".print()
        }
    } while (opcion == "1" || opcion == "2")
}

var Bienvenido = { "          Bienvenido!! \nAqui puedes crear/ver tus recetas\n\n".print() }

fun String.print() {
    print(this)
}

fun menu() {
    "Elige una opcion\n".print()
    val opcion1 = "1. Hacer Una Receta"
    val opcion2 = "2. Ver Mis Recetas"
    val opcion3 = "3. Salir\n"
    val deseo = "¿Que deseas hacer?"
    "$opcion1 \n$opcion2 \n$opcion3 $deseo\n\n".print()
}

val crearReceta =
    {
        """ Quieres Crear una receta !!! ${"\n"}
        |Como se llama tu receta ${"\n"}
        """.trimMargin().print()

        nombre()

        val listaIngredientes = mutableListOf<String>(
            "1. Agua", "2. Leche", "3. Carne", "4. Verduras",
            "5. Frutas", "6. Cereal", "7. Huevos", "8. Aceite\n"
        )
        for (i in listaIngredientes) {
            println(i)
        }
        "Si deseas otro ingrediente agregalo\n".print()
        agregarIngredientes()
        preparacion()
    }

val verRecetas = {
    println("Tus recetas son:")
    listaRecetas()
}

val  listaRecetas = {
    val listarecetas = mutableListOf<String>()
    listarecetas.add("Ensalada de blocoli")
    for (i in listarecetas){
        println(i)
    }
    "\nPresiona \"Enter\" para continuar\n".print()
    var paro = readLine()
}

fun agregarIngredientes() {
    "Agrega tus ingredientes escribiendo cada uno\n".print()
    val ingredientes: String? = readLine()
    val listaingredientes = mutableListOf<String>()
    listaingredientes.add(ingredientes!!)
    "Tu receta tiene $listaingredientes \n\n".print()
}

fun preparacion() {
    "¿Como preparas tu receta con tus ingredientes?\n".print()
    var pasosPreparacion: String? = readLine()
    "Me gusta tu forma de hacer esta receta: $pasosPreparacion:P\n\n".print()
}

fun nombre() {
    var nombreReceta = readLine()
    ("¿Tu receta $nombreReceta que ingredientes tiene?\n".print())
}

val dato = {
    try {
        readLine()
    } catch (e: Exception) {
        0.toString()
    }
}

val salir = { """Mucha suerte cocinando!!""".print() }
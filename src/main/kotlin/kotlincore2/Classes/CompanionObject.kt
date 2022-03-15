package Introduction.Classes

/**
 * Like the 'static' keyword in Java
 *
 * We do not need to create a class instance to call
 * its methods or fields, we can access them using
 * only a class name
 */

fun main() {
    println(CompanionObject.Constants.PI) // 3.14
    println(Amigo.tequila) // 0.5
    Amigo.drink() // drinking...
}

class Amigo {
    val sambuca = 0.5
    val totalAlcohol = sambuca + tequila

    // lazy call(the variable is created when it is required)
    companion object {
        val tequila = 0.5

        fun drink() {
            println("drinking...")
        }
    }
}

class CompanionObject {
    object Constants {
        val PI = 3.14
    }
}
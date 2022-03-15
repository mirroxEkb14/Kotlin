/**
 * Kotlin code compiles into Java code before starting.
 * 'Tools' -> 'Kotlin' -> 'Show Kotlin Bytecode' -> 'Decompile'
 */

fun main() {
    println(Amigo.tequila)
}

class Amigo {
    companion object {
        val tequila = 0.5
    }
}
package standardOperators

/**
 * The 'instanceOf' operator in Java
 */

fun main() {
    val numInt = 7187
    checkInt(numInt)
}

fun checkInt(input: Any) {
    if (input is Int)
        println("Input is true")
    else
        println("input is false")
}
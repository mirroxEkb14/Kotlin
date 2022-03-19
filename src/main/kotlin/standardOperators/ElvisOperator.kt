package standardOperators

/**
 * If the expression on the left side is not 'null' - it returns this left part,
 * if it is 'null', it returns the right side of the expression
 */

fun main() {
    val string: String? = null
    println(string?.length ?: -1) // -1
}
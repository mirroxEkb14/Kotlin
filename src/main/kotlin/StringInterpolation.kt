
/**
 * String Interpolation allows to easily
 * concatenate strings to build another string
 */

fun main() {
    val string = "string"
    val stringAddition = " interpolation"

    // no need in '+' like in Java
    println("This is a $string $stringAddition, " +
            "with the length of ${string.length + stringAddition.length}")
}
fun main() {

    /* ============= */

    // immutable, no need in specifying variable type (val = value)
    val string1: String = "abc"
    val string2 = "abc"

    // val cannot be reassigned
//        string1 = "cba"

    /* ============= */

    // variable type is specified automatically
    val numInt = 1 // Integer
    val numFloat = 1f // Float
    val numDouble = 1.0 // Double
    val numDouble2 = .1 // Double 0.1
    val numLong = 1L // Long

    /* ============= */

    // concatenation with the '$' sign
    val numberOne = 1
    println("The number is $numberOne")
    println("Sum is ${2 + 2}")

    /* ============= */

    // cast numeric types
    val numToCast = 1.toFloat() // Integer 1 -> Float 1.0

    // get an answer with a remainder
    val withRemainder = 1 / 2.toDouble() // 0.5

    /* ============= */
}

class Variables {
}
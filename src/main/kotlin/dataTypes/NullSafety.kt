package dataTypes

/**
 * The only way to declare a variable with 'null' content is through the '?' sign
 */

fun main() {
    val nullString: String? = null

    // nullString.length -> cannot refer to methods directly,
    // only with if-else verifications, but it is not 'Kotlin-style'
    if (nullString == null)
        println("null")
    else
        nullString.length

    // secure call operator (if we have 'null', it will return 'null')
    nullString?.length
}
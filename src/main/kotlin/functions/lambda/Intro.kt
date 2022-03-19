package functions.lambda

/**
 * Lambda is a functions without a name. We can pass it to methods
 * as a parameter, we can assign it to a variable
 */

fun main() {
    val goodMorning = { println("Good morning!") }
    goodMorning() // Good morning!
}
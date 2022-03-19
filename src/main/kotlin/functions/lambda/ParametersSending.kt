package functions.lambda

fun main() {

    // pass one parameter
    val saySomething = { message: String -> println(message) }
    saySomething("something") // something

    // pass two parameters
    val multiply = { number: Int, multiplier: Int -> number * multiplier }
    println(multiply(2, 3)) // 6

    // when there are several operations in lambda
    val multiplyAndAddDashes = { number: Int, multiplier: Int ->
        val result = number * multiplier
        val resultWithDashes = "-$result-"
        resultWithDashes // returns what is on the last line in lambda
    }
    println(multiplyAndAddDashes(2, 3))

    // by default lambda returns 'Unit'
    val printToConsole = { println("printed to console") }
    printToConsole() // printed to console
    println(printToConsole) // Function0<kotlin.Unit>
}
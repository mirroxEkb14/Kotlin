package Introduction.Functions.Lambda

fun main() {
    // we can assign the value to a variable and then call the variable
    val goodMorning = { println("Good morning") } // lambda returns 'Unit'
    goodMorning() // Good morning

    // pass parameters
    val saySomething = { message: String -> println(message) }
    saySomething("something") // something

    // can be passed several parameters (lambda returns 'Int')
    val multiply = { number: Int, multiplier: Int -> println(number * multiplier) }
    multiply(5, 5) // 25

    // if several operations
    val multiplyAndAddDashes = { number: Int, multiplier: Int ->
        val result = number * multiplier
        val resultWithDashes = "-$result-"
        println(resultWithDashes)
    }
    multiplyAndAddDashes(2, 3) // -6-
}

class PassParameters {
}
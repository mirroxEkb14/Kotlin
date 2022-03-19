package functions.lambda

fun main() {
    // we want from that 'high order function' to sum two numbers
    val sumOperation = { a: Int, b: Int -> a + b }
    println(highOrderFunction(2, 2, sumOperation)) // 4

    // now let`s multiply two numbers
    println(highOrderFunction(5, 5) { a, b -> a * b }) // 25

    // divide two numbers
    println(highOrderFunction(25, 5) { a, b -> a / b }) // 5
}

fun highOrderFunction(a: Int, b: Int, operation: (Int, Int) -> Int) =
    operation(a, b)
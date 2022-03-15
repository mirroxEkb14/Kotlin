package Introduction.Functions.Lambda

/**
 * Higher order functions are functions that either take functions
 * as parameters or return functions as a result
 */

fun main() {
    val sum = { a: Int, b: Int -> a + b }
    higherOrderFunction(4, 2, sum) // 6
    higherOrderFunction(4, 2, {a, b -> a/b}) // 2
}

// takes two 'Int' and lambda that takes two 'Int' and returns 'Int'
fun higherOrderFunction(n1: Int, n2: Int, operation: (Int, Int) -> Int) {
    val result = operation(n1, n2)
    println(result)
}
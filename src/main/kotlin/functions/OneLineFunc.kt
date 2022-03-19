package functions

/**
 * These functions are 'one line' because they have
 * a return value, and it contains only one expression
 */

fun main() {
    println(function1(1, 1)) // 2
    println(function2(1, 2)) // 2
}

private fun function1(a: Int, b: Int) = a + b

private fun function2(a: Int, b: Int) =
    if (a > b) {
        a
    } else {
        b
    }
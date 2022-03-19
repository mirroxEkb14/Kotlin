package functions.lambda

/**
 * "Захват данных лямбдой"
 *
 * we can also return lambda from a function
 *
 * when we pass a variable to lambda function, lambda saves
 * this variable, have access to it and can change it
 *
 * for every instance of lambda it stores its valuex`
 */

fun main() {
    val ct = closureTest()
    ct() // 1
    ct() // 2
    ct() // 3

    val ct2 = closureTest()
    ct2() // 1
    ct2() // 2
    ct2() // 3
}

fun closureTest(): () -> Unit {
    var x = 1
    val lambda = { println(x++) }
    return lambda
}


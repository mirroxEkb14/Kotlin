package interviewQuestions.video5

/**
 * Print the numbers from 1 to 100
 *      and for multiples of '3' print 'Fizz' instead of the number
 *      and for multiples of '5' print 'Buzz'
 */

fun main() {
    val fizzBuzz = getFizzBuzz(1, 100)
    println(fizzBuzz)
    println(getLambdaFizzBuzz(1, 100))
}

fun getLambdaFizzBuzz(fromInt: Int, toInt: Int): String {
    return (fromInt..toInt).map { index ->
        mapOf(0 to index,
            index % 3 to "Fizz",
            index % 5 to "Buzz",
            index % 15 to "Fizz Buzz")[0]
    }.joinToString(", ")
}

fun getFizzBuzz(fromNum: Int, toNum: Int): String {
    var result = ""

    for(i in fromNum..toNum) {
        result += when {
            (i % 3 == 0) && (i % 5 == 0) -> "Fizz Buzz, "
            i % 3 == 0 -> "Fizz, "
            i % 5 == 0 -> "Buzz, "
            else -> "$i, "
        }
    }
    return result
}
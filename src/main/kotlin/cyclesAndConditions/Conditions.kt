package cyclesAndConditions

fun main() {
    // if-else
    val a = 1
    val b = 2
    val result = if (a > b) { // assign the result of the "if-else" to a variable
        a
    } else {
        b
    }


    // when
    when (result) {
        1, 3, 5 -> println("Odd number")
        2, 4, 6 -> println("Even number")
    }
    when {
        result % 2 == 0 -> println("Even")
        else -> println("Odd")
    }
    when (result) { // cycle inside
        in 0..2 -> println("low")
        in 3..5 -> println("medium")
        in 6..8 -> println("high")
    }
    val whenResult = when (result) { // we can assign the result of the "when" to a variable
        in 0..1 -> "low"
        else -> "medium"
    }
}
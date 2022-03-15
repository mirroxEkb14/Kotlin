package Introduction.Tasks.Calculator

import kotlin.system.exitProcess

fun main() {
    println("Greetings, let`s calculate some digits for you")

    while (true) {
        val data = getData()
        println("\nCalculation result: ${ calculate(data) }")
    }
}

private fun calculate(data: List<String>): Double {
    val firstDigit = data[0].toDouble()
    val secondDigit = data[1].toDouble()

    return when (data[2]) {
        "+" -> firstDigit + secondDigit
        "-" -> firstDigit - secondDigit
        "*" -> firstDigit * secondDigit
        "/" -> firstDigit / secondDigit
        else -> -1.0 // unnecessary
    }
}

private fun getData(): List<String> {
    var firstDigit: String?
    var secondDigit: String?
    var sign: String?

    while (true) {
        println("\nFirst digit:")
        firstDigit = readLine()

        if (checkData(firstDigit)) {

            while (true) {
                println("\nSecond digit:")
                secondDigit = readLine()

                if (checkData(secondDigit)) {

                    while (true) {
                        println("\nSign:")
                        sign = readLine()

                        if (checkData(sign, true)) {
                            return listOf(firstDigit!!, secondDigit!!, sign!!)
                        }
                    }
                }
            }
        }
    }
}

private fun checkData(input: String?, isSign: Boolean = false): Boolean {
    when (input) {
        "Q", "q" -> exitProcess(0)
        null -> {
            println("\nYou need to enter something:")
            return false
        }
        "+", "-", "*", "/" -> return true
        else -> {
            if (isSign) {
                println("\nOnly available signs(+, -, *, /):")
                return false
            }
            return try {
                input.toInt()
                true
            } catch (e: NumberFormatException) {
                println("\nOnly digits!")
                false
            }
        }
    }
}
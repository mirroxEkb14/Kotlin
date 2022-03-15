package Tasks.GitHub

import java.lang.IllegalArgumentException

/**
 * Простая (2 балла)
 *
 * Пользователь задает целое число, большее 100 (например, 3801).
 * Определить третью цифру справа в этом числе (в данном случае 8).
 */

fun main() {
    println(thirdDigit(3801)) // 8
}

fun thirdDigit(number: Int): Int {
    val stringNumber = number.toString()

    if (stringNumber.length >= 3) return stringNumber[stringNumber.length - 3].toString().toInt()
    else throw IllegalArgumentException("Number is too short for length 3: $number")

    // return (number / 100) % 10
}
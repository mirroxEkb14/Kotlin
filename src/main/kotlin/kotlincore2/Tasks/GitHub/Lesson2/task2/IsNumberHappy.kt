package Tasks.GitHub.Lesson2.task2

/**
 * Простая (2 балла)
 *
 * Четырехзначное число назовем счастливым, если сумма первых двух ее цифр равна сумме двух последних.
 * Определить, счастливое ли заданное число, вернуть true, если это так.
 */

fun main() {
    println(isNumberHappy(1533)) // true
    println(isNumberHappy(9009)) // true
    println(isNumberHappy(3644)) // false
}

fun isNumberHappy(number: Int): Boolean {
    val numberArray = number.toString().split("").subList(1, 5)
    return numberArray[0].toInt() + numberArray[1].toInt() == numberArray[2].toInt() + numberArray[3].toInt()

    // return number / 1000 + (number / 100) % 10 == (number / 10) % 10 + number % 10
}

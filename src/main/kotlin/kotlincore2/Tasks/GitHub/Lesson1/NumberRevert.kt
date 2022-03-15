package Tasks.GitHub

/**
 * Простая (2 балла)
 *
 * Пользователь задает целое трехзначное число (например, 478).
 * Необходимо вывести число, полученное из заданного перестановкой цифр в обратном порядке (например, 874).
 */

fun main() {
    println(numberRevert(478)) // 874
}

fun numberRevert(number: Int): Int = number.toString().split("").reversed().joinToString("").toInt()
    // return (number % 10) * 100 + ((number / 10) % 10) * 10 + number / 100
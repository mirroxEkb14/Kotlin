package Tasks.GitHub

import java.time.LocalTime

/**
 * Тривиальная (3 балла).
 *
 * Задача имеет повышенную стоимость как первая в списке.
 *
 * Пользователь задает время в часах, минутах и секундах, например, 8:20:35.
 * Рассчитать время в секундах, прошедшее с начала суток (30035 в данном случае).
 */

fun main() {
    println("Time in the format: 8:20:35")

    val dividedTime = readLine()!!.split(":") // ["8", "20", "35"]
    val seconds = seconds(dividedTime[0].toInt(), dividedTime[1].toInt(), dividedTime[2].toInt())

    println(seconds)
}

fun seconds(hours: Int, minutes: Int, seconds: Int): Int =
    LocalTime.of(hours, minutes, seconds).toSecondOfDay()

    // hours * 3600 + minutes * 60 + seconds

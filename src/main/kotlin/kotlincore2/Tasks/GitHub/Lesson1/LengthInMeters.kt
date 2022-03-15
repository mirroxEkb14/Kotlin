package Tasks.GitHub

import java.math.RoundingMode
import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.*

/**
 * Тривиальная (1 балл)
 *
 * Пользователь задает длину отрезка в саженях, аршинах и вершках (например, 8 саженей 2 аршина 11 вершков).
 * Определить длину того же отрезка в метрах (в данном случае 18.98).
 * 1 сажень = 3 аршина = 48 вершков, 1 вершок = 4.445 см.
 */

fun main() {
    println("Enter length in the format: 8 sagenes, 2 arshins, 11 vershoks")
    val userInput = readLine()!!.replace("[^0-9,]".toRegex(), "").split(",") // [8, 2, 11]

    // =========================================
    val double = 18.980150000000002
    val df = DecimalFormat("##.##", DecimalFormatSymbols(Locale.ENGLISH))
    df.roundingMode = RoundingMode.FLOOR
    println(df.format(double)) // 18.98
    // ========================================

    println(lengthInMeters(userInput[0].toInt(), userInput[1].toInt(), userInput[2].toInt())) // 18.980150000000002
}

fun lengthInMeters(sagenes: Int, arshins: Int, vershoks: Int): Double {
    val meterVershoks = 0.04445 * vershoks
    val meterArshins = 16 * arshins * 0.04445
    val meterSagenes = 3 * sagenes * 16 * 0.04445

    return meterVershoks + meterArshins + meterSagenes

    // return (sagenes * 48 + arshins * 16 + vershoks) * 0.04445
}
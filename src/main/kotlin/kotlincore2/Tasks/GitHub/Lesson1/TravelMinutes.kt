package Tasks.GitHub

import java.time.LocalTime

/**
 * Простая (2 балла)
 *
 * Поезд вышел со станции отправления в h1 часов m1 минут (например в 9:25) и
 * прибыл на станцию назначения в h2 часов m2 минут того же дня (например в 13:01).
 * Определите время поезда в пути в минутах (в данном случае 216).
 */

fun main() {
    println(travelMinutes(9, 25, 13, 1)) // 216
}

fun travelMinutes(hoursDepart: Int, minutesDepart: Int, hoursArrive: Int, minutesArrive: Int): Int {
    val departTime = LocalTime.of(hoursDepart, minutesDepart) // 09:25
    val arriveTime = LocalTime.of(hoursArrive, minutesArrive) // 13:01

    return (arriveTime.toSecondOfDay() - departTime.toSecondOfDay()) / 60

    // return hoursArrive * 60 + minutesArrive - hoursDepart * 60 - minutesDepart
}

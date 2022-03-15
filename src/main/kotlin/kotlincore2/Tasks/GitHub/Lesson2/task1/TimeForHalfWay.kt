package Tasks.GitHub.Lesson2.task1

/**
 * Простая
 *
 * Путник двигался t1 часов со скоростью v1 км/час, затем t2 часов — со скоростью v2 км/час
 * и t3 часов — со скоростью v3 км/час.
 * Определить, за какое время он одолел первую половину пути?
 */

fun main() {
    println(timeForHalfWay(1.0, 5.0, 2.0, 4.0, 3.0, 3.0)) // 2.5
    println(timeForHalfWay(4.0, 3.0, 1.0, 4.0, 1.0, 6.0)) // 3.67
    println(timeForHalfWay(3.0, 0.0, 1.0, 6.0, 2.0, 5.0)) // 4.4
}

fun timeForHalfWay(t1: Double, v1: Double,
                   t2: Double, v2: Double,
                   t3: Double, v3: Double): Double {
    val distance = (t1 * v1 + t2 * v2 + t3 * v3) / 2.0
    return when {
        distance <= t1 * v1 -> distance / v1
        distance <= t1 * v1 + t2 * v2 -> t1 + (distance - t1 * v1) / v2
        else -> t1 + t2 + (distance - t1 * v1 - t2 * v2) / v3
    }
}
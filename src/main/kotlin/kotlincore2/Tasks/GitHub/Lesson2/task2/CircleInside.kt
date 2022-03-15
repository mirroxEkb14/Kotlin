package Tasks.GitHub.Lesson2.task2

import java.lang.Math.pow
import kotlin.math.sqrt

/**
 * Средняя
 *
 * Проверить, лежит ли окружность с центром в (x1, y1) и радиусом r1 целиком внутри
 * окружности с центром в (x2, y2) и радиусом r2.
 * Вернуть true, если утверждение верно
 */

fun main() {
    println(circleInside(0.0, 0.0, 6.0, 0.0, 0.0, 5.0)) // false
    println(circleInside(0.0, 0.0, 1.0, 10.0, 10.0, 9.0)) // false
    println(circleInside(2.0, 2.0, 2.0, 2.0, 2.0, 2.0)) // true
    println(circleInside(-2.0, 3.0, 2.0, -2.0, 0.0, 5.0)) // true
    println(circleInside(1.0, 2.0, 3.0, 4.0, 5.0, 6.0)) // false
}

fun circleInside(x1: Double, y1: Double, r1: Double,
                 x2: Double, y2: Double, r2: Double): Boolean {
    val distance = sqrt(pow(x2 - x1, 2.0) + pow(y2 - y1, 2.0))
    return r2 >= distance + r1
 }

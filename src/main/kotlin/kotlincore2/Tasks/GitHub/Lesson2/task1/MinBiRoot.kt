package Tasks.GitHub.Lesson2.task1

import kotlin.math.sqrt
import java.lang.Math.min

/**
 * Пример
 *
 * Найти наименьший корень биквадратного уравнения ax^4 + bx^2 + c = 0
 */

fun main() {
    println(minBiRoot(1.0, -10.0, 9.0)) // -1.0
}

fun minBiRoot(a: Double, b: Double, c: Double): Double {
    if (a == 0.0) {
        if (b == 0.0) return Double.NaN
        val bc = -c / b
        if (bc < 0.0) return Double.NaN
        return -sqrt(bc)
    }

    val discriminant = b * b - (4 * a * c) // 64.0

    val y1 = (-b + sqrt(discriminant)) / 2 * a // 9.0
    val y2 = (-b - sqrt(discriminant)) / 2 * a // 1.0

    return -min(sqrt(y1), sqrt(y2))
}
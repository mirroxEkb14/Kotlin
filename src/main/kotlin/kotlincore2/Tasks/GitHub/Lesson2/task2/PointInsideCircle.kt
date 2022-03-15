package Tasks.GitHub.Lesson2.task2

/**
 * Пример
 *
 * Лежит ли точка (x, y) внутри окружности с центром в (x0, y0) и радиусом r?
 */

fun main() {
    println(pointInsideCircle(1.0, 1.0, 0.0, 0.0, 2.0)) // true
    println(pointInsideCircle(2.0, 2.0, 0.0, 0.0, 2.0)) // false
}

fun pointInsideCircle(x: Double, y: Double, x0: Double, y0: Double, r: Double): Boolean =
    sqr(x - x0) + sqr(y -y0) <= sqr(r)

fun sqr(n: Double): Double = n * n
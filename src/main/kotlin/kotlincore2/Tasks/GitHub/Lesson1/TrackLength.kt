package Tasks.GitHub

/**
 * Тривиальная (1 балл)
 *
 * Найти длину отрезка, соединяющего точки на плоскости с координатами (x1, y1) и (x2, y2).
 * Например, расстояние между (3, 0) и (0, 4) равно 5
 */

fun main() {
    /* |AB|² = (y2 - y1)² + (x2 - x1)²

        (2;4), (4;1)
       |AB| = √((4-2)²+(1-4)²) */

    println(trackLength(3.0, 0.0, 0.0, 4.0)) // 5.0
}

fun trackLength(x1: Double, y1: Double, x2: Double, y2: Double): Double =
    Math.sqrt(sqr(y2 - y1) + sqr(x2 - x1))

    // return Math.sqrt(Math.pow((x2 - x1), 2.0) + Math.pow((y2 - y1), 2.0))

fun sqr(n: Double): Double = n * n
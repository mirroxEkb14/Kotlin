package Tasks.GitHub.Lesson2.task1

/**
 * Простая (2 балла)
 *
 * Треугольник задан длинами своих сторон a, b, c.
 * Проверить, является ли данный треугольник остроугольным (вернуть 0),
 * прямоугольным (вернуть 1) или тупоугольным (вернуть 2).
 * Если такой треугольник не существует, вернуть -1.
 */

fun main() {
}

/**
 * If the Pythagorean theorem holds:
 *      с²=a²+b² - where 'c' is the largest side,
 *      'a' and 'b' the other two, it is a rectangular triangle
 *
 * If the square of the largest side is less than the sum of
 * the square of the other two sides:
 *      c²<a²+b², it is an acute triangle
 *
 * If the square of the largest side is greater than the sum of
 * the square of the other two sides:
 *      с²>a²+b², it is an obtuse triangle
 */

fun triangleKind(a: Double, b: Double, c: Double): Int {
    val sumSquare = sqr(a) + sqr(b)
    val cSquare = sqr(c)

    return when {
        cSquare == sumSquare -> 1
        cSquare < sumSquare -> 0
        cSquare > sumSquare -> 2
        else -> -1
    }
}

fun sqr(n: Double): Double = n * n
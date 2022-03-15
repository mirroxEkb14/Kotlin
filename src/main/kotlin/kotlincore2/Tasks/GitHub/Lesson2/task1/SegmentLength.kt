package Tasks.GitHub.Lesson2.task1

import kotlin.math.max
import kotlin.math.min

/**
 * Средняя (3 балла)
 *
 * Даны четыре точки на одной прямой: A, B, C и D.
 * Координаты точек a, b, c, d соответственно, b >= a, d >= c.
 * Найти длину пересечения отрезков AB и CD.
 * Если пересечения нет, вернуть -1.
 */

fun main() {
    println(segmentLength(1, 2, 3, 4))// -1
    println(segmentLength(5, 7, 1, 3)) // -1
    println(segmentLength(1, 2, 2, 4)) // 0
    println(segmentLength(3, 6, 0, 9)) // 3
    println(segmentLength(2, 5, 3, 9)) // 2
    println(segmentLength(3, 6, 1, 4)) // 1
    println(segmentLength(1, 15, 10, 14)) // 4
}

fun segmentLength(a: Int, b: Int, c: Int, d: Int): Int {
    return when {
        a in c..d && b in c..d -> max(a, b) - min(a, b)
        c in a..b && d in a..b -> max(c, d) - min(c, d)
        a in c..d -> max(c, d) - min(a, b)
        b in c..d -> max(a, b) - min(c, d)
        c in a..b -> max(a, b) - min(c, d)
        d in a..b -> max(c, d) - min(a, b)
        else -> -1
    }

    /*
        val bigger = max(max(a, b), c)
        val smaller = min(min(a, b), c)
        val middle = a + b + c - bigger - smaller
        val hypotenuse = sqrt(smaller*smaller + middle*middle)
        return when {
            smaller + middle <= bigger -> -1
            hypotenuse > bigger -> 0
            hypotenuse == bigger -> 1
            else -> 2
        }
     */
}
package Tasks.GitHub.Lesson2.task2

import kotlin.math.max
import kotlin.math.min

/**
 * Средняя
 *
 * Определить, пройдет ли кирпич со сторонами а, b, c сквозь прямоугольное отверстие в стене со сторонами r и s.
 * Стороны отверстия должны быть параллельны граням кирпича.
 * Считать, что совпадения длин сторон достаточно для прохождения кирпича, т.е., например,
 * кирпич 4 х 4 х 4 пройдёт через отверстие 4 х 4.
 * Вернуть true, если кирпич пройдёт
 */

fun main() {
    println(brickPasses(2, 10, 5, 6, 3)) // true
    println(brickPasses(4, 4, 4, 4, 4)) // true
    println(brickPasses(6, 5, 4, 3, 6)) // false
    println(brickPasses(3, 2, 1, 1, 2)) // true
}

fun brickPasses(a: Int, b: Int, c: Int, r: Int, s: Int): Boolean {
    val length = min(min(a, b), c)
    val width = max(max(a, b), c)
    val height = a + b + c - length - width

    val holeLength = min(r, s)
    val holeHeight = max(r, s)

    return length <= holeLength && height <= holeHeight
}
package Tasks.GitHub.Lesson2.task2

/**
 * Простая (2 балла)
 *
 * На шахматной доске стоят два ферзя (ферзь бьет по вертикали, горизонтали и диагоналям).
 * Определить, угрожают ли они друг другу. Вернуть true, если угрожают.
 * Считать, что ферзи не могут загораживать друг друга.
 */

fun main() {
    println(queenThreatens(3, 6, 7, 6)) // true
    println(queenThreatens(8, 1, 1, 8)) // false
    println(queenThreatens(7, 6, 5, 7)) // false
}

fun queenThreatens(x1: Int, y1: Int, x2: Int, y2: Int): Boolean =
    (x1 == x2 || y1 == y2) || ((x1 == x2 + 2) && (y1 == y2 + 2)) || (x1 == x2 - 2 && y1 == y2 - 2)

    // return x1 == x2 || y1 == y2 || x1 + y1 == x2 + y2 || x1 - y1 == x2 - y2
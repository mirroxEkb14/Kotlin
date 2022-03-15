package Tasks.GitHub.Lesson2.task1

/**
 * Простая (2 балла)
 *
 * Нa шахматной доске стоят черный король и две белые ладьи (ладья бьет по горизонтали и вертикали).
 * Определить, не находится ли король под боем, а если есть угроза, то от кого именно.
 * Вернуть 0, если угрозы нет, 1, если угроза только от первой ладьи, 2, если только от второй ладьи,
 * и 3, если угроза от обеих ладей.
 * Считать, что ладьи не могут загораживать друг друга
 */


fun main() {
    println(whichRookThreatens(1, 2, 3, 4, 5, 6)) // 0
    println(whichRookThreatens(5, 3, 7, 3, 4, 8)) // 1
    println(whichRookThreatens(6, 8, 8, 6, 6, 3)) // 2
    println(whichRookThreatens(3, 7, 8, 7, 3, 5)) // 3
}

fun whichRookThreatens (
    kingX: Int, kingY: Int,
    rookX1: Int, rookY1: Int,
    rookX2: Int, rookY2: Int): Int {
    val rook1Danger = rookCheck(kingX, kingY, rookX1, rookY1)
    val rook2Danger = rookCheck(kingX, kingY, rookX2, rookY2)

    return when {
        rook1Danger && rook2Danger -> 3
        rook1Danger -> 1
        rook2Danger -> 2
        else -> 0
    }
}

fun rookCheck(kingX: Int, kingY: Int, rookX: Int, rookY: Int,): Boolean =
    kingX == rookX || kingY == rookY
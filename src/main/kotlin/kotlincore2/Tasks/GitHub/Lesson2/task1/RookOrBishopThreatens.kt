package Tasks.GitHub.Lesson2.task1

/**
 * Простая (2 балла)
 *
 * На шахматной доске стоят черный король и белые ладья и слон
 * (ладья бьет по горизонтали и вертикали, слон — по диагоналям).
 * Проверить, есть ли угроза королю и если есть, то от кого именно.
 * Вернуть 0, если угрозы нет, 1, если угроза только от ладьи, 2, если только от слона,
 * и 3, если угроза есть и от ладьи и от слона.
 * Считать, что ладья и слон не могут загораживать друг друга.
 */

fun main() {
    println(rookOrBishopThreatens(4, 5, 5, 7, 8, 8)) // 0
    println(rookOrBishopThreatens(2, 8, 6, 8, 1, 6)) // 1
    println(rookOrBishopThreatens(5, 4, 3, 7, 1, 8)) // 2
    println(rookOrBishopThreatens(1, 6, 7, 6, 3, 8)) // 3
}

fun rookOrBishopThreatens(
    kingX: Int, kingY: Int,
    rookX: Int, rookY: Int,
    bishopX: Int, bishopY: Int): Int {
    val rookDanger = rookCheck2(kingX, kingY, rookX, rookY)
    val bishopDanger = bishopCheck(kingX, kingY, bishopX, bishopY)

    return when {
        rookDanger && bishopDanger -> 3
        rookDanger -> 1
        bishopDanger -> 2
        else -> 0
    }
}

fun bishopCheck(kingX: Int, kingY: Int, bishopX: Int, bishopY: Int): Boolean =
    kingX - kingY == bishopX - bishopY || kingX + kingY == bishopX + bishopY

fun rookCheck2(kingX: Int, kingY: Int, rookX: Int, rookY: Int): Boolean =
    kingX == rookX || kingY == rookY
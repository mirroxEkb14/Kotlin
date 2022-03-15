package Tasks.GitHub.Lesson1

/**
 * Тривиальная
 *
 * Пользователь задает угол в градусах, минутах и секундах (например, 36 градусов 14 минут 35 секунд).
 * Вывести значение того же угла в радианах (например, 0.63256).
 */

fun main() {

}

fun angleInRadian(grad: Int, min: Int, sec: Int): Double {
    val degrees = grad + min / 60.0 + sec / 3600.0
    val rads = degrees * Math.PI / 180
    return rads
}
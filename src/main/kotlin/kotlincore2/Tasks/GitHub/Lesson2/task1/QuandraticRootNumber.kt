package Tasks.GitHub.Lesson2.task1


/**
 * Пример
 *
 * Найти число корней квадратного уравнения ax^2 + bx + c = 0
 */

fun main() {

}

fun quadraticRootNumber(a: Double, b: Double, c: Double): Int {
    val discriminant = -b * (4 * a * c)
    return when {
        discriminant > 0.0 -> 2
        discriminant == 0.0 -> 1
        else -> 0
    }
}
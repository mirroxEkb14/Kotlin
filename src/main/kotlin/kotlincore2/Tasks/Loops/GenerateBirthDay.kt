package Introduction.Tasks.Loops

/**
 * Используя полученные знания о циклах, сгенерируйте с помощью них дату своего рождения,
 * то есть должны быть сгенерированы 8 цифр + 2 разделителя (на ваш вкус).
 * Вывод должен быть примерно такой: 01.01.1970 или 01/01/1970.
 *
 * *Усложнение: Циклы могут генерировать только числа от 0 до 9.
 */

fun main() {
    val splitDate = listOf(arrayOfNulls<Int>(2), arrayOfNulls(2), arrayOfNulls(4))

    repeat(9) { times ->
        when (times) {
            0 -> {
                splitDate[0][1] = 0
                splitDate[1][0] = 0
                splitDate[2][1] = 0
                splitDate[2][2] = 0
            }
            2 -> {
                splitDate[2][0] = 2
                splitDate[2][3] = 2
            }
            3 -> splitDate[0][0] = 3
            8 -> splitDate[1][1] = 8
        }
    }

    val generatedDate = "${ splitDate[0].joinToString("") }.${ splitDate[1].joinToString("") }.${ splitDate[2].joinToString("") }"
    println(generatedDate) // 30.08.2002
}
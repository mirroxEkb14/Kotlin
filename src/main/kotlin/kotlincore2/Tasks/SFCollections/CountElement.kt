package Introduction.Tasks.SFCollections

/**
 * Посчитайте, сколько раз повторяется цифра 3 в коллекции
 */

fun main() {
    val counter = Counter()

    counter.countThree()
}

class Counter {
    private val list = mutableListOf<Int>()

    init {
        repeat(100) {
            list.add((1..3).random())
        }
    }

    fun countThree() {
        println(list.count { it == 3 })
    }
}
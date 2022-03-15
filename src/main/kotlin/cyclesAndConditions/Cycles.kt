package cyclesAndConditions

fun main() {
    // range
    for (i in 0..1) {
        println("The current num is $i")
    }
    for (i in 1 downTo 0) { // in reverse order
        println("The current num is $i")
    }
    for (i in 0..5 step 2) { // set a step for the iterations
        println("The current num is $i")
    }
    for (i in 0 until 1) { // "1" is not included
        println("The current num is $i")
    }


    // repeat
    repeat(10) { times -> println(times) } // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9


    // forEach
    val list = mutableListOf(1, 2, 3)
    list.forEach { println(it) }
    list.forEachIndexed { index, i -> println("The element`s index is $index. The element itself is $i") }
}
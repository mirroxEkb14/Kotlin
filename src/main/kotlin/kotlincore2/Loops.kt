fun main() {

    /* for each */

    // 'List.of()' in Java, immutable, cant append items or change the current ones
    val items = listOf("apple", "banana", "orange")

//    val mutableItems = mutableListOf() // ArrayList, mutable

    for (item in items) {
        println(item)
    }


    /* while */
    var index = 0
    while (index < items.size) {
        println("Item at $index is ${items[index]}")
        index++
    }


    /* Ranges */
    println(5 in 3..10) // true

    for (i in 1..3) // [1, 3]
        println(i) // 1, 2, 3

    for (i in 1 until 3) // [1, 3)
        println(i) // 1, 2

    for (i in 3 downTo 1)
        println(i) // 3, 2, 1

    for (i in 0..30 step 10)
        println(i) // 0, 10, 20, 30

}

class Loops {
}
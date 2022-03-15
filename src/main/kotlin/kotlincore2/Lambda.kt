fun main() {
     val a = listOf(1, 2, 3, 4, 5)

    a.forEach { e -> println(e) }
    println(a.map { e -> e % 2 == 0 })
    println(a.filter { e -> e % 2 == 0 })
    println(a.reduce { sum, e ->  sum + e}) // sum()

    a.sorted()
    a.sortedByDescending { it }

    a.any { it > 10} // if at least one element > 10, returns true

    a.all { it < 10 } // if all the elements in the collection meet the condition, returns true

    a.sum()

    val numbers = listOf(1, 2, -1, -2)
    val (positive, negative) = numbers.partition { it > 0 } // divides into two collections by the passed condition

    // group by the length -> {3=[aaa], 2=[bb], 1=[c]}
    val result = listOf("aaa", "bb", "c").groupBy { it.length } // HashMap
}

class Lambda {
}
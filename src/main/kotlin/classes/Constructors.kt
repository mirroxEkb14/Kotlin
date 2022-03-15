package classes

/**
 * Secondary constructor is needed when we want
 * to set some variables by default in a class
 */

fun main() {
    val constructors1 = Constructors(1, 2)
    println(constructors1.a + constructors1.b) // 3

    val constructors2 = Constructors(1)
    println(constructors2.a + constructors2.b) // 21

    val constructors21 = Constructors2(1)
    println(constructors21.a + constructors21.b) // 21
}

// primary
class Constructors(val a: Int, val b: Int) {

    // secondary constructor #1
    constructor(a: Int): this(a, 20)
}

// secondary constructor #2
private class Constructors2(val a: Int, val b: Int = 20)
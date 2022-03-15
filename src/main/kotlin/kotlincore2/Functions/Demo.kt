package Introduction.Functions

fun main() {
    testSimpleModified(10, 5)
    testString(10)

    // set the value of the variable
    testNamedArguments(z = 3, y = 2, x = 1)

    // use default arguments(x = 1, y = 2)
    testDefaultArguments() // 1 + 2 = 3
    // x = 1(default), y is set
    testDefaultArguments(y = 1) // 1 + 1 = 2
    // set both arguments(default ones are not used)
    testDefaultArguments(2, 2) // 2 + 2 = 4

    // takes an infinite number of digits
    printEven(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    // if we need to pass a list ('*')
    printEven(*intArrayOf(1, 2, 3, 4, 5, 6), 7, 8, 9, 10)
}

// vararg
fun printEven(vararg numbers: Int) {
    numbers.forEach {e -> if (e % 2 == 0) println(e)}
}

fun testDefaultArguments(x: Int = 1, y: Int = 2) {
    println(x + y)
}

fun testNamedArguments(x: Int, y: Int, z: Int): List<Int> {
    return listOf(x, y, z)
}

// takes 'Int', returns 'String'
fun testString(x: Int) = "String is $x"

// if the fun is in one string, can be simplified
fun testSimpleModified(x: Int, y: Int) = x + y


// does not take arguments, returns 'Int'
fun testSimple(): Int {
    return 5 + 5
}

class Functions {
}
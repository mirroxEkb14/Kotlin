package Introduction

fun main() {

    val p1 = Person("Tom", "Jones", 35)
    println(p1.firstName)

    val child = Person("Child", "Child", 5)
    val p2 = Person("Tom", "Jones", 35, child)

    val rectangle1 = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle1.perimeter}")

    val rectangle2 = Rectangle(5.0, 2.0)
    println(rectangle1 == rectangle2) // true
}

// primary constructor
class Person(val firstName: String, val lastName: String, var age: Int) {
    var children: MutableList<Person> = mutableListOf() // ArrayList

    // init blocks are performed after the constructor, when creating an object
    init {
        println("Person is created $firstName")
    }

    constructor(firstName: String, lastName: String, age: Int, child: Person):
            this(firstName, lastName, age) {
        children.add(child)
    }

    // without arguments(set them by default)
    constructor(): this("", "", -1)
}

// 'data' keyword -> 'equals()', 'hashcode()', 'toString()' methods are overridden
data class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2

    var test = 1
        get() = field + 1
        set(value) {
            if (value < 0) println("Negative value")
            else field = value
        }

    fun area() = height * length
}

class ClassesDemo {
}
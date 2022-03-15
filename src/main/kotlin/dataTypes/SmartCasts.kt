package dataTypes

fun main() {
    checkClass(Dog())
    checkClass(Cat())
}

// because we check for belonging to the Dog class,
// the compiler calls methods from the Dob class
fun checkClass(inputClass: Any) {
    if (inputClass is Dog)
        inputClass.bark()
    if (inputClass is Cat)
        inputClass.meow()
}

class Dog {
    fun bark() {
        println("woof-woof")
    }
}

class Cat {
    fun meow() {
        println("meow-meow")
    }
}
package Introduction

fun main() {

    val a = A()
    checkClass(a) // "A method"
}

fun checkClass(any: Any) {
    // Kotlin makes a cast itself, so we can access to 'A' class methods
    if (any is A) {
        any.methodA()
    }

    if (any is B) {
        any.methodB()
    }
}

class A {
    fun methodA() {
        println("A method")
    }
}

class B {
    fun methodB() {
        println("B method")
    }
}

class SmartCast {
}
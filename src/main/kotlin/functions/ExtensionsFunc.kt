package functions

/**
 * Extensions allow us adding new functionality to the type
 * without modifying his implementation, i.e. we can control
 * the object behavior not changing its methods and fields inside the class
 */

fun main() {
    println("I want it".addUrgent(3)) // I want it!!!

    "printed without 'println()'".quickPrint() // printed without 'println()'

    "extension with generics!".quickPrint2().addUrgent() // extension with generics!
    "extension with generics!".quickPrint2().addUrgent().quickPrint2() // extension with generics!
                                                                       // extension with generics!!

    20.sqrt.quickPrint2() // 400

    val testString1: String? = null
    testString1.defaultOrNull("WOW").quickPrint2() // WOW
    val testString2 = "NonNull"
    testString2.defaultOrNull("WOW").quickPrint2() // NonNull
}

// here we want the String type to be expanded by 'addUrgent' method
// 'this' is the string itself, and we add to it '!'
// (the amount depends on 'amount' variable)
fun String.addUrgent(amount: Int = 1) = this + "!".repeat(amount)

// all the classes are inherited from Any, so we can apply this function to any type
fun Any.quickPrint() = println(this)

// -----------------------------------------------

// extension returns the type that was in 'receiver type' (String in out case)
fun <T> T.quickPrint2(): T {
    println(this)
    return this
}

// -----------------------------------------------
val Int.sqrt
    get() = this * this

// -----------------------------------------------
fun String?.defaultOrNull(default: String) = this ?: default
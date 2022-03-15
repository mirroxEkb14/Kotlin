package classes.keywords

/**
 * The 'name' variable is set only when
 * the 'initName' method is called
 */

fun main() {
    val myClass = MyClass()
    myClass.initName()

    println(myClass.name)
}

private class MyClass {
    lateinit var name: String

    fun initName() {
        name = "Bob"
    }
}
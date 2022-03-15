package classes.keywords

/**
 * The variable is initialized only
 * when it is needed
 */

fun main() {
    val byLazy = ByLazy()
    println(byLazy.name)
}

private class ByLazy {
    val name: String by lazy { "Bob" }
}
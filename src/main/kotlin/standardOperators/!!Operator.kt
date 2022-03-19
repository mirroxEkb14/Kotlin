package standardOperators

/**
 * In cases, if you are a 100% sure, that the variable will not be 'null'
 * But if it is not so, the NPE will be thrown
 */

fun main() {
    val string: String? = null
    println(string!!.length) // Exception in thread "main" kotlin.KotlinNullPointerException
}
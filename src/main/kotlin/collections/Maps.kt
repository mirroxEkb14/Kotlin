package collections

fun main() {
    val mutableMap = mutableMapOf<String, Int>()
    val immutableMap = mapOf(Pair("string1", 1), Pair("string2", 2)) // cannot change
    val immutableMap2 = mapOf("string1" to 1, "string2" to 2)
}
package dataTypes.equality

/**
 * Compare the links
 * '==' in Java, '===' in Kotlin
 */

fun main() {
    val stringA = "abc"
    val stringB = stringA
    println(stringA === stringB) // true
    println(stringA !== stringB) // false
}
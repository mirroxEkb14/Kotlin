package dataTypes

/**
 * There are no primitive types, all the variable types
 * are needed to define through their classes
 */

fun main() {
    // Integer, Float, Double, Long
    val numInt = 1
    val numFloat = 1f
    val numDouble = 1.0
    val numLong = 1L

    // Type Conversion
    val fromIntToFloat1 = numInt.toFloat()
    val fromIntToFloat2 = 1.toFloat()
    println(fromIntToFloat1 + fromIntToFloat2)

    // division with remainder
    val div1 = 1 / 2.0
    val div2 = 1 / 2.toDouble()
    println(div1 + div2) // 0.5
}
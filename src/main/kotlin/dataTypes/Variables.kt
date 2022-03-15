package dataTypes

fun main() {
    // value -> cannot assign a new value
    val value: String = "Hey!"
    println(value)

    // variable -> can change a value
    var variable: Int = 7187
    variable = 14
    println(variable)

    // Type Inference -> no need in specifying data type, the compiler will know the type by itself
    var ref = "www"
    println(ref)
}
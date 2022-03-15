package keywords

fun main() {
    val stringValue1 = "String value #1"
    asNotSafe(stringValue1)

    val stringValue2 = "String value #2"
    asSafe(stringValue2)
}

// this example is not safe, because if the conversion does not work, it will throw an exception
fun asNotSafe(input: Any) {
    val anyToString = input as String
    println(anyToString)
}

// safe method, on failure, it will return 'null' and the program continues working
fun asSafe(input: Any) {
    val anyToString = input as? String
    println(anyToString)
}
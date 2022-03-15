fun main() {

}

// Kotlin takes downcasting, no need in '(String) object'
fun testWhen(input: Any) {
    when (input) {
        1 -> println("One")
        in 10..20 -> println("from 10 to 20")
        is String -> println("String with the length ${input.length}")
        else -> println("something else")
    }
}

class WhenExpressions {
}
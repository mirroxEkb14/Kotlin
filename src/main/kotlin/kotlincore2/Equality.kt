fun main() {

    // compare the structure -> '.equals()' in Java, '==' in Kotlin
    val stringA = "abc"
    val stringB = "abc"

    println(stringA == stringB) // true ("abc" = "abc")


    // compare links -> '==' in Java, '===' in Kotlin
    val stringC = "abc"
    val stringD = stringC

    println(stringC === stringD) // true ('stringD' refers to 'stringC')
}

class Equality {
}
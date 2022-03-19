package functions.lambda

/**
 * We can give a nickname to an existing type
 */

typealias MyClassList = List<Car>

fun main() {
    val withAlias = mutableListOf<MyClassList>()
    val withoutAlias = mutableListOf<List<Car>>()
}

data class Car(val model: String, val year: Int)
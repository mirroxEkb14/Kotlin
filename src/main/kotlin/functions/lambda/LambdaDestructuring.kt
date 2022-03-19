package functions.lambda

/**
 * 'Деструктуризация'
 */

fun main() {
    createAndPrintPerson("Person", 21)
    { println("name: ${it.name}, age: ${it.age}") } // name: Person, age: 21

    // divide into variables
    createAndPrintPerson("Person", 21)
    { (name, age) -> println("name: $name, age: $age") } // name: Person, age: 21

    // when we need only one variable
    createAndPrintPerson("Person", 21)
    { (name, _) -> println("name: $name") } // name: Person
}

data class Person(val name: String, val age: Int)

fun createAndPrintPerson(name: String, age: Int, operation: (Person) -> Unit) {
    val person = Person(name, age)
    operation(person)
}
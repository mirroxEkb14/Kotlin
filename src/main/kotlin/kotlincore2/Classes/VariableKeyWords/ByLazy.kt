package Introduction.Classes.VariableKeyWords

/**
 * The variable will be initialized then it is needed
 * (the type of the variable is always 'val')
 */

fun main() {
    val myAnimal = Animal()
    println(myAnimal.name) // Martin
}

class Animal {
    val name: String by lazy {
        "Martin"
    }
}

package Introduction.Classes.VariableKeyWords

/**
 * When we have lots of variables that are used in some methods,
 * we do not need all the variables at once when we create
 * a class instance
 */

fun main() {
    val myMob = Mob()
    myMob.initName("Bob")
    println(myMob.name) // Bob
}

// 'kotlin.UninitializedPropertyAccessException' can be thrown if the variable
// will not be initialized
class Mob {
    lateinit var name: String

    fun initName(passedName: String) {
        name = passedName
    }
}
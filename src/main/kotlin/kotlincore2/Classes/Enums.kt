package Introduction.Classes

fun main() {
    println(Weapons.DAGGER) // DAGGER
    println(Weapons.SWORD.profession) // warrior
    println(Weapons.SWORD.getElite(true)) // elite warrior
}

/**
 * Enums can contain variables, we can call them
 * In enums we can write functions
 */

enum class Weapons(val profession: String) {
    SWORD("warrior"),
    DAGGER("rouge"),
    STAFF("mage"),
    BOW("archer");

    fun getElite(isElite: Boolean) {
        if (isElite) "elite $profession"
        else profession
    }
}

class Enums {
}
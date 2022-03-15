package classes

fun main() {
    println(Weapon.DAGGER.profession)
    println(Weapon.SWORD.getElite(true))
}

enum class Weapon(val profession: String) {
    SWORD("warrior"),
    DAGGER("rouge"),
    BOW("mage");

    fun getElite(isElite: Boolean) =
        if (isElite) {
            "elite $profession"
        } else {
            profession
        }
}
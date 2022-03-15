package Introduction.Classes.VariableKeyWords

fun main() {

    // 'toString' method is overridden
    println(Character("Martin", "Warrior")) // Character(name=Martin, profession=Warrior)

    // 'equals()', 'hashCode()' methods are overridden
    println(NoDataCharacter("Martin", "Warrior") == NoDataCharacter("Martin", "Warrior")) // false
    println(Character("Martin", "Warrior") == Character("Martin", "Warrior")) // true

    // there is a 'copy()' method that allows to copy the whole object and change passed fields
    val martinWarrior = Character("Martin", "Warrior") // Character(name=Martin, profession=Warrior)
    val martinArcher = martinWarrior.copy(profession = "Archer") // Character(name=Martin, profession=Archer)

    // Destructuring declarations - when we divide the class fields into variables
    val martinMage = Character("Martin", "Mage")
    val (name, profession) = martinMage
    println("name: $name and profession: $profession") // name: Martin and profession: Mage

}

data class Character(val name: String, val profession: String)

class NoDataCharacter(val name: String, val profession: String)

class DataClasses {
}
package classes.keywords

/**
 * These two classes are the same, but the 'data' class has:
 *      'toString' method
 *      'equals/hashcode' methods
 *      'copy' method
 *      'Destructuring declarations' - splitting of class fields
 */

fun main() {
    println(NoDataClassCharacter("Bob", "Mage")) // classes.keywords.NoDataClassCharacter@58372a00
    println(Character("Martin", "Warrior")) // Character(name=Martin, profession=Warrior)

    println(NoDataClassCharacter("Bob", "Mage") == NoDataClassCharacter("Bob", "Mage")) // compare object links
    println(Character("Martin", "Warrior") == Character("Martin", "Warrior")) // compare the fields

    val martinWarrior = Character("Martin", "Warrior")
    println(martinWarrior)
    val martinArcher = martinWarrior.copy(profession = "Archer") // the same object but 'profession' is different
    println(martinArcher)

    val (name, profession) = martinArcher
    println("name: $name, profession: $profession") // name: Martin, profession: Archer
}

data class Character(val name: String, val profession: String)

class NoDataClassCharacter(val name: String, val profession: String)
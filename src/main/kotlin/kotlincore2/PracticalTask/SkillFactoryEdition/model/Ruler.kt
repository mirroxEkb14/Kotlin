package Introduction.PracticalTask.SkillFactoryEdition.model

/**
 * This is a king of the kingdom. The king has heirs, so the class
 * is 'open'. Contains the main variables: name, intellect, power
 * (all the heirs will have them, too)
 */

open class Ruler(val name: String) {
    var intellect = 10.0
    var power = 10.0

    companion object {
        fun geroldGreetings() {
            println("The King is in the building")
        }
    }
}
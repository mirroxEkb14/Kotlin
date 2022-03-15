package Introduction.PracticalTask.Project.util

/**
 * Enum contains all available types of warriors
 * and their weapon type
 */

enum class Specialization(weapon: Weapon) {
    BOWMAN(Introduction.PracticalTask.Project.util.Weapon.BOW),
    CROSSBOWMAN(Introduction.PracticalTask.Project.util.Weapon.CROSSBOW),
    SWORDMAN(Introduction.PracticalTask.Project.util.Weapon.SWORD),
    AXEMAN(Introduction.PracticalTask.Project.util.Weapon.AXE)
}
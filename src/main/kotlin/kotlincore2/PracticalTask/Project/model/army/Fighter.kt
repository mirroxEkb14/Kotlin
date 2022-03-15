package Introduction.PracticalTask.Project.model.army

import Introduction.PracticalTask.Project.util.Printable
import Introduction.PracticalTask.Project.util.Specialization
import Introduction.PracticalTask.Project.util.Weapon
import java.lang.IllegalArgumentException

/**
 * The fighter in our army includes all specializations in
 * 'Specialization' enum
 *
 * In 'init' block we set a fighter by his specialization
 *
 * 'type' field is 'val' -> if a fighter is an archer, he cannot change
 *      his specialization to, for example, warrior
 * 'weapon' field is 'var' ->
 * 'force' field is 'var' ->
 * 'agility' field is 'var' ->
 */

data class Fighter(val specialization: Specialization) : Printable {
    val type: String
    var weapon: String
    var force: Int
    var agility: Int

    init {
        when (specialization) {
            Specialization.BOWMAN -> {
                type = "Archer"
                weapon = "Bow"
                force = 5
                agility = 10
            }

            Specialization.CROSSBOWMAN -> {
                type = "Archer"
                weapon = "CrossBow"
                force = 10
                agility = 5
            }

            Specialization.SWORDMAN -> {
                type = "SwordMan"
                weapon = "Sword"
                force = 15
                agility = 20
            }

            Specialization.AXEMAN -> {
                type = "AxeMan"
                weapon = "Axe"
                force = 20
                agility = 15
            }
        }
    }

    override fun print() {
        println("Type: $type\nWeapon: $weapon\nForce: $force\nAgility: $agility")
    }

    fun setWeapon(weapon: Weapon) {
        when (weapon) {
            Weapon.COMPOSITE_BOW -> this.weapon = "Composite bow"
            Weapon.COMPOSITE_CROSSBOW -> this.weapon = "Composite crossbow"
            Weapon.COMPOSITE_SWORD -> this.weapon = "Composite sword"
            Weapon.COMPOSITE_AXE -> this.weapon = "Composite axe"
            else -> throw IllegalArgumentException("Wrong weapon - $weapon")
        }
    }
}

package Introduction.PracticalTask.Project.service

import Introduction.PracticalTask.Project.model.army.Fighter
import Introduction.PracticalTask.Project.util.Specialization
import Introduction.PracticalTask.Project.util.Weapon

/**
 * Contains all the necessary tools to interact with the army.
 * The army itself is here.
 */

class ArmyService {

    private val army = formArmy()

    // army = [ [SWORDMEN are here], [AXEMEN are here], [CROSSBOWMEN are here], [BOWMEN are here] ]
    private fun addSoldiers(garrison: Map<Specialization, Int>) {
        garrison.forEach { specializedGarrison ->

            val soldiersType = specializedGarrison.key
            val soldiersAmount = specializedGarrison.value

            when (soldiersType) {
                Specialization.SWORDMAN -> {
                    repeat(soldiersAmount) {
                        army[0].add(Fighter(Specialization.SWORDMAN))
                    }
                }

                Specialization.AXEMAN -> {
                    repeat(soldiersAmount) {
                        army[1].add(Fighter(Specialization.AXEMAN))
                    }
                }
                Specialization.CROSSBOWMAN -> {
                    repeat(soldiersAmount) {
                        army[2].add(Fighter(Specialization.CROSSBOWMAN))
                    }
                }
                Specialization.BOWMAN -> {
                    repeat(soldiersAmount) {
                        army[3].add(Fighter(Specialization.BOWMAN))
                    }
                }
            }
        }
    }

    fun increaseArmy(vararg garrisons: Pair<Specialization, Int>) {
        garrisons.forEach { garrison ->
            addSoldiers(mapOf(garrison))
        }
    }

    // returns (BOWMAN, 50)
    fun formGarrison(garrisonType: Specialization, soldiersAmount: Int) = Pair(garrisonType, soldiersAmount)

    // returns [ [], [], [], [] ]
    private fun formArmy(): List<MutableList<Fighter>> {
        val template = mutableListOf<MutableList<Fighter>>()
        val soldersTypesAmount = Specialization.values().size

        repeat(soldersTypesAmount) { template.add(mutableListOf()) }
        return template
    }

    fun upgradeArmy(specialization: Specialization? = null) {
        when (specialization) {
            null -> {
                army.forEach { garrison ->
                    garrison.forEach { fighter ->
                        when (fighter.specialization) {
                            Specialization.BOWMAN -> { fighter.setWeapon(Weapon.COMPOSITE_BOW) }
                            Specialization.CROSSBOWMAN -> { fighter.setWeapon(Weapon.COMPOSITE_CROSSBOW) }
                            Specialization.SWORDMAN -> { fighter.setWeapon(Weapon.COMPOSITE_SWORD) }
                            Specialization.AXEMAN -> { fighter.setWeapon(Weapon.COMPOSITE_AXE) }
                        }
                    }
                }
            }
            Specialization.SWORDMAN -> army[0].forEach { fighter -> fighter.setWeapon(Weapon.COMPOSITE_SWORD) }
            Specialization.AXEMAN -> army[1].forEach { fighter -> fighter.setWeapon(Weapon.COMPOSITE_AXE) }
            Specialization.CROSSBOWMAN -> army[2].forEach { fighter -> fighter.setWeapon(Weapon.CROSSBOW) }
            Specialization.BOWMAN -> army[3].forEach { fighter -> fighter.setWeapon(Weapon.BOW) }
        }
    }

    fun showForces() {
        army.forEach { garrison ->
            println(garrison)
        }
    }

    fun showGarrisons() {
        army.forEach { garrison ->
            println("Soldiers type: ${garrison[0].specialization}\nForces: ${garrison.size}")
        }
    }
}
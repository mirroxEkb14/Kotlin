package Introduction.PracticalTask.Project

import Introduction.PracticalTask.Project.model.monarchy.Heir
import Introduction.PracticalTask.Project.model.monarchy.Ruler
import Introduction.PracticalTask.Project.service.ArmyService
import Introduction.PracticalTask.Project.service.HeirService
import Introduction.PracticalTask.Project.service.PeasantService
import Introduction.PracticalTask.Project.service.taxes.TaxService
import Introduction.PracticalTask.Project.util.Occupation
import Introduction.PracticalTask.Project.util.Specialization

fun main() {
    val kingdom = Kingdom()

    Ruler.geroldGreetings()

    "we are under attack!".yourHighness()

    println("The King itself: ")
    kingdom.ruler.print()

    println("\nThe King heirs: ")
    kingdom.heirService.showHeirs()

    kingdom.armyService.upgradeArmy()
    println("\nThe Great Army: ")
    kingdom.armyService.showForces()

    println("\nCertain garrisons: ")
    kingdom.armyService.showGarrisons()

    println("\nFolks: ")
    kingdom.peasantService.showPeasants()

    println("\nCertain folks: ")
    kingdom.peasantService.showByTypes()

    println("\nTaxes from all peasants: ")
    kingdom.taxService.showTreasury()

    println("\nTaxes from certain peasants: ")
    kingdom.taxService.showCertain(Occupation.WORKER)
    kingdom.taxService.showCertain(Occupation.BUILDER)
    kingdom.taxService.showCertain(Occupation.FARMER)

    println("\nFolks are getting acquainted: ")
    kingdom.peasantService.giveFunToPeasants()

    println("\nThe heir of the Throne is: ")
    kingdom.showThroneHeir()
}

class Kingdom {
    val heirService = HeirService()
    val armyService = ArmyService()
    val peasantService = PeasantService()

    val taxService = TaxService()

    val ruler = Ruler("Arthur")

    init {
        heirService.addHeirs(2)
        armyService.apply {
            increaseArmy(
                formGarrison(Specialization.BOWMAN, 50),
                formGarrison(Specialization.CROSSBOWMAN, 30),
                formGarrison(Specialization.SWORDMAN, 100),
                formGarrison(Specialization.AXEMAN, 70)
            )
        }
        peasantService.addPeasants(100)
        taxService.collect(peasantService.peasants)
    }

    private fun throneHeir(): Heir = heirService.getHeirs().maxByOrNull { it.force + it.intellect }!!

    fun showThroneHeir() { println(throneHeir()) }
}

fun String.yourHighness() = println("Your Highness, $this")
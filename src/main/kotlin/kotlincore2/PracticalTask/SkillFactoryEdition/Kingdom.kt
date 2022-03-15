package Introduction.PracticalTask.SkillFactoryEdition

import Introduction.PracticalTask.SkillFactoryEdition.model.*
import Introduction.PracticalTask.SkillFactoryEdition.service.WheelOfFortune
import Introduction.PracticalTask.SkillFactoryEdition.util.Occupation

fun main() {
    val kingdom = Kingdom()

    println("name: ${ kingdom.ruler.name }, intellect: ${ kingdom.ruler.intellect }, power: ${ kingdom.ruler.power }")

    kingdom.heirs.forEach {
        println("name: ${ it.name }, intellect: ${ it.intellect }, power: ${ it.power }")
    }

    println(kingdom.archersGarrison)
    println(kingdom.warriorGarrison)
    println(kingdom.peasants)
    println(kingdom.treasury)

    "We are under attack!".yourHighness()
}

class Kingdom {

    // all the heirs are stored in the list
    val heirs = mutableListOf<Heir>()

    // the army is stored in garrisons
    val archersGarrison = mutableListOf<Archer>()
    val warriorGarrison = mutableListOf<Warrior>()
    val peasants = mutableListOf<Peasant>()

    var treasury = 0

    val ruler = Ruler("Author")
    private val wheelOfFortune = WheelOfFortune()

    init {
        addHeirs(4)
        addArchers(19)
        addWarriors(29)
        addPeasants(99)

        upgradeArchers(archersGarrison) { println(it) }
        upgradeWarriors(warriorGarrison) { println(it) }

        val workerTaxCollector = object: TaxCollector() {
            override fun collect() {
                val taxGroup = peasants.filter { it.occupation == Occupation.WORKER }
                treasury += taxGroup.size
            }
        }

        val builderTaxCollector = object: TaxCollector() {
            override fun collect() {
                val taxGroup = peasants.filter { it.occupation == Occupation.WORKER }
                treasury += taxGroup.size * 2
            }
        }

        val farmerTaxCollector = object: TaxCollector() {
            override fun collect() {
                val taxGroup = peasants.filter { it.occupation == Occupation.WORKER }
                treasury += taxGroup.size * 3
            }
        }

        workerTaxCollector.collect()
        builderTaxCollector.collect()
        farmerTaxCollector.collect()

        giveFunToPeasants(peasants)
    }

    private fun giveFunToPeasants(peasants: List<Peasant>) {
        peasants.forEach { firstPeasant ->
            peasants.forEach { secondPeasant ->
                if(firstPeasant.occupation == secondPeasant.occupation) println("Hi colleague!")
                else println("See you for the first time...")
            }
        }
    }

    private fun upgradeArchers(archers: List<Archer>, operation: (List<Archer>) -> Unit) {
        archers.forEach { archer ->
            archer.bow = "Composite bow"
        }

        operation(archers)
    }

    private fun upgradeWarriors(warriors: List<Warrior>, operation: (List<Warrior>) -> Unit) {
        warriors.forEach { warrior ->
            warrior.weapon = "FrostMorn"
        }

        operation(warriors)
    }

    private fun taxCalculator(taxGroupSize: Int, multiplier: Int): Int = taxGroupSize * multiplier

    private fun addHeirs(amount: Int) {
        for (i in 1..amount) {
            heirs.add(Heir("Heir $i", wheelOfFortune))
        }
    }
    private fun addArchers(amount: Int) {
        for (i in 0..amount) {
            if (i % 2 == 0) archersGarrison.add(Archer("Dagger"))
            else archersGarrison.add(Archer("None"))
        }
    }
    private fun addWarriors(amount: Int) {
        for (i in 0..amount) {
            if (i % 2 == 0) warriorGarrison.add(Warrior("Sword"))
            else warriorGarrison.add(Warrior("Axe"))
        }
    }
    private fun addPeasants(amount: Int) {
        for (i in 0..amount) {
            when {
                i % 3 == 0 -> peasants.add(Peasant(Occupation.FARMER))
                i % 2 == 0 -> peasants.add(Peasant(Occupation.BUILDER))
                else -> peasants.add(Peasant(Occupation.WORKER))
            }
        }
    }
}

fun String.yourHighness() = println("Your Highness, $this")
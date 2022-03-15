package Introduction.PracticalTask.Project.service

import Introduction.PracticalTask.Project.model.peasants.Peasant
import Introduction.PracticalTask.Project.util.Occupation

class PeasantService {

    val peasants = formPeasants()

    fun addPeasants(amount: Int) {
        repeat(amount) { times ->
            when {
                times % 3 == 0 -> peasants[0].add(Peasant(Occupation.FARMER))
                times % 2 == 0 -> peasants[1].add(Peasant(Occupation.BUILDER))
                else -> peasants[2].add(Peasant(Occupation.WORKER))
            }
        }
    }

    // returns [ [], [], [] ]
    private fun formPeasants(): List<MutableList<Peasant>> {
        val template = mutableListOf<MutableList<Peasant>>()
        val soldersTypesAmount = Occupation.values().size

        repeat(soldersTypesAmount) { template.add(mutableListOf()) }
        return template
    }

    fun giveFunToPeasants() {
        peasants.forEach { peasantGroup1 ->
            peasantGroup1.forEach { peasant1 ->
                peasants.forEach { peasantGroup2 ->
                    peasantGroup2.forEach { peasant2 ->
                        if (peasant1.occupation == peasant2.occupation) println("Hey colleague!")
                        else println("See you for the first time...")
                    }
                }
            }
        }
    }

    fun showPeasants() {
        println("${peasants.joinToString("\n")}\nAmount: ${peasants[0].size + peasants[1].size + peasants[2].size}")
    }

    fun showByTypes() {
        peasants.forEach { peasantsOfCertainType ->
            println("Folk occupation: ${peasantsOfCertainType[0].occupation}\nAmount: ${peasantsOfCertainType.size}")
        }
    }
}
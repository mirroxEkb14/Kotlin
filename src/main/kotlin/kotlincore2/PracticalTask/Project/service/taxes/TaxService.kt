package Introduction.PracticalTask.Project.service.taxes

import Introduction.PracticalTask.Project.model.peasants.Peasant
import Introduction.PracticalTask.Project.util.Occupation

class TaxService() {

    private var treasury = 0

    private var workerTaxes = 0
    private var builderTaxes = 0
    private var farmerTaxes = 0

    fun collect(peasants: List<List<Peasant>>, occupation: Occupation? = null): Int {
        when (occupation) {
            null -> {
                workerTaxCollector(peasants).collect()
                builderTaxCollector(peasants).collect()
                farmerTaxCollector(peasants).collect()
                return treasury
            }
            Occupation.WORKER -> {
                workerTaxCollector(peasants).collect()
                return workerTaxes
            }
            Occupation.BUILDER -> {
                builderTaxCollector(peasants).collect()
                return builderTaxes
            }
            Occupation.FARMER -> {
                farmerTaxCollector(peasants).collect()
                return farmerTaxes
            }
            else -> return -1
        }
    }

    private fun farmerTaxCollector(peasants: List<List<Peasant>>) = object: TaxCollector() {
        override fun collect() {
            val taxesAmount = peasants[0].size * 3
            treasury += taxesAmount
            farmerTaxes += taxesAmount
        }
    }

    private fun builderTaxCollector(peasants: List<List<Peasant>>) = object: TaxCollector() {
        override fun collect() {
            val taxesAmount = peasants[1].size * 2
            treasury += taxesAmount
            workerTaxes += taxesAmount
        }
    }

    private fun workerTaxCollector(peasants: List<List<Peasant>>) = object: TaxCollector() {
        override fun collect() {
            val taxesAmount = peasants[2].size
            treasury += taxesAmount
            builderTaxes += taxesAmount
        }
    }

    fun showTreasury() {
        println("King`s treasury: $treasury gold")
    }

    fun showCertain(occupation: Occupation) {
        when (occupation) {
            Occupation.WORKER -> println("Workers: $workerTaxes")
            Occupation.BUILDER -> println("Builders: $builderTaxes")
            Occupation.FARMER -> println("Farmers: $farmerTaxes")
        }
    }
}
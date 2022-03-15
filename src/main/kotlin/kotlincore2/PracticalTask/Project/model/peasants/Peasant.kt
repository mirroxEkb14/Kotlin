package Introduction.PracticalTask.Project.model.peasants

import Introduction.PracticalTask.Project.util.Occupation
import Introduction.PracticalTask.Project.util.Printable

data class Peasant(val occupation: Occupation) : Printable {

    override fun print() {
        println("Occupation: $occupation")
    }
}
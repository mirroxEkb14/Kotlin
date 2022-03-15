package Introduction.PracticalTask.Project.service

import Introduction.PracticalTask.Project.model.monarchy.Heir

/**
 * Contains all the necessary tools to interact with king`s heirs.
 * All the heirs themselves are here.
 */

class HeirService {

    private val heirs = mutableListOf<Heir>()

    fun addHeirs(amount: Int) {
        for (i in 1..amount) {
            heirs.add(Heir("Heir $i"))
        }
    }

    fun getHeirs() = heirs

    fun showHeirs() {
        heirs.forEach { heir ->
            println("-----------------\nName: ${heir.name}\nIntellect: ${heir.intellect}\nForce: ${heir.force}")
        }
    }
}
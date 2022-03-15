package Introduction.PracticalTask.Project.model.monarchy

import Introduction.PracticalTask.Project.util.Printable

/**
 * The ruler takes a name as an argument and passes it
 * to the parent abstract class 'Noble'
 *
 * 'open' because classes in Kotlin are 'final' by default
 * and we have 'Heir' class that must inherit this class
 */

open class Ruler(name: String) : Noble(name), Printable {

    // the ruler has higher stats(twice as much)
    init {
        intellect += 10
        force += 10
    }

    override fun print() {
        println("Name: $name\nIntellect: $intellect\nForce: $force")
    }

    companion object {
        fun geroldGreetings() {
            println("His Majesty is in the building")
        }
    }
}
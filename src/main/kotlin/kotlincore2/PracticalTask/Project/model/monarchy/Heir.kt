package Introduction.PracticalTask.Project.model.monarchy

import Introduction.PracticalTask.Project.util.Printable

class Heir( name: String) : Ruler(name), Printable {

    init {
        intellect += (0..5).random()
        force += (0..5).random()
    }

    override fun toString(): String {
        return "Name: $name\nIntellect: $intellect\nForce: $force"
    }
}
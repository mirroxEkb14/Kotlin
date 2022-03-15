package Introduction.Classes.VariableKeyWords

/**
 * We can specify our own variable
 */

fun main() {

}

class BackingProperty {
    private var _name: String = "Bob"

    var name: String
        get() = _name
        set(value) { _name = value }
}
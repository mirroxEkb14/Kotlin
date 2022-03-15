package Introduction.Classes.VariableKeyWords

/**
 * When the field has a getter and a setter, it is called 'property'
 */

fun main() {

}

class BackingField {
    var name: String = "Bob"
        get() = field
        set(value) { field = value }
}
package classes.keywords

/**
 * Instead of the "field" word we use our own variable (_name)
 */

class BackingProperty {
    private var _name: String = "Bob"

    private var name: String
        get() = _name
        set(value) {
            _name = value
        }
}
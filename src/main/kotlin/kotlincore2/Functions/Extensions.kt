package Introduction.Functions

fun main() {
    val extensionString = "Wake up".addUrgent(10)
    println(extensionString) // Wake up!!!!!!!!!!

    20.quickPrint() // 20

    50.sqrt.quickPrint() // 2500

    val nullString: String? = null
    nullString.defaultIfNull("ITS NULL").quickPrint() // ITS NULL
    val nonNullString = "null"
    nonNullString.defaultIfNull("ITS NULL").quickPrint() // null

}

// now every 'String' has this method that adds to the string "!" sign by
// passed amount of times(if nothing is passed, the method will add one time)
fun String.addUrgent(amount: Int = 1) = this + "!".repeat(amount)

// no need to use 'println()' anymore, just this method
// (works with any type)
fun <T> T.quickPrint(): T {
    println(this)
    return this
}

// call this method on any 'Int' type
val Int.sqrt
    get() = this * this

// calls on any 'String' type, if the string if 'null', returns
// the passed value(default), if not null, returns the string itself
fun String?.defaultIfNull(default: String) = this ?: default
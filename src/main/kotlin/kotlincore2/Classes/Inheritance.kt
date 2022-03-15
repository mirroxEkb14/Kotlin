package Introduction.Classes

fun main() {
    // real name + nickname
    val user = User("real name", "nickname")

    // only nickname
    val onlyNick = User("nickname")
}

// each sport car is a car, so we 'extends' the Car class
// and say that all the sport cars have four wheels
private class SportCar : Car(4) {

}

private open class Car(val wheels: Int) {

    fun drive() {
        println("The car is driving")
    }
}

// for example, we have a program where a user can choose: enter either a real name + nickname,
// a real name or a nickname, so we create secondary constructor, where a user can pass only nickname
private class User(val name: String, val nickname: String) {

    constructor(nickname: String) : this("None", nickname)
}

class Inheritance {

    /**
     * 'extends' in Java, ':' in Kotlin
     *
     * All Kotlin classes inherit from the 'Any' class that has three
     * methods: equals(), hashCode(), toString()
     *
     * By default, all the classes are 'final'(cannot be inherited)
     * 'open' keyword allows a class to be inherited
     */
}
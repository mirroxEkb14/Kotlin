package Introduction.Classes

abstract class Human {
    abstract fun think()

    fun talk() {
        println("talking...")
    }
}

class Doctor : Human() {
    override fun think() {
        println("Critical Thinking")
    }
}

class Artist : Human() {
    override fun think() {
        println("Virtual Thinking")
    }
}

abstract class AbstractClasses {
}
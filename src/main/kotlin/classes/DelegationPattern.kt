package classes

/**
 * We have an interface that is implemented in "AnimaImpl" class.
 * Now we need this realization in our class
 */

fun main() {
    val predator = Predator(AnimalImpl())
    predator.eat() // eating...
}

class Predator(animalImpl: AnimalImpl): Animal by animalImpl

class AnimalImpl: Animal {
    override fun eat() {
        println("eating...")
    }

}

interface Animal {
    fun eat()
}

// second variant
class DelegationPattern {
    fun main() {
        val predator = AnimalPredator(AnimalImplEx())
        predator.eat()
    }

    // now we need the method in a class
    class AnimalPredator (animalImpl: AnimalImplEx) : AnimalEx by animalImpl

    // without delegation support in Kotlin we have to write like this:
    class PredatorPattern {
        val animalImpl = AnimalImplEx()

        fun initEat() {
            animalImpl.eat()
        }
    }

    // interface that has a method that must be implemented
    // in all the classes that take this interface
    interface AnimalEx {
        fun eat()
    }

    // class that implements the method of the interface
    class AnimalImplEx : AnimalEx {
        override fun eat() {
            println("eating...")
        }
    }
}
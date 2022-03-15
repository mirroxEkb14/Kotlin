package Introduction.Classes

fun main() {
    val predator = Predator()
    predator.initEat() // eating...
    mainSimplified() // eating...
}

// interface with methods that must be implemented by all inherited classes
interface Animal {
    fun eat() // this method must be overridden in each inherited class
}

// the interface is implemented(all the methods are overridden)
class AnimalImpl : Animal {
    override fun eat() {
        println("eating...")
    }
}

// the class where we need this implementation
class Predator {
    private val animalImpl = AnimalImpl()

    fun initEat() {
        animalImpl.eat()
    }
}

/* All the code above can be simplified */

fun mainSimplified() {
    val animalImpl = AnimalImpl()
    val predator = PredatorSimplified(animalImpl)
    predator.eat() // eating...
}

class PredatorSimplified(animalImpl: AnimalImpl) : Animal by animalImpl
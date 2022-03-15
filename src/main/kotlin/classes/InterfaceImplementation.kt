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
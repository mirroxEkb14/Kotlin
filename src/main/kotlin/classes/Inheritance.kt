package classes

/**
 * Like in Java we have "Object" class, in Kotlin there is "Any"
 * It has three methods: equals(), hashCode() и toString().
 * By default, all the classes are 'final'. So there is the 'open'
 * keyword. It uses when we want this class to be inherited(parent class).
 */

fun main() {

}

class Inheritance : ParentClass()

open class ParentClass
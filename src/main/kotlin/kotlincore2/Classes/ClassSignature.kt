package Introduction.Classes

fun main() {
    val myAccount = PersonAccount(7187)
    println("Account id -> ${ myAccount.id }\nAccount balance -> ${ myAccount.balance }")
}

// secondary constructor allows to pass only one argument, while
// the second one will be set by default
private class PersonAccount(val id: Long, val balance: Long) {
    constructor(id: Long): this(id, 0)
}

class ClassSignature(val a: Int, val b: Int) {

    /**
     * Access modifiers
     *  private -> visible only in the file it was created
     *  internal -> visible in the module(it is a collection of classes)
     *  inner -> same as 'private' but it is created inside the class
     *  public -> visible from any program part
     */
}
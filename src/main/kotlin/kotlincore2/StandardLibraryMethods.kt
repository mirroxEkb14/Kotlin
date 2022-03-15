package Introduction

fun main() {

    // apply ->  used to set up object configuration, change 'receiver', returns it

    // For example, we have a list and we need to change it. Without '.apply{}' method
    // we have to specify the list explicitly and call methods on the object
    val listNotToApply = mutableListOf(1, 3, 2, 4)

    listNotToApply.add(0)
    listNotToApply.removeAt(4)
    listNotToApply.sort()
    listNotToApply.clear()

    // With '.apply()' method the code is more readable and concise, no need
    // to specify the object explicitly
    val listToApply = mutableListOf(1, 3, 2, 4).apply {
        add(0)
        removeAt(4)
        sort()
        clear()
    }


    // let -> the method passes 'it', performs all the necessary actions and returns it,
    // does not change or return 'receiver', just apply it
    val listToLet = mutableListOf(1, 3, 2, 4).first().let {
        it + it * 100
    } // 101

    // can be used instead of 'if-else' constructor
    fun sayHey(name: String?): String { // takes a 'String' that can be 'null'
        return name?.let { "Hey, $it" } ?: "Hey, stranger"
    }


    // run -> takes after 'apply' method, but returns the last string in lambda expression,
    // not 'receiver' like 'apply'
    val listToRun = mutableListOf(1, 3, 2, 4).run { size == 4 } // true


    // with -> same as 'run' but has another syntax, it is better to give your preference
    // to 'run' method
    val listWith = with(mutableListOf(1, 3, 2, 4)) { size == 4 }


    // also -> same as 'let', but 'let' returns the result of lambda expression,
    // 'also' returns 'receiver'
    val listAlso = mutableListOf(1, 3, 2, 4)
        .also { it.sort() }
        .also { println(it) } // [1, 2, 3, 4]


    // takeIf -> checks the condition passed in lambda(Predicate), if the condition
    // is met, returns 'receiver', 'null' otherwise
    val listToTakeIf = mutableListOf(1, 3, 2, 4)
        .takeIf { it.size == 4 } ?.get(3) // get the third element if the size is 4, 'null' otherwise

}
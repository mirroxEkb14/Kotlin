package functions

fun main() {
    //-------------------------

    // apply - object configuration settings (do not pass a receiver)

    // without 'apply'
    val applyList1 = mutableListOf(1, 2, 3, 4)
    applyList1.add(5)
    applyList1.remove(4)
    applyList1.sort()
    applyList1.clear()

    // with 'apply'
    val applyList2 = mutableListOf(1, 2, 3, 4)
    applyList2.apply {
        add(5)
        remove(4)
        sort()
        clear()
    }

    //--------------------------

    // let - passes a receiver and returns the last string in lambda,
    // does not change the receiver (used with null-checks)
    println(sayHelloWithoutLet(null)) // Hey, stranger
    println(sayHelloWithLet("Joshua")) // Hey, Joshua

    //--------------------------

    // run - same as 'apply' but returns the result of lambda
    val runList = mutableListOf(1, 2, 3, 4).run {
        size == 4
    }
    println(runList) // true

    //--------------------------

    // same as 'run' but has another implementation
    val withList = with(mutableListOf(1, 3, 2, 4)) {
        size == 4
    }

    //-------------------------

    // also - same as 'let' but returns a receiver
    mutableListOf(1, 2, 3 ,4)
        .also { it.sort() }
        .also { println(it) } // [1, 2, 3, 4]

    //-------------------------

    // takeIf - use when we want to make a check before doing anything
    // we can consider it as if-else block
    val takeIfList = mutableListOf(1, 2, 3, 4).takeIf {
        it.size == 4
    }?.get(3) // if the size of the list is 4, we get the third element
}

fun sayHelloWithLet(name: String?): String {
    // 'name' passed to lambda expression
    return name?.let {
        "Hey, $it"
    } ?: "Hey, stranger"
}

fun sayHelloWithoutLet(name: String?): String {
    return if (name != null) {
        "Hey, $name"
    } else {
        "Hey, stranger"
    }
}
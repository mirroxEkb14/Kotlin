package Introduction.Tasks.SFCollections

/**
 * Разделите список на два списка по профессии
 */

fun main() {
    val dividerTask = DividerTask()

    dividerTask.divideAndPrint1()
    dividerTask.divideAndPrint2()
}

class DividerTask {
    val list = listOf(
        Person("Ann", "Builder"),
        Person("Bob", "Worker"),
        Person("Judy", "Builder"),
        Person("Doris", "Worker"),
        Person("Tommy", "Worker"),
        Person("Jim", "Builder"),
        Person("Sam", "Worker"),
        Person("Colin", "Builder"),
        Person("Connor", "Worker"),
        Person("Vick", "Builder"),
        Person("Polly", "Worker"),
        Person("Angela", "Builder")
    )

    fun divideAndPrint1() {
        val map = list.groupBy { it.profession }

        val builders = map
            .filter { it.key == "Builder" }
            .values
            .elementAt(0)

        val workers = map
            .filter { it.key == "Worker" }
            .values
            .elementAt(0)

        println("Builders: $builders\nWorkers: $workers")
    }

    fun divideAndPrint2() {
        val map = list.groupBy { it.profession }

        println("Builders: " + map["Builder"])
        println("Worker: " + map["Worker"])
    }
}

data class Person(val name: String, val profession: String)
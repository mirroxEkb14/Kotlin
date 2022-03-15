package collections

fun main() {
    // creation

    val mutableList = mutableListOf(1, 2, 3)
    val immutableList = listOf(1, 2, 3)

    // get an element

    mutableList[0]

    val elseElement = mutableList.getOrElse(4) { -1 }
    println(elseElement) // -1

    val nullElement = mutableList.getOrNull(4)
    println(nullElement) // null

    // filtration
    val filteredElements = mutableList.filter { it % 2 != 0 }
    println(filteredElements) // [1, 3]

    println(mutableList.take(2)) // [1, 2]
    println(mutableList.takeWhile { it < 3 }) // [1, 2]
    println(mutableList.takeLast(2)) // [2, 3]
    println(mutableList.takeLastWhile { it >= 2 }) // [2, 3]

    println(mutableList.maxOrNull()) // 3
    println(mutableList.minOrNull()) // 1
    println(listOf(Car("Ford", 200, "s"), Car("Ferrari", 300, "a"))
        .maxByOrNull { it.maxSpeed }) // Car(model=Ferrari, maxSpeed=300)
    println(listOf(
        Car("Ford", 200, "s"),
        Car("Ferrari", 300, "a"),
        Car("Koenigsegg", 400, "s"))
        .maxWithOrNull { car1, car2 -> car1.model.length - car2.model.length }) // Car(model=Koenigsegg, maxSpeed=400) (the longest model)

    println(mutableListOf(
        Car(model = "Ferrari", maxSpeed = 300, carClass = "s"),
        Car(model = "Ford", maxSpeed = 200, carClass = "a"),
        Car(model = "Koenigsegg", maxSpeed = 400, carClass = "s"))
        .groupBy { it.carClass }) // {s=[Car(model=Ferrari, maxSpeed=300, carClass=s), Car(model=Koenigsegg, maxSpeed=400, carClass=s)], a=[Car(model=Ford, maxSpeed=200, carClass=a)]}

    println(listOf(1, 1, 1, 2, 2, 3, 3, 3).distinct()) // [1, 2, 3]
    println(mutableListOf(
        Car(model = "Ferrari", maxSpeed = 300, carClass = "s"),
        Car(model = "Ford", maxSpeed = 200, carClass = "a"),
        Car(model = "Koenigsegg", maxSpeed = 400, carClass = "s"))
        .distinctBy { it.carClass }) // //[Car(model=Ferrari, maxSpeed=300, carClass=s), Car(model=Ford, maxSpeed=200, carClass=a)]


    // transformation
    println(mutableListOf(1, 2, 3).map { it + 1 }) // [2, 3, 4]
    println(listOf(listOf(1, 2, 3), listOf(4, 5, 6)).flatMap { it.reversed() }) // [3, 2, 1, 6, 5, 4]
    println(listOf(listOf(1, 2, 3), listOf(4, 5, 6)).flatten()) // [1, 2, 3, 4, 5, 6]
    println(mutableListOf("uno", "dos", "tres").fill("ein")) // [ein, ein, ein]


    // conditions
    println(listOf(1, 2, 3).any {it == 3}) // true
    println(listOf(1, 2, 3).all { it > 0 }) // true
    println(listOf(1, 2, 3).none { it < 0 }) // true
    println(listOf(1, 2, 3).count { it % 2 != 0}) // 2
    println(listOf(1, 2, 3).contains(2)) // true
    println(listOf(1, 2, 3).containsAll(listOf(1, 2))) // true


    // sorting
    println(mutableListOf(1, 2, 3).reverse()) // only mutable lists [3, 2, 1]
    println(listOf(1, 2, 3).reversed()) // only immutable lists [3, 2, 1]
    println(mutableListOf(3, 2, 1).sort()) // only mutable lists [1, 2, 3]
    println(mutableListOf(1, 2, 3).sortDescending()) // only mutable lists [3, 2, 1]
    println(listOf(3, 2, 1).sorted()) // only immutable lists [1, 2, 3]
    println(listOf(1, 2, 3).sortedDescending()) // only immutable lists [3, 2, 1]
    println(mutableListOf(1, 2, 3).shuffle()) // mixes mutable list [1, 3, 2]
    println(listOf(1, 2, 3).shuffled()) // mixes mutable list [1, 3, 2]
    println(listOf(1, 2, 3).average()) // 2.0


    // adding/deleting elements
    println(listOf(1, 2, 3) + listOf(4, 5, 6)) // [1, 2, 3, 4, 5, 6]
    println(listOf(1, 2, 3).plus(4)) // returns a new list [1, 2, 3, 4]
    println(listOf(1, 2, 3).minus(3)) // returns a new list [1, 2]


    // zip
    println(listOf("uno", "dos", "tres").zip(listOf(1, 2, 3, 4))) // [(uno, 1), (dos, 2), (tres, 3)]


    // joinToString
    println(listOf("one", "two", "three").joinToString("/")) // one/two/three
}

data class Car(val model: String, val maxSpeed: Int, val carClass: String)
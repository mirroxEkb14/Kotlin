package Introduction

fun main() {

    // Lists and maps

    // mutable list
    val mutableList = mutableListOf("a", "b", "c")

    // immutable list (methods related to changing the list are unavailable)
    val immutableList = listOf("a", "b", "c")

    // getting a element from the map
    val element1 = immutableList.get(1)
    val element2 = mutableList[1] // like getting an element from an array in Java


    // mutable map
    val map1 = mutableMapOf(Pair("string1", 1), Pair("string2", 2))
    val map2 = mutableMapOf("string1" to 1, "string2" to 2) // infix function


    // Getting elements

    // getOrElse -> for example, if you have a list with the length of 4 and you want
    // to get the 6th element, using usual '.get()' the program will fall with 'ArrayIndexOutOfBoundsException'
    // but using '.getOrElse()', in this case the default lambda expression will be returned
    val getOrElseList = mutableListOf(1, 2, 3, 4)
    val elementOfElse = getOrElseList.getOrElse(6) { -1 }
    println(elementOfElse) // -1

    // getOrNull -> instead of 'ArrayIndexOutOfBoundsException' returns 'null' if the passed index does not exist
    val getOrNullList = mutableListOf(1, 2, 3, 4)
    var elementOfNull = getOrNullList.getOrNull(6)
    println(elementOfNull) // null
    // can be used with Elvis operator
    elementOfNull = getOrNullList.getOrNull(6) ?: -1
    println(elementOfNull) // -1


    // Filtration

    // filter a list according to the passed Predicate
    val listToFilter = mutableListOf(1, 2, 3, 4, 5)
    val filteredList = listToFilter.filter { it % 2 == 0 }
    println(filteredList) // [2, 4]

    // drop -> drops the first passed amount of elements
    val listToDrop = mutableListOf(1, 2, 3, 4, 5)
    listToDrop.drop(2) // [3, 4, 5]
    // dropWhile -> drops while the condition is met
    listToDrop.dropWhile { it <= 3 } // [4, 5]
    // dropLast -> drops starting in the end
    listToDrop.dropLast(2) // [1, 2, 3]
    // dropLastWhile -> drops starting in the ends while the condition is met
    listToDrop.dropLastWhile { it >= 3 } // [1, 2]

    // take -> takes the first amount of elements
    val listToTake = mutableListOf(1, 2, 3, 4, 5)
    listToTake.take(2) // [1, 2]
    // takeWhile -> takes while the condition is met
    listToTake.takeWhile { it <= 3 } // [1, 2, 3]
    // takeLast -> takes starting in the end
    listToTake.takeLast(2) // [4, 5]
    // takeLastWhile -> takes starting in the ends while the condition is met
    listToTake.takeLastWhile { it >= 3 } // [3, 4, 5]

    // max -> returns the max value
    val listOfMaxAndMin = listOf(1, 2, 3, 4, 5)
    val max = listOfMaxAndMin.maxOrNull() // 5
    // min - the min value
    val min = listOfMaxAndMin.minOrNull() // 1

    // maxBy -> the max value according to the passed function
    val carList = listOf(Car("Ford", 200, "a"), Car("Ferrari", 300, "a"))
    val fastestCar = carList.maxByOrNull { it.maxSpeed } // Car(model=Ferrari, maxSpeed=300)

    // maxWith -> use Comparator
    val varList = listOf(
        Car("Ford", 200),
        Car("Ferrari", 300),
        Car("Koenigsegg", 400)
    )
    val longestCarName = carList.maxWithOrNull(
        Comparator { car1, car2 -> car1.model.length - car2.model.length }
    ) // Car(model=Koenigsegg, maxSpeed=400)

    // groupBy -> groups by passed condition, returns map
    val carGroupList = mutableListOf(
        Car(model = "Ferrari", maxSpeed = 300, carClass = "s"),
        Car(model = "Ford", maxSpeed = 200, carClass = "a"),
        Car(model = "Koenigsegg", maxSpeed = 400, carClass = "s")
    )
    val carGroups = carGroupList.groupBy { it.carClass }
    println(carGroups)
    //{s=[Car(model=Ferrari, maxSpeed=300, carClass=s), Car(model=Koenigsegg, maxSpeed=400, carClass=s)],
    // a=[Car(model=Ford, maxSpeed=200, carClass=a)]}

    // distinct -> gets rid of duplicates
    val withDuplicates = listOf(3, 1, 2, 3, 3, 2, 1)
    val withoutDuplicates = withDuplicates.distinct() // [3, 1, 2]

    // distinctBy -> allows to set a check condition
    val carListWithDuplicates = mutableListOf(
        Car(model = "Ferrari", maxSpeed = 300, carClass = "s"),
        Car(model = "Ford", maxSpeed = 200, carClass = "a"),
        Car(model = "Koenigsegg", maxSpeed = 400, carClass = "s")
    )

    val carListWithoutDuplicates = carList.distinctBy { it.carClass }
    println(carListWithoutDuplicates) //[Car(model=Ferrari, maxSpeed=300, carClass=s), Car(model=Ford, maxSpeed=200, carClass=a)]


    // Transformation

    // map -> changes the elements according to the passed logic
    val listToMap = mutableListOf(1, 2, 3, 4, 5)
    val mappedList = listToMap.map { it + 1 } // [2, 3, 4, 5, 6]

    // flatmap -> combine collections into one collection
    val listForAllList1 = listOf(1, 2, 3, 4, 5)
    val listForAllList2 = listOf(6, 7, 8, 9, 10)

    val allList = listOf(listForAllList1, listForAllList2) // [[1, 2, 3, 4, 5], [6, 7, 8, 9, 10]]

    val flatMappedList = allList.flatMap { it.reversed() } // [5, 4, 3, 2, 1, 10, 9, 8, 7, 6]

    // flatten -> two lists to one
    val flattenList = allList.flatten() // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    // fill -> fills the collection with the passed element
    val listToFill = mutableListOf("one", "two", "three")
    listToFill.fill("num") // [num, num, num]


    // Conditions

    // any, all, none
    val listForConditions = listOf(1, 2, 3, 4, 5)
    val isThereFive = listForConditions.any { it == 5 } // true
    val isBiggerThanZero = listForConditions.all { it > 0 } // true
    val isLessThanZero = listForConditions.none { it < 0 } // true

    // count -> returns the amount of elements that satisfy the Predicate conditions
    val listToCount = listOf(1, 2, 3, 4, 5)
    val oddsCount = listToCount.count { it % 2 != 0 } // 3

    // contains -> checks if there is the passed ELEMENT in the list
    val listToContain = listOf("a", "b", "c")
    val ifContains1 = listToContain.contains("b") // true

    // containsAll -> checks if there is the passed ELEMENTS in the list
    val ifContains2 = listToContain.containsAll(listOf("a", "c")) // true


    // Sorting

    // reverse -> works with mutable lists, reversed -> with immutable
    val mutableListToReverse = mutableListOf(1, 2, 3, 4, 5)
    val immutableListToReverse = listOf(1, 2, 3, 4, 5)

    mutableListToReverse.reverse()
    immutableListToReverse.reversed()

    // sort -> sorts the list in the ascending order, sortDescending -> in the descending order
    // the methods change the list (only mutable lists)
    val mutableListToSort = mutableListOf(1, 2, 3, 4, 5)
    mutableListToSort.sort() // [1, 2, 3, 4, 5]
    mutableListToSort.sortDescending() // [5, 4, 3, 2, 1]

    // sorted, sortedDescending -> the methods create a new list (only immutable lists)
    val immutableListToSort = listOf(1, 2, 3, 4, 5)
    immutableListToSort.sorted() // [1, 2, 3, 4, 5]
    immutableListToSort.sortedDescending() // [5, 4, 3, 2, 1]

    // shuffle -> shuffles the list randomly
    val listToShuffle = mutableListOf(1, 2, 3)
    listToShuffle.shuffle() // [1, 3, 2]

    // shuffled -> returns a new shuffled list, can be used with immutable lists
    val listToBeShuffled = listOf(1, 2, 3)
    val newShuffledList = listToBeShuffled.shuffled() // [2, 3, 1]

    // average -> returns 'double'
    val numberList = listOf(1, 2, 3)
    numberList.average() // 2.0


    // Adding / removing

    // + -> combine two lists(a new list will be created)
    val listToCombine1 = listOf(1, 2, 3)
    val listToCombine2 = listOf(4, 5, 6)

    val combinedList = listToCombine1 + listForAllList2 // [1, 2, 3, 4, 5, 6]

    // plus -> adds to the end of the list, creates a new list, used with immutable lists
    val listToPlus = listOf(1, 2, 3)
    listToPlus.plus(4) // 1, 2, 3, 4

    // minus -> deletes an element from the list with the passed value
    val listToMinus = listOf(3, 1, 2, 3)
    listToMinus.minus(3) // [1, 2, 3]

    // addAll(plusAssign) -> adds one collection to another
    val listToAdd = mutableListOf(1, 2, 3)
    val listToBeAdded = listOf(3, 2, 1)

    listToAdd.addAll(listToBeAdded) // [1, 2, 3, 3, 2, 1]

    // zip -> creates a map of two lists(if some list has more elements than another one,
    //        extra elements will be omitted)
    val valueList = listOf("One", "Two", "Three", "Four")
    val keyList = listOf(1, 2, 3)

    valueList.zip(keyList) // [(One, 1), (Two, 2), (Three, 3)]

    // joinToString -> joins the list elements to one string with passed separator(',' by defaultF)
    val listToJoin = listOf("Uno", "Dos", "Tres")
    listToJoin.joinToString() // Uno, Dos, Tres

}

data class Car(val model: String, val maxSpeed: Int, val carClass: String = "") {
}

class Collections {
}
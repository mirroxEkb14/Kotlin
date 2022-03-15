package Introduction.Tasks.YouTubeLessons

    /**
     *  Intersection of two arrays.
     *      Two arrays -> [1, 2, 3, 2, 0, 2, 2, 2] and [5, 1, 2, 7, 3, 2]
     *      Must be returned -> [1, 2, 2, 3] (order is not important)
     */

fun main() {
    val firstArray = intArrayOf(1, 2, 3, 2, 0, 2, 2, 2)
    val secondArray = intArrayOf(5, 1, 2, 7, 3, 2)

    println(getRepeatedIntersection1(firstArray, secondArray)) // [1, 2, 2, 3]
    println(getRepeatedIntersection2(firstArray, secondArray)) // [1, 2, 3, 2]
}

fun getRepeatedIntersection1(a1: IntArray, a2: IntArray): List<Int> {
    val s1 = a1.toSet()
    val s2 = a2.toSet()

    val result = mutableListOf<Int>()

    for (el in s1) {
        if (s2.contains(el)) {
            val numOfRepeats = minOf(a1.count { it == el }, a2.count { it == el })
            repeat(numOfRepeats) { result.add(el) }
        }
    }

    return result
}

fun getRepeatedIntersection2(firstArray: IntArray, secondArray: IntArray): List<Int> {
    val resultArray = mutableListOf<Int>()

    var indexForSecond = 0
    while (indexForSecond < secondArray.size) {

        var indexForFirst = 0
        while (indexForFirst < firstArray.size) {

            if (secondArray[indexForSecond] == firstArray[indexForFirst]) {
                resultArray.add(secondArray[indexForSecond])
                break
            }
            indexForFirst++
        }

        indexForSecond++
    }

    return resultArray
}

class RepeatedIntersection {
}
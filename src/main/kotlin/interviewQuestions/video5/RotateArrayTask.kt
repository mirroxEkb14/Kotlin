package interviewQuestions.video5

/**
 *  Given an array, rotate the array to the left by k steps,
 *  where k is non-negative
 */

fun main() {
    val arrayToRotate = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    val rotatedArray = arrayToRotate.leftShift(2)

    rotatedArray.forEach { print("$it ") } // 3 4 5 6 7 1 2 
}

fun IntArray.leftShift(k: Int): IntArray {
    val shiftedArray = this.copyOf()
    var rotateBy = k;

    if (rotateBy > size) rotateBy %= size

    forEachIndexed { index, value ->
        val shiftedIndex = (index + (size - rotateBy)) % size
        shiftedArray[shiftedIndex] = value
    }

    return shiftedArray
}
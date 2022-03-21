package interviewQuestions.video5

/**
 * Given an input string, reverse the string word by word
 */

fun main() {
    val inputString = "reverse words in a string"
    println(reverseString1(inputString))

    println(reverseString2(inputString))
}

fun reverseString2(stringToReverse: String) =
    stringToReverse
        .split(" ")
        .reversed()
        .joinToString(" ")

fun reverseString1(inputString: String): String {
    var result = ""
    val stringList = inputString.split(" ")
    for (i in stringList.size - 1 downTo 0) {
        result += "${stringList[i]} "
    }
    return result
}
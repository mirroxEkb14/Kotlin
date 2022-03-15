package Introduction.Tasks.YouTubeLessons

    /**
     *  There is a string -> "AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBB"
     *  Need to count letters and return a string-> "A4B3C2XYZD4E3F3A6B28"
     */

fun main() {
    val string = "AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBB"
    println(countLetters1(string))
    println(countLetters2(string))
}

fun countLetters2(string: String): String {
    var result = ""
    var currentLetter = string[0]
    var count = 1

    for (letter in string.substring(1)) {
        if (currentLetter == letter) {
            count++
        } else {
            if (count == 1)
                result += currentLetter
            else
                result += "$currentLetter$count"

            count = 1
            currentLetter = letter
        }
    }

    // for the last letters
    if (count == 1)
        result += currentLetter
    else
        result += "$currentLetter$count"

    return result
}

fun countLetters1(string: String): String {
    var result= ""

    var index = 0
    var counter = 1
    var flag = true
    while (index < string.length - 1) {
        if (string[index] == string[index + 1] && flag) {
            counter++

        } else {
            result += if (counter != 1) "${ string[index] }$counter"
                        else "${string[index]}"

            counter = 1

            if (index == string.length - 2) break
        }
        if (index == string.length - 2) flag = false
        else index++
    }

    return result
}


class CountLetters {
}
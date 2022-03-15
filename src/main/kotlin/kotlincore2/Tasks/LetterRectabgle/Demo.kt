package Introduction.Tasks.LetterRectabgle

/**
 * Find all the words from 'dictionary'
 * in 'rectangleRaw'
 */

const val rectangleRaw = """
    KOTE
    NULE
    AFIN
"""

const val dictionaryRaw = "Kotlin, fun, file, line, null, wow"

fun main() {
    val rectangle: List<String> = rectangleRaw.trimIndent().split("\n") // [KOTE, NULE, AFIN]
    val rectangleChars = getRectangleChars(rectangle)

    // '.toSet' -> in lookup operations 'Set' works quicker, plus, each word in the list is unique
    val dictionary = dictionaryRaw.toUpperCase().split(", ").toSet() // [KOTLIN, FUN, FILE, LINE, NULL]

    println(search(rectangleChars, dictionary)) // {true=[KOTLIN, FUN, FILE, LINE], false=[NULL, WOW]}
}

private fun search(rectangleChars: List<String>, dictionary: Set<String>): Map<Boolean, List<String>> {
    val occurrences = mutableListOf<String>()

    dictionary.forEach { dictionaryWord -> // "KOTLIN"
        val letters = arrayOfNulls<String>(dictionaryWord.length) // [null, null, null, null, null, null]
        var tempWord = ""

        do {
            rectangleChars.forEach { rectangleChar -> // "K"
                if (rectangleChar in dictionaryWord) { // "K" in "KOTLIN" ?
                    letters[dictionaryWord.indexOf(rectangleChar)] = rectangleChar // letters = [K, null, null, null, null, null]
                }
            }
            letters.forEach { letter -> tempWord += letter.toString() }
            if (tempWord == dictionaryWord) occurrences.add(tempWord)

        } while (letters.none {it != null})
    }

    val resultMap = mutableMapOf(true to mutableListOf<String>(), false to mutableListOf())

    for (i in dictionary.indices) {
        if (i < occurrences.size && dictionary.contains(occurrences[i])) resultMap[true]!!.add(occurrences[i])
        else resultMap[false]!!.add(dictionary.elementAt(i))
    }

    return resultMap
}

private fun getRectangleChars(rectangle: List<String>): List<String> {
    val tempList = mutableListOf<String>() // [K, O, T, E, N, U, L, E, A, F, I, N]

    rectangle.forEach { rectangleWord -> // KOTE
        rectangleWord.split("") // [, K, O, T, E, ]
            .forEach { char -> // "", "K", "O", "T", "E"
                if (char != "") tempList.add(char) // "K", "O", "T", "E"
            }
    }

    return tempList
}
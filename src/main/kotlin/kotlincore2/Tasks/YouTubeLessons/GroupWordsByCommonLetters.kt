package Introduction.Tasks.YouTubeLessons

    /**
     * Input -> ["eat", "tea", "tan", "ate", "nat", "bat"]
     * Output -> [ ["ate", "eat", "tea"], ["nat", "tan"], ["bat"] ]
     *
     * Group by common letters
     */

fun main() {
    val array = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")

    println(groupWords(array))
}

fun groupWords(words: Array<String>): List<List<String>> {
    val result: MutableList<List<String>> = mutableListOf()

    val map = mutableMapOf<String, MutableList<String>>()

    for (word in words) {
        val sortedWord = word.toCharArray().sorted().joinToString("")

        if (map.containsKey(sortedWord))
            map[sortedWord]?.add(word)
        else
            map[sortedWord] = mutableListOf(word)
    }

    for ((key, value) in map) {
        result.add(value)
    }

    return result
}

class GroupWordsByCommonLetters {
}
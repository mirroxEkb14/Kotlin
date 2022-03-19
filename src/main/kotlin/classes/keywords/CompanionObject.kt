package classes.keywords

/**
 * We do not need to create an instance of the
 * class to access the method. Like 'static' in Java
 *
 * 'companion object' can be only one in a class
 */

fun main() {
    NoteBook.showNotes()
}

class NoteBook {
    companion object {
        private var notes = "abc"

        fun showNotes() {
            println(notes)
        }
    }
}
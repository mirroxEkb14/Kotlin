package classes.keywords

/**
 * We do not need to create an instance of the
 * class to access the method. Like 'static' in Java
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
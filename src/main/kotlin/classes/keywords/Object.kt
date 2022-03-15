package classes.keywords

/**
 * It is a singleton object where we can store,
 * for example, some lists. We do not need to create
 * an instance of this class to access the variables
 * inside, like with the word 'static' in Java.
 * It has a lazy initialization.
 *
 * In Java we would need to create a class with
 * private constructor, create a 'getInstance' method
 */

fun main() {
    BookShelf.books.add(Book("Java", 250))
    BookShelf.books.add(Book("Kotlin", 400))
    BookShelf.books.add(Book("Sql", 100))

    BookShelf.showBooks()
}

object BookShelf {
    var books = arrayListOf<Book>()

    fun showBooks() {
        for (book in books) {
            println(book)
        }
    }
}

data class Book(val name: String, val price: Int)
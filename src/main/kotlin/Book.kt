import java.util.Scanner

class Book(val title: String, val author: String)

class BookStore {
    private val books = mutableListOf<Book>()

    fun addBook(book: Book) {
        books.add(book)
        println("${book.title} has been added to the library")
    }

    fun listBooks() {
        if(books.isEmpty()) {
            println("No books in the library")
        } else {
            books.forEach { println("Book title: ${it.title}, Author: ${it.author}") }
        }
    }

    fun findBook(title: String) {
        val book = books.find { it.title.lowercase() == title.lowercase() }
        if (book != null) {
            println("Found the book: ${book.title}, Author: ${book.author}")
        } else {
            println("Book not found")
        }
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    val bookStore = BookStore()

    loop@ while (true) {
        println("\n1. Add book")
        println("2. List all books")
        println("3. Find a book")
        println("4. Exit")
        print("Choose an option: ")

        when (scanner.nextInt()) {
            1 -> {
                print("Enter book title: ")
                val title = scanner.next()
                print("Enter author name: ")
                val author = scanner.next()
                bookStore.addBook(Book(title, author))
            }
            2 -> bookStore.listBooks()
            3 -> {
                print("Enter the book title to find: ")
                val title = scanner.next()
                bookStore.findBook(title)
            }
            4 -> break@loop
            else -> println("Invalid option, please choose between 1-4.")
        }
    }
    println("Thank you for using the book store app!")
}

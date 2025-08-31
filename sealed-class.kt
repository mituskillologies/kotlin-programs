sealed class Book () {
// sealed class declaration
    class Author : Book()  		// inner class-1
    class Publisher : Book() 	// inner class-2
}
fun main() {
    val obj : Book = Book.Author()
    val result = when (obj) {
        is Book.Author -> "Author is chosen"
        is Book.Publisher -> "Publisher is chosen"
    }
    println(result)
    
    val obj1 : Book = Book.Publisher()
    val result1 = when (obj1) {
        is Book.Author -> "Author is chosen"
        is Book.Publisher -> "Publisher is chosen"
    }
    println(result1)
}

data class Book ( val name : String, val pages: Int, var price: Float)
// data class declaration

fun main() {
	val book = Book("Python Programming", 236, 300.0f)	
    
    println("Book Name : ${book.name}")
    println("No. of Pages : ${book.pages}")
    println("Book Price : ${book.price}")
}

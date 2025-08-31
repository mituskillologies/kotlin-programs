data class Book ( val name : String, val pages: Int, var price: Float)
// data class declaration

fun main() {
	val book = Book("Python Programming", 236, 300.0f)	
   
    
    println("Data in class: " + book.toString())
}

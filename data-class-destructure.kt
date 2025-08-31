data class Book ( val name : String, val pages: Int, var price: Float)
// data class declaration

fun main() {
	val book = Book("Python Programming", 236, 300.0f)	
   
    val (name, pages, price) = book 
    
    println("Book Name : " + name)
    println("Book Pages: " + pages)
    println("Book Price: " + price)
}

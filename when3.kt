// Use of when statement
fun main() {
	var day = 10
    
    when(day) {
        1, 2, 3, 4, 5 -> println("Weekday")
        6, 7 -> println("Weekend")
        else -> println("Wrong!")
    }
}

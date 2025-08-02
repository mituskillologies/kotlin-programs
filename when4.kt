// Use of when statement
fun main() {
	var day = 4
    
    when(day) {
        in 1..5 -> println("Weekday")
        6, 7 -> println("Weekend")
        else -> println("Wrong!")
    }
}

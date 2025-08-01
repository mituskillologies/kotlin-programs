// Use of when statement
fun main() {
	var day = 9
    
    var day_of_week = when(day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Wrong!"
    }
    println("Day is :" + day_of_week)
}

// Unary Operators
fun main() {
	var num1 = +47    // Unary plus
	var num2 = -19    // Unary minus
	
	
	println("num1: " + num1 + ", num2: " + num2)
	num1++
	// num1 = num1 + 1
	// num1 += 1
	
	println("num1 upon increment: " + num1)
	
	num2--
	// num2 = num2 - 1
	// num2 -= 1
	
	println("num2 upon decrement: " + num2)
	
	println("num1 > num2 : " + !(num1 > num2))
}

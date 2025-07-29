// Logical Operators
fun main() {
	var num1 = 6    // 0110
	var num2 = 5	// 0101
	
	println("Bitwise AND-ing: " + (num1.and(num2)))  // 0100 = 4
	println("Bitwise OR-ing: " + (num1.or(num2)))
	println("Bitwise XOR-ing: " + (num1.xor(num2)))
	println("Bitwise Right Shift: " + (num1.shr(1)))   // 0011 = 3
	println("Bitwise Left Shift: " + (num2.shl(1)))  // 1010 = 10
}

// interface example
interface Data {
    var num : Int
    fun myFunction (): String   // abstract method / function
    fun show () {
        println("Hello World!")
    }
}
class Person : Data {
    override var num = 25
    override fun myFunction () = "Kotlin Application."
}
fun main() {
	var obj = Person()
    obj.show()
    println("Value is : ${obj.num}")
}

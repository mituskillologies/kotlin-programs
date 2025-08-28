// interface example
interface Data1 {
    var num : Int
    fun myFunction (): String   // abstract method / function
    fun show () {
        println("Hello World!")
    }
}
interface Data2 {
    var age : Int
}
class Person : Data1, Data2 {
    override var num = 25
    override var age = 30
    override fun myFunction () = "Kotlin Application."
}
fun main() {
	var obj = Person()
    obj.show()
    println("Value of num is : ${obj.num}")
    println("Value of age is : ${obj.age}")
}

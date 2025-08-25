// abstract class
abstract class Person {
    var name = "Amar"
    fun getName () {
        println(name)
    }
}
fun main() {
	var obj = Person() // This line will have an error.
    obj.getName()
}

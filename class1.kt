class Person {
    var name = "Tushar"
    fun show () {
        println("Name: " + name)
    }
}
fun main() {
    var obj1 = Person()
    obj1.name = "Raj"
    obj1.show()
    var obj2 = Person()
    obj2.name = "Priya"
    obj2.show()
}

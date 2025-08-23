// secondary construtor
class Person {
    var name: String
    var age: Int
    
    init {					// initializer block
        println("Class Object Created!")
    }
    constructor (n: String, a : Int) {
        this.name = n
        this.age = a
    }
    fun show () {
        println("Name: " + name + " Age:" + age)
    }
}
fun main() {
    var obj1 = Person("Ajay", 23)
    obj1.show()
    var obj2 = Person("Rani", 28)
    obj2.show()
}

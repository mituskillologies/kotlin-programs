class Person (val n: String, val a: Int){
    var name: String
    var age: Int
    
    init {					// initializer block
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
    var obj2 = Person("Rani", 19)
    obj2.show()
}

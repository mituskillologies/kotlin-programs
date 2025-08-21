class Person {
    var name
    var age
    fun show () {
        println("Name: " + name + "Age:" + age)
    }
    fun isEligible() {
        if(age > 18)
        	println("Eligible for driving")
        else
        	println("Not eligible for driving")
    }
}
fun main() {
    var obj1 = Person()
    obj1.name = "Raj"
    obj1.age = 45
    obj1.show()
	obj1.isEligible()
}

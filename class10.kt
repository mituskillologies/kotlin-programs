// Use of super and this keyword
open class Animal {
    open val name = "Tushar"
    open fun show () {
        println("My name:" + this.name)
    }
}
class Dog : Animal(){
	override val name = "Pune"
    override fun show () {
        super.show()
        println("My name:" + this.name)
        println("Super class name:" + super.name)
    }
}
fun main() {
	var obj = Dog()
    obj.show()
}

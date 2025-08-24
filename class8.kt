// Overriding properties
open class Animal {
    open val num = 45
    open fun sound () {
        println("Animal Makes Sound")
    }
}
class Dog : Animal(){
    override val num = 70
    override fun sound () {
        println("Dog barks!" + super.num)
    }
}
fun main() {
   var d = Dog()
   d.sound()
   println("Value of variable:" + d.num)
}

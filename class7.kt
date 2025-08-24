// Overriding functions
open class Animal {
    open fun sound () {
        println("Animal Makes Sound")
    }
}
class Dog : Animal(){
    override fun sound () {
        println("Dog barks!")
    }
}
fun main() {
   var d = Dog()
   d.sound()
   var a = Animal()
   a.sound()
}

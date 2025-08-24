open class A {       // super class
    fun show() {
        println("I am super class!")
    }  
}
class B : A () {    // sub class
    fun display() {
        println("I am sub class!")
    } 
}
fun main() {
 	var obj = B()
    obj.show()
    obj.display()
    var obj1 = A()
    obj1.show()
}

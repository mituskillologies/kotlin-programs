open class Example {
    protected val i = 10
    public fun show() {
        println("Hi! My value is " + i)
    }
}
class New : Example() {
    public fun display() {
        println("Hi! Value from super class " + i)
    }
}
fun main() {
   var obj = New()
   obj.show()
   obj.display()
   println("Value is " + obj.i) // shows an error
}

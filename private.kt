class Example {
    private val i = 10
    public fun show() {
        println("Hi! My value is " + i)
    }
}
fun main() {
   var obj = Example()
   obj.show()
   //println("Value is: " + obj.i) // This shows an error
}

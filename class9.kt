// Initialization of classes
open class Species {
    init {
        println("Species initiated!")
    }
}
open class Animal: Species() {
 	init {
        println("Animal initiated!")
    }
}
class Dog : Animal(){
	init {
        println("Dog initiated!")
    }
}
fun main() {
	var obj = Dog()
}

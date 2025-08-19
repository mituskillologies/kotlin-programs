fun main() {
   var set1 = setOf(45,65,23,45,76,87,23,57)
   println("Values are: " + set1)
   if(set1.contains(23))
   	println("Yes")
   else
    println("No")
    
   if(set1.isEmpty())
   	println("Yes")
   else
    println("No")
   println("Index of 87: " + set1.indexOf(87))
   var set2 = setOf(43,95,73,57,65)
   println("Addition: " + (set1 + set2))
   
   println("Sorted set: " + set1.sorted())
   println("Sorted set: " + set1.sortedDescending())
   println("Filtered set: " + set1.filter{ it > 50})
   println("Mapped set: " + set1.map{ it * 2})
}

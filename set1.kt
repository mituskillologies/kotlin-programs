fun main() {
   var set1 = setOf(45,65,23,45,76,87,23,57)
   println("Values are: " + set1)
   println("String: " + set1.toString())  // converts the set in string
   var itr = set1.asIterable().iterator()  // create an iterator object
   println("Value printed by while loop..")
   while(itr.hasNext()) {  // while loop for iteration
       var num = itr.next()
       if(num % 2 == 1)
       		println(num)   // print one by one value
   }
   println("Value printed by for loop..")
   for (i in set1.indices)
   	   println(set1.elementAt(i))
       
   println("Value printed by for each..")
   set1.forEach{ println(it)}
   println("Size of the set: " + set1.size)
   if (56 in set1)
       println("Present 56")
   else
       println("Absent 56")
}

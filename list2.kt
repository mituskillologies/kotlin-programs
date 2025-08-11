fun main() {

   var lst1 = listOf(56,23,17,65,78,89,"Pune")
   println("List-1: " + lst1)
   
   println("Element-1: " + lst1[0])
   var s = lst1.toString()
   println("List: " + s)
   
   var itr = lst1.listIterator()
   while(itr.hasNext()) {
       println("Element:" + itr.next())
   }
   
   for (i in lst1.indices) {
       println("Element:" + lst1[i])
   }
   
   lst1.forEach{ print(it)}
   println("\nTotal Elements:" + lst1.size)
   
   if (178 in lst1)
   		println("Yes")
   else
    	println("No")
}

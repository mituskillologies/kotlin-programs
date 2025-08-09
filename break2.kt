fun main() {

    outer@ for (i in 0..10) {           // Loop over a range from 0 to 10
        inner@ for (j in 0..5) {
        	println("First: "+i+" Second: "+j)
            if (j == 2)
            	break@outer
        }
    }
}

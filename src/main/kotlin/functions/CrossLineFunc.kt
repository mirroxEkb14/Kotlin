package functions

/**
 * When we have a 'crossline' keyword, we cannot 'return'
 * from the function that calls the method with 'crossline'
 * lambda
 *
 * so here, without a 'crossline' keyword we can write 'return'
 * and 'end...' will not be printed, but with it IDE will restrict
 * writing 'return'
 */

fun main() {
    multiplyByTwo(5) {
        println(it)
        // return
    }

    println("end...")
}

inline fun multiplyByTwo(i: Int, crossinline lambda: (result: Int) -> Unit) : Int {
    val result = i * 2
    lambda.invoke(result)
    return result
}
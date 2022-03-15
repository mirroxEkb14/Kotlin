fun main() {

    var a: String = "abc"
//    a = null // non-null type, NPE is out of the question
    a.length // can call 'String' methods directly


    var b: String? = "wasd"
    b = null // can be null
//    b.length // cannot call 'String' methods directly


    /* '!.' - safe call operator */
    b?.length // returns null if the value is null


    /* '?:' - Elvis operator */
    var l = b?.length ?: -1 // if 'b?.length' returns null, l = -1


    /* '!!' operator */
    b = if ((0..10).random() > 5) "asdf" else null
    val t = b!!.length // if returns null, NPE throws

}

class NullableTypes {
}
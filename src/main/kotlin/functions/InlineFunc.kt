package functions

/**
 * When the code below without 'inline' keyword is decompiled in Java code:
 *
   public final class ExtensionsKt {
    public static final void main() {
        int c = function(1, 2);
    }

    // $FF: synthetic method
    public static void main(String[] var0) {
        main();
    }

    public static final int function(int a, int b) {
        return a + b;
    }
   }
 *
 * With 'inline':
 *
    public static final void main() {
        byte a$iv = 1;
        int b$iv = 2;
        int $i$f$function = false;
        int var10000 = a$iv + b$iv;
    }

    // $FF: synthetic method
    public static void main(String[] var0) {
        main();
    }

    public static final int function(int a, int b) {
        int $i$f$function = 0;
        return a + b;
    }
 *
 * 'final main' method does not call 'function' method but inserted the code from that method.
 * It is done for a higher performance because less resources are used. But it increases the amout
 * of code due to inserts during compilation. It is usually used with lambda because lambda creates
 * an additional class for its implementation but with 'inline' this class is not created
 */

fun main() {
    val c = function(1, 2)
}

fun function(a: Int, b: Int) = a + b
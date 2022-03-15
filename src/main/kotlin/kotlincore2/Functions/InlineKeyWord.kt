package Introduction.Functions

/**
 * Decompiling Kotlin code in Java without 'inline',
 * we will get something like this:
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
 * Everything is the same as in Kotlin. With 'inline':
 *
    public final class ExtensionsKt {
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
    }
 *
 * 'main()' method does not call 'function()' method, instead, the code from
 * 'function()' just pasted in 'main()' what increases performance, on the
 * other hand, the volume of code increases, too
 *
 * 'inline' is used when you have lambda expressions because during decompilation
 * an additional class is created to execute lambda expression
 */

fun main() {
    val c = function(1, 2)
}

fun function(a: Int, b: Int) = a + b
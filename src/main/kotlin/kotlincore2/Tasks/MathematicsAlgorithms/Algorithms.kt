package Tasks.MathematicsAlgorithms

import kotlin.math.sqrt

fun main() {

}

// discriminant
fun discriminant(a: Double, b: Double, c: Double) = (b * b) - (4 * a * c)

// find one of the equation root
fun quadraticEquationRoot(a: Double, b: Double, c: Double) =
    (-b + sqrt(discriminant(a, b, c))) / (2 * a)

// find quadratic product
fun quadraticRootProduct(a: Double, b: Double, c: Double): Double {
    val sd = sqrt(discriminant(a, b, c))
    val x1 = (-b + sd) / (2 * a)
    val x2 = (-b - sd) / (2 * a)
    return x1 * x2
}
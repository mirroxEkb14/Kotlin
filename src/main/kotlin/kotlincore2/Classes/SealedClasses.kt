package Introduction.Classes

fun main() {
    val data = getData()
    when (data) {
        is Data.Success -> println(data)
        is Data.Error -> println(data)
        is Data.Loading -> println(data)
    }

    val fastCar = SealedCar.FastSealedCar()
    implementFastness(fastCar)
    val slowCar = SealedCar.SlowSealedCar()
    implementFastness(slowCar)

    println("Is fast car fast: ${ fastCar.isFast }") // true
    println("Is slow car fast: ${ slowCar.isFast }") // false
}

sealed class SealedCar {
    class FastSealedCar(var isFast: Boolean = false) : SealedCar()
    class SlowSealedCar(var isFast: Boolean = false) : SealedCar()
}

fun implementFastness(car: SealedCar) {
    when (car) {
        is SealedCar.FastSealedCar -> car.isFast = true
        is SealedCar.SlowSealedCar -> car.isFast = false
    }
}

fun getData() : Data {
    return Data.Error((100..1000).random().toString())
}

sealed class Data {
    data class Success(val data: String) : Data()
    data class Error(val error: String) : Data()
    object Loading : Data()
}

class SealedClasses {
}
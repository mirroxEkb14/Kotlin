package classes

lateinit var volume: Volume

fun main() {
    println("----\nTurn the volume level to:\nlow, medium, high\n----")
    changeVolume()
}

// take user input and output volume the user specified
private fun changeVolume() {
    val volumeLevel = readLine()

    volume = when {
        volumeLevel!!.contains("low", true) -> Volume.Low("Low")
        volumeLevel.contains("medium", true) -> Volume.Medium("Medium")
        else -> Volume.High("high")
    }

    eval(volume)

    println("----\nTo adjust it type:\nhigh, medium, low\n----")
    changeVolume() // recursion
}

// this sealed class holds three states of beings for speakers
// we can pass a constructor to the classes that can take different types
sealed class Volume {
    class Low(var message: String): Volume()
    class Medium(var message: String): Volume()
    class High(var message: String): Volume()
}

// there is an advantage of using 'when' statement (no need in 'else' block)
fun eval(volume: Volume) = when (volume) {
    is Volume.Low -> println("Volume is set to low -> ${volume.message}")
    is Volume.Medium -> println("Volume is set to medium -> ${volume.message}")
    is Volume.High -> println("Volume is set to high -> ${volume.message}")
}